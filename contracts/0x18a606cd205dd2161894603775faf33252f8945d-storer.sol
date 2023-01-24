pragma solidity ^0.4.2;
/*'pragma' indique au compileur dans quelle version de Solidity ce code est �crit */
contract storer {
/*'contract' indique le d�but du contrat a proprement parler 'contract' est similaire
� 'class' dans d'autres langages (class variables, inheritance, etc.)*/
address public owner;
string public log;
/* 29979245621189875516790
function storer() {
    owner = msg.sender ;
}
/* 'storer' est une fonction un peu particuli�re, il s'agit du constructeur du contrat.
Cette fonction s'ex�cute une seule fois au moment de la cr�ation du contrat.
La cr�ation du contrat est une transaction et comme toute transaction elle est
repr�sent�e en Solidity par "msg", "msg.sender" correspond  � l'adresse qui
�met cette transaction.  
A la cr�ation du contrat la variable owner re�oit l'adresse qui a d�ploy� le
contrat */
modifier onlyOwner {
        if (msg.sender != owner)
            throw;
        _;
    }
/* le 'modifier' permet de poser des conditions � l'ex�cution des fonctions.
Ici, 'onlyOwner' sera ajout� � la syntaxe des fonctions que l'on
veut r�server au 'owner'. Le modifier teste la condion msg.sender != owner
si le requ�teur de la fonction n'est pas le owner alors l'ex�cution
s'interrompt, c'est le sens du 'throw'; s'il s'agit bien du owner alors
la fonction s'ex�cute. Notez le '_' underscore apr�s le test, il signifie
� la fonction de continuer son ex�cution.*/    
function store(string _log) onlyOwner() {
    log = _log;
}
/*La fonction 'store' re�oit une cha�ne de caract�res qu'elle associe � une
variable d'�tat '_log'. Cette fonction n'est utilisable que par l'adresse qui
est 'owner', si c'est bien cette adresse qui fait la requ�te alors la variable
'log' devient '_log'.*/
function kill() onlyOwner() {
  selfdestruct(owner); }
/* Cette derni�re fonction permet de "nettoyer" la blockchain en supprimant le
contrat. Il est important de la faire figurer pour lib�rer de l'espace sur
la blockchain mais aussi pour supprimer un contrat bugg�. En pr�cisant une
adresse selfdestruct(address), tous les ethers stock�s par le contrat y sont
envoy�s. Attention si une transaction envoie des ethers � un contrat qui s'est
"selfdestruct" ces ethers seront perdus*/
}