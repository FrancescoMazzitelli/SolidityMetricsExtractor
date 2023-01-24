pragma solidity ^0.4.13;

contract ERC20 {
  function balanceOf(address who) constant returns (uint);
  function allowance(address owner, address spender) constant returns (uint);

  function transfer(address to, uint value) returns (bool ok);
  function transferFrom(address from, address to, uint value) returns (bool ok);
  function approve(address spender, uint value) returns (bool ok);
  event Transfer(address indexed from, address indexed to, uint value);
  event Approval(address indexed owner, address indexed spender, uint value);
}

//?????????? ?????????????? ??????????
contract SafeMath {
  function safeMul(uint a, uint b) internal returns (uint) {
    uint c = a * b;
    assert(a == 0 || c / a == b);
    return c;
  }

  function safeDiv(uint a, uint b) internal returns (uint) {
    assert(b > 0);
    uint c = a / b;
    assert(a == b * c + a % b);
    return c;
  }

  function safeSub(uint a, uint b) internal returns (uint) {
    assert(b <= a);
    return a - b;
  }

  function safeAdd(uint a, uint b) internal returns (uint) {
    uint c = a + b;
    assert(c>=a && c>=b);
    return c;
  }

  function max64(uint64 a, uint64 b) internal constant returns (uint64) {
    return a >= b ? a : b;
  }

  function min64(uint64 a, uint64 b) internal constant returns (uint64) {
    return a < b ? a : b;
  }

  function max256(uint256 a, uint256 b) internal constant returns (uint256) {
    return a >= b ? a : b;
  }

  function min256(uint256 a, uint256 b) internal constant returns (uint256) {
    return a < b ? a : b;
  }

}

contract StandardToken is ERC20, SafeMath {

  /* Token supply got increased and a new owner received these tokens */
  event Minted(address receiver, uint amount);

  /* Actual balances of token holders */
  mapping(address => uint) balances;

  /* approve() allowances */
  mapping (address => mapping (address => uint)) allowed;

  /* Interface declaration */
  function isToken() public constant returns (bool Yes) {
    return true;
  }

  function transfer(address _to, uint _value) returns (bool success) {
    balances[msg.sender] = safeSub(balances[msg.sender], _value);
    balances[_to] = safeAdd(balances[_to], _value);
    Transfer(msg.sender, _to, _value);
    return true;
  }

  function transferFrom(address _from, address _to, uint _value) returns (bool success) {
    uint _allowance = allowed[_from][msg.sender];

    balances[_to] = safeAdd(balances[_to], _value);
    balances[_from] = safeSub(balances[_from], _value);
    allowed[_from][msg.sender] = safeSub(_allowance, _value);
    Transfer(_from, _to, _value);
    return true;
  }

  function balanceOf(address _address) constant returns (uint balance) {
    return balances[_address];
  }

  function approve(address _spender, uint _value) returns (bool success) {

    // To change the approve amount you first have to reduce the addresses`
    //  allowance to zero by calling `approve(_spender, 0)` if it is not
    //  already 0 to mitigate the race condition described here:
    //  https://github.com/ethereum/EIPs/issues/20#issuecomment-263524729
    require((_value == 0) || (allowed[msg.sender][_spender] == 0));

    allowed[msg.sender][_spender] = _value;
    Approval(msg.sender, _spender, _value);
    return true;
  }

  function allowance(address _owner, address _spender) constant returns (uint remaining) {
    return allowed[_owner][_spender];
  }

}

contract DESToken is StandardToken {

    string public name = "Decentralized Escrow Service";
    string public symbol = "DES";
    uint public decimals = 18;//??????????? ??????
	uint public HardCapEthereum = 66666000000000000000000 wei;//???????????? ?????????? ?????????? Ethereum - 66 666 ETH (?????? ? wei)
    
    //?????? ? ????????????? ????????, ??????? ????????? ??????????? ???????? ???????
    mapping (address => bool) public noTransfer;
	
	// ????? ?????? ICO ? ????? ????????? ICO
	uint constant public TimeStart = 1511956800;//????????? - ????? ?????? ICO - 29.11.2017 ? 15:00 ?? ???
	uint public TimeEnd = 1514375999;//????? ????????? ICO - 27.12.2017 ? 14:59:59 ?? ???
	
	// ????? ????????? ???????? ?????? (??????)
	uint public TimeWeekOne = 1512561600;//1000 DES � ????????? ???? � 1-?? ??????
	uint public TimeWeekTwo = 1513166400;//800 DES � 2-?? ??????
	uint public TimeWeekThree = 1513771200;//666,666 DES � 3-?? ??????
    
	uint public TimeTransferAllowed = 1516967999;//???????? ??????? ????????? ????? ????? (30 ????? = 2592000 ??????) ????? ICO
	
	//???? ICO (????????? ????? ?????? ?? ?????: ?????? ????????? ????? ???????????? ??????? ?? ????????????? ???????)
	uint public PoolPreICO = 0;//??????? ? ?? ????????? ???? ????? ????????, ?? ??????? ???????? DEST ??? DESP ? ??? ?? ???? ????? ???????? ?????? DES ? ????? ?? ?????????? + ??? 50%
	uint public PoolICO = 0;//??? ICO - ????? ?? ????? ????? 1 ?????
	uint public PoolTeam = 0;//??? ??????? - ????? ?? ????? ????? 1 ?????. 15%
	uint public PoolAdvisors = 0;//??? ?????????? - ????? ?? ????? ????? 1 ?????. 7%
	uint public PoolBounty = 0;//??? ?????? ???????? - ????? ?? ????? ????? 1 ?????. 3%
	    
	//????????? ??????? ?? ????????? ??????
	uint public PriceWeekOne = 1000000000000000 wei;//????????? ?????? ?? ????? ?????? 1
	uint public PriceWeekTwo = 1250000000000000 wei;//????????? ?????? ?? ????? ?????? 2
	uint public PriceWeekThree = 1500000000000000 wei;//????????? ?????? ?? ????? ?????? 3
	uint public PriceWeekFour = 1750000000000000 wei;//????????? ?????? ?? ????? ?????? 4
	uint public PriceManual = 0 wei;//????????? ??????, ????????????? ???????
	
	//??????????? ?????????? ????????? ICO
    bool public ICOPaused = false; //?????????? ????? ???????????? ?????? ???????? (true), ????? ????????????? ICO ?? ?????????????? ????
    bool public ICOFinished = false; //ICO ???? ?????????
	
    //??????????? ?????????? ??? ???????? ?????? ??????????
	uint public StatsEthereumRaised = 0 wei;//?????????? ???????? ? ???? ?????????? ?????????? Ethereum
	uint public StatsTotalSupply = 0;//????? ?????????? ?????????? ???????

    //???????
    event Buy(address indexed sender, uint eth, uint fbt);//??????? ???????
    event TokensSent(address indexed to, uint value);//?????? ?????????? ?? ?????
    event ContributionReceived(address indexed to, uint value);//???????? ????????
    event PriceChanged(string _text, uint _tokenPrice);//????????? ?????? ??????????? ???????
    event TimeEndChanged(string _text, uint _timeEnd);//????? ????????? ICO ???????? ???????
    event TimeTransferAllowanceChanged(string _text, uint _timeAllowance);//?????, ?? ???????? ????????? ???????? ???????, ???????? ???????
//    event HardCapChanged(string _text, uint _HardCapEthereum);//????????? ???????????? ?????????????, ????? ??????? ICO ????????? ???????????
    
    address public owner = 0x0;//???????????????? ???????? 0xE7F7d6cBCdC1fE78F938Bfaca6eA49604cB58D33
    address public wallet = 0x0;//??????? ????? ??????? 0x51559efc1acc15bcafc7e0c2fb440848c136a46b
 
function DESToken(address _owner, address _wallet) payable {
        
      owner = _owner;
      wallet = _wallet;
    
      balances[owner] = 0;
      balances[wallet] = 0;
    }
    
    modifier onlyOwner() {
        require(msg.sender == owner);
        _;
    }

	//?????????????? ?? ICO ??? ????????
    modifier isActive() {
        require(!ICOPaused);
        _;
    }

    //?????????? ???????? - ????????? ??????? ???????
    function() payable {
        buy();
    }
    
    //????????? ????????? ?????? ???????. ???? ???????? ?????? 0, ?????? ????????? ?? ????????????? ??????? ????
    function setTokenPrice(uint _tokenPrice) external onlyOwner {
        PriceManual = _tokenPrice;
        PriceChanged("New price is ", _tokenPrice);
    }
    
    //????????? ??????? ????????? ICO
    function setTimeEnd(uint _timeEnd) external onlyOwner {
        TimeEnd = _timeEnd;
        TimeEndChanged("New ICO End Time is ", _timeEnd);
    }
    
    //????????? ???????????? ?????????????, ????? ??????? ICO ????????? ???????????
//    function setHardCap(uint _HardCapEthereum) external onlyOwner {
//        HardCapEthereum = _HardCapEthereum;
//        HardCapChanged("New ICO Hard Cap is ", _HardCapEthereum);
//    }
     
    //????????? ???????, ?? ???????? ????????? ???????? ???????
    function setTimeTransferAllowance(uint _timeAllowance) external onlyOwner {
        TimeTransferAllowed = _timeAllowance;
        TimeTransferAllowanceChanged("Token transfers will be allowed at ", _timeAllowance);
    }
    
    // ????????? ????????????? ?????????? ???????????? ???????? ??? ???????
    // @???????? target ????? ??????????, ?? ??????? ?????????? ??????
    // @???????? allow ?????????? ?????? (true) ??? ?????? ???? (false)
    function disallowTransfer(address target, bool disallow) external onlyOwner {
        noTransfer[target] = disallow;
    }
    
    //????????? ICO ? ??????? ???? ??????? (???????, ??????, ?????????)
    function finishCrowdsale() external onlyOwner returns (bool) {
        if (ICOFinished == false) {
            
            PoolTeam = StatsTotalSupply*15/100;//??? ??????? - ????? ?? ????? ????? 1 ?????. 15%
            PoolAdvisors = StatsTotalSupply*7/100;//??? ?????????? - ????? ?? ????? ????? 1 ?????. 7%
            PoolBounty = StatsTotalSupply*3/100;//??? ?????? ???????? - ????? ?? ????? ????? 1 ?????. 3%
            
            uint poolTokens = 0;
            poolTokens = safeAdd(poolTokens,PoolTeam);
            poolTokens = safeAdd(poolTokens,PoolAdvisors);
            poolTokens = safeAdd(poolTokens,PoolBounty);
            
            //????????? ?? ???? ?????????? ?????? ???? ???????, ?????????? ? ??????
            require(poolTokens>0);//?????????? ??????? ?????? ???? ?????? 0
            balances[owner] = safeAdd(balances[owner], poolTokens);
            StatsTotalSupply = safeAdd(StatsTotalSupply, poolTokens);//????????? ????? ?????????? ?????????? ???????
            Transfer(0, this, poolTokens);
            Transfer(this, owner, poolTokens);
                        
            ICOFinished = true;//ICO ?????????
            
            }
        }

    //??????? ?????????? ??????? ????????? ? wei 1 ??????
    function price() constant returns (uint) {
        if(PriceManual > 0){return PriceManual;}
        if(now >= TimeStart && now < TimeWeekOne){return PriceWeekOne;}
        if(now >= TimeWeekOne && now < TimeWeekTwo){return PriceWeekTwo;}
        if(now >= TimeWeekTwo && now < TimeWeekThree){return PriceWeekThree;}
        if(now >= TimeWeekThree){return PriceWeekFour;}
    }
    
    // ??????? `amount` ??????? ? ????????? ?? `target`
    // @???????? target ????? ?????????? ???????
    // @???????? amount ?????????? ??????????? ???????
    function sendPreICOTokens(address target, uint amount) onlyOwner external {
        
        require(amount>0);//?????????? ??????? ?????? ???? ?????? 0
        balances[target] = safeAdd(balances[target], amount);
        StatsTotalSupply = safeAdd(StatsTotalSupply, amount);//????????? ????? ?????????? ?????????? ???????
        Transfer(0, this, amount);
        Transfer(this, target, amount);
        
        PoolPreICO = safeAdd(PoolPreICO,amount);//????????? ????? ?????????? ??????? ? ???? Pre-ICO
    }
    
    // ??????? `amount` ??????? ? ????????? ?? `target`
    // @???????? target ????? ?????????? ???????
    // @???????? amount ?????????? ??????????? ???????
    function sendICOTokens(address target, uint amount) onlyOwner external {
        
        require(amount>0);//?????????? ??????? ?????? ???? ?????? 0
        balances[target] = safeAdd(balances[target], amount);
        StatsTotalSupply = safeAdd(StatsTotalSupply, amount);//????????? ????? ?????????? ?????????? ???????
        Transfer(0, this, amount);
        Transfer(this, target, amount);
        
        PoolICO = safeAdd(PoolICO,amount);//????????? ????? ?????????? ??????? ? ???? Pre-ICO
    }
    
    // ??????????? `amount` ????????? ??????? ?? ????? `target` ?? ????? ?????????? (??????????????) ????? ?????????? ICO
    // @???????? target ????? ?????????? ???????
    // @???????? amount ?????????? ????????????? ???????
    function sendTeamTokens(address target, uint amount) onlyOwner external {
        
        require(ICOFinished);//???????? ?????? ????? ?????????? ICO
        require(amount>0);//?????????? ??????? ?????? ???? ?????? 0
        require(amount>=PoolTeam);//?????????? ??????? ?????? ???? ?????? ??? ????? ??????? ???? ???????
        require(balances[owner]>=PoolTeam);//?????????? ??????? ?????? ???? ?????? ??? ????? ??????? ??????????
        
        balances[owner] = safeSub(balances[owner], amount);//???????? ?????? ? ?????????????? (??????????)
        balances[target] = safeAdd(balances[target], amount);//????????? ?????? ?? ???? ??????????
        PoolTeam = safeSub(PoolTeam, amount);//????????? ????? ?????????? ??????? ???? ???????
        TokensSent(target, amount);//????????? ??????? ? ????????
        Transfer(owner, target, amount);//???????????? ???????
        
        noTransfer[target] = true;//?????? ?????????? ? ???? ?????????, ??????? 1 ????? ????? ICO ????????? ???????????? ???????? ???????
    }
    
    // ??????????? `amount` ??????? ?????????? ?? ????? `target` ?? ????? ?????????? (??????????????) ????? ?????????? ICO
    // @???????? target ????? ?????????? ???????
    // @???????? amount ?????????? ????????????? ???????
    function sendAdvisorsTokens(address target, uint amount) onlyOwner external {
        
        require(ICOFinished);//???????? ?????? ????? ?????????? ICO
        require(amount>0);//?????????? ??????? ?????? ???? ?????? 0
        require(amount>=PoolAdvisors);//?????????? ??????? ?????? ???? ?????? ??? ????? ??????? ???? ??????????
        require(balances[owner]>=PoolAdvisors);//?????????? ??????? ?????? ???? ?????? ??? ????? ??????? ??????????
        
        balances[owner] = safeSub(balances[owner], amount);//???????? ?????? ? ?????????????? (??????????)
        balances[target] = safeAdd(balances[target], amount);//????????? ?????? ?? ???? ??????????
        PoolAdvisors = safeSub(PoolAdvisors, amount);//????????? ????? ?????????? ??????? ???? ??????????
        TokensSent(target, amount);//????????? ??????? ? ????????
        Transfer(owner, target, amount);//???????????? ???????
        
        noTransfer[target] = true;//?????? ?????????? ? ???? ?????????, ??????? 1 ????? ????? ICO ????????? ???????????? ???????? ???????
    }
    
    // ??????????? `amount` ?????? ??????? ?? ????? `target` ?? ????? ?????????? (??????????????) ????? ?????????? ICO
    // @???????? target ????? ?????????? ???????
    // @???????? amount ?????????? ????????????? ???????
    function sendBountyTokens(address target, uint amount) onlyOwner external {
        
        require(ICOFinished);//???????? ?????? ????? ?????????? ICO
        require(amount>0);//?????????? ??????? ?????? ???? ?????? 0
        require(amount>=PoolBounty);//?????????? ??????? ?????? ???? ?????? ??? ????? ??????? ???? ??????
        require(balances[owner]>=PoolBounty);//?????????? ??????? ?????? ???? ?????? ??? ????? ??????? ??????????
        
        balances[owner] = safeSub(balances[owner], amount);//???????? ?????? ? ?????????????? (??????????)
        balances[target] = safeAdd(balances[target], amount);//????????? ?????? ?? ???? ??????????
        PoolBounty = safeSub(PoolBounty, amount);//????????? ????? ?????????? ??????? ???? ??????
        TokensSent(target, amount);//????????? ??????? ? ????????
        Transfer(owner, target, amount);//???????????? ???????
        
        noTransfer[target] = true;//?????? ?????????? ? ???? ?????????, ??????? 1 ????? ????? ICO ????????? ???????????? ???????? ???????
    }

    //??????? ??????? ??????? ?? ICO
    function buy() public payable returns(bool) {

        require(msg.sender != owner);//?????????? ?? ????? ???????? ??????
        require(msg.sender != wallet);//?????????? ?? ????? ???????? ??????
        require(!ICOPaused);//??????? ?????????, ???? ICO ?? ??????????????
        require(!ICOFinished);//??????? ?????????, ???? ICO ?? ?????????
        require(msg.value >= price());//?????????? ????? ? wei ?????? ???? ?????? ????????? 1 ??????
        require(now >= TimeStart);//??????? ??????? - ICO ????????
        require(now <= TimeEnd);//??????? ??????? - ICO ?? ?????????
        uint tokens = msg.value/price();//?????????? ???????, ??????? ?????? ???????? ??????????
        require(safeAdd(StatsEthereumRaised, msg.value) <= HardCapEthereum);//????????? ???? ?? ?????? hard cap
        
        require(tokens>0);//?????????? ??????? ?????? ???? ?????? 0
        
        wallet.transfer(msg.value);//????????? ?????????? ETH ?? ??????? ????? ???????
        
        //?????????? ??????? ?? ???? ??????????
        balances[msg.sender] = safeAdd(balances[msg.sender], tokens);
        StatsTotalSupply = safeAdd(StatsTotalSupply, tokens);//????????? ????? ?????????? ?????????? ???????
        Transfer(0, this, tokens);
        Transfer(this, msg.sender, tokens);
        
        StatsEthereumRaised = safeAdd(StatsEthereumRaised, msg.value);//????????? ????? ????????? ETH
        PoolICO = safeAdd(PoolICO, tokens);//????????? ?????? ???? ICO
        
        //?????????? ??????? ? ????????
        Buy(msg.sender, msg.value, tokens);
        TokensSent(msg.sender, tokens);
        ContributionReceived(msg.sender, msg.value);

        return true;
    }
    
    function EventEmergencyStop() onlyOwner() {ICOPaused = true;}//?????????? ICO (? ?????? ?????????????? ?????????????)
    function EventEmergencyContinue() onlyOwner() {ICOPaused = false;}//?????????? ICO

    //???? ???????? ??????? ??? ???? ?????????? ??? ?? ????????? (1 ????? ????? ICO), ?????????, ???????? ?? ??? Pre-ICO. ???? ???, ????????? ???????
    function transfer(address _to, uint _value) isActive() returns (bool success) {
        
    if(now >= TimeTransferAllowed){
        if(noTransfer[msg.sender]){noTransfer[msg.sender] = false;}//???? ???????? ????????? ?? ???????, ????????? ?? ???????????
    }
        
    if(now < TimeTransferAllowed){require(!noTransfer[msg.sender]);}//???? ???????? ??? ?? ????????? ?? ???????, ?????????? ????? ?????? ????????? Pre-ICO
        
    return super.transfer(_to, _value);
    }
    /**
     * ERC 20 Standard Token interface transfer function
     *
     * Prevent transfers until halt period is over.
     */
    function transferFrom(address _from, address _to, uint _value) isActive() returns (bool success) {
        
    if(now >= TimeTransferAllowed){
        if(noTransfer[msg.sender]){noTransfer[msg.sender] = false;}//???? ???????? ????????? ?? ???????, ????????? ?? ???????????
    }
        
    if(now < TimeTransferAllowed){require(!noTransfer[msg.sender]);}//???? ???????? ??? ?? ????????? ?? ???????, ?????????? ????? ?????? ????????? Pre-ICO
        
        return super.transferFrom(_from, _to, _value);
    }

    //??????? ?????????
    function changeOwner(address _to) onlyOwner() {
        balances[_to] = balances[owner];
        balances[owner] = 0;
        owner = _to;
    }

    //??????? ????? ???????? ??? ????? ???????
    function changeWallet(address _to) onlyOwner() {
        balances[_to] = balances[wallet];
        balances[wallet] = 0;
        wallet = _to;
    }
}