# Sistema Bancário em Java

Este projeto é uma simulação básica de um sistema bancário desenvolvido em Java, com funcionalidades essenciais como criação de contas bancárias, depósitos, saques, transferências via PIX, criação de investimentos e acompanhamento do histórico de transações.

## Estrutura do Projeto

src/  
├── Main.java              (classe principal para execução)  
└── models/  
  ├── Banco.java         (classe que gerencia múltiplas contas)  
  ├── Conta.java         (classe que representa a conta bancária)  
  └── Transacao.java     (classe que registra cada transação realizada)

## Como usar

1. Clone o repositório:  
`git clone https://github.com/VicFreyre/SYS-bancario-POO-JAVA.git`

2. Navegue até a pasta src:  
`cd SEU_REPOSITORIO/src`

3. Compile os arquivos:  
`javac models/*.java Main.java`

4. Execute o programa:  
`java Main`

## Funcionalidades

- Criar contas com nome e CPF  
- Depositar valores nas contas  
- Sacar valores, respeitando saldo disponível  
- Transferir valores entre contas via PIX  
- Investir valores da conta  
- Exibir extrato detalhado de todas as transações e saldo atual

## Requisitos

Java JDK 8 ou superior

________________________________

Projeto para conclusão de Bootcampo NTT JAVA DIO