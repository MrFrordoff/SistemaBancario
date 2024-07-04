Banco - Sistema de Transações Bancárias
Descrição
Este projeto é uma simulação de um sistema bancário simples em Java, utilizando threads para representar as interações entre clientes, lojas e funcionários. Cada cliente pode realizar compras em duas lojas diferentes, enquanto as lojas pagam seus funcionários com base nos valores recebidos.

Estrutura do Projeto
O projeto é dividido nas seguintes classes principais:

Banco: Responsável por realizar transações entre clientes e lojas.
Cliente: Representa um cliente que realiza compras em duas lojas.
Conta: Representa uma conta bancária com métodos para depósito e saque.
Funcionario: Representa um funcionário que recebe um salário e investe parte dele.
Loja: Representa uma loja que recebe pagamentos dos clientes e paga seus funcionários.
Main: Classe principal que inicializa e executa o sistema.
Funcionalidades
Banco
A classe Banco possui o método realizarCompra que é sincronizado para garantir que as transações sejam executadas de forma segura. Quando um cliente realiza uma compra, o valor é deduzido de sua conta e adicionado à conta da loja.

Cliente
A classe Cliente estende Thread e representa um cliente que realiza compras em duas lojas diferentes. O método run simula o cliente realizando compras aleatórias até que seu saldo se esgote.

Conta
A classe Conta possui métodos sincronizados para depósito e saque, garantindo que as operações sejam realizadas de forma segura em um ambiente multithread. A conta armazena o saldo e o titular da conta.

Funcionario
A classe Funcionario estende Thread e representa um funcionário que recebe um salário e investe uma parte dele. Os funcionários são pagos pelas lojas em que trabalham.

Loja
A classe Loja representa uma loja que recebe pagamentos dos clientes e paga seus funcionários. A loja possui uma conta para gerenciar seu saldo e métodos para receber pagamentos e pagar salários.

Main
A classe Main inicializa e executa o sistema. Ela cria instâncias de Banco, Cliente, Conta, Funcionario e Loja, e inicia as threads dos clientes.

Execução
Para executar o projeto, compile e execute a classe Main. Ela inicializa os objetos necessários e inicia as threads dos clientes. Após a execução, o saldo final das lojas e dos funcionários será exibido no console.

Exemplo de Saída
plaintext
Copiar código
Cliente1 sacou: R$ 200.0
Cliente2 sacou: R$ 100.0
Cliente3 sacou: R$ 200.0
Cliente4 sacou: R$ 100.0
Cliente5 sacou: R$ 200.0
...
Saldo final da loja1: R$ 600.0
Saldo final da loja2: R$ 400.0
Saldo final dos funcionários:
Funcionario1 - Salário: R$ 1400.0
Funcionario2 - Salário: R$ 1400.0
Funcionario3 - Salário: R$ 1400.0
Funcionario4 - Salário: R$ 1400.0
Requisitos
Java 17 ou superior
Compilação e Execução
Para compilar e executar o projeto, siga os passos abaixo:

Compile todas as classes:

bash
Copiar código
javac banco/*.java
Execute a classe principal:

bash
Copiar código
java banco.Main
Contribuição

