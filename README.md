# Simulação de Sistema Bancário

Este projeto simula um sistema bancário básico com múltiplas entidades como clientes, lojas, funcionários e contas. Utiliza threads em Java para gerenciar transações concorrentes e interações entre essas entidades.

## Estrutura

O projeto é composto por várias classes Java:

- **Main.java**: Contém o método principal para inicializar e executar a simulação.
- **Conta.java**: Representa uma conta bancária com métodos para depósito, saque e verificação de saldo.
- **Cliente.java**: Estende a classe Thread para simular o comportamento do cliente, incluindo compras em lojas.
- **Funcionario.java**: Estende a classe Thread representando funcionários com contas de salário e investimento.
- **Loja.java**: Representa lojas onde ocorrem transações, gerenciando pagamentos e salários dos funcionários.
- **Banco.java**: Gerencia transações entre clientes e lojas.

## Uso

Para executar a simulação, execute a classe `Main.java`. Ela inicializa um banco, lojas, funcionários e clientes, simulando transações até que os saldos dos clientes se esgotem. Após a conclusão da simulação, imprime os saldos finais das lojas e funcionários.

## Visão Geral das Classes

- **Conta**: Gerencia operações individuais da conta como depósito, saque e verificação de saldo.
- **Cliente**: Simula o comportamento do cliente ao fazer compras aleatórias em lojas até que sua conta seja esgotada.
- **Funcionario**: Representa funcionários que recebem salários e fazem investimentos com base em seus ganhos.
- **Loja**: Gerencia operações da loja, incluindo recebimento de pagamentos e distribuição de salários aos funcionários.
- **Banco**: Lida com transações entre clientes e lojas de maneira sincronizada.

## Executando o Código

1. Certifique-se de ter o Java JDK instalado.
2. Compile e execute `Main.java` para iniciar a simulação.
3. Monitore a saída no console para detalhes das transações e saldos finais.

## Observações

- O projeto utiliza threads em Java para simular interações concorrentes entre clientes, lojas e funcionários.
- Sincronização é utilizada nas operações de conta (`depositar`, `sacar`) para garantir a segurança entre threads.
- A simulação inclui valores de compra aleatórios e seleções de lojas para cada cliente, adicionando variabilidade aos cenários de transação.
