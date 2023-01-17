<p align= "center">
<img src="https://www.unisannio.it/sites/default/files/emblema.png.pagespeed.ce.L9uvAVRynq.png" alt="Unisannio" width= 30%>
</p>
<p align="center">
    Tools utilizzati nel progetto
</p>
<p align="center">
    <img src="https://img.shields.io/badge/ANTLR-v4.7.1-blue" alt="Python">
    <img src = "https://img.shields.io/badge/Java-16.0.1-blue">
    <img src="https://img.shields.io/badge/Unisannio-Linguaggi%20di%20programmazione%20e%20Compilatori-blue" alt="Unisannio">
    <img src = "https://img.shields.io/badge/Eclipse-IDE-blue">
    <img src = "https://img.shields.io/badge/Apache-Maven-blue">


# Progetto Linguaggi di programmazione e compilatori - Magistrale 2022

Componenti del gruppo:
- Francesco Cosimo Mazzitelli
- Jessica Cinelli
- Francesco Saccone

## Requisiti
Per poter eseguire l'applicazione è necessario:
- Scaricare e installare Java, Maven, qualsiasi IDE che supporti i plugin di ANTLR

## Descrizione del progetto
Il seguente progetto prevede la costruzione di un'applicazione in grado di estrarre delle metriche di analisi da un qualsiasi programma realizzato con linguaggio di programmazione Solidity. Quest'ultimo, largamente utilizzato sulla piattaforma Ethereum, consente di realizzare degli automatismi che portano alla definizione di "Smart contracts". Gli Smart Contracts sono dei "contratti" informatici che seguono la logica di programmazione if-then-else, utilizzati nelle blockchain.

La prima operazione svolta è stata la generazione della grammatica associata al linguaggio di programmazione Solidity. Durante questa fase iniziale è stata largamente utilizzata la documentazione di Solidity, consultabile al seguente [link](https://docs.soliditylang.org/en/v0.8.14/index.html).

Tramite il Tool ANTLRv4.7.1.jar, presente nella directory di progetto, sono state generate le classi necessarie a partire dalla grammatica conservata nel file Solidity.g4. Per una più approfondita analisi delle classi autogenerate e per lo sviluppo dell'applicazione è stata utilizzata la documentazione di ANTLR trovata sul sito ufficiale della Java documentation, con riferimento al package [org.antlr.v4.runtime](https://www.antlr.org/api/Java/org/antlr/v4/runtime/package-summary.html).

## Visitors
I visitors sono le componenti software utilizzate per l'estrazione delle metriche di qualità. Essi effettuano visite all'AST e tramite la esplorazione estraggono le metriche che vengono poi salvate su un file CSV chiamato metrics.csv reperibile nella cartella OUTPUT
