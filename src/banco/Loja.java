package banco;

public class Loja {
    private String nome;
    private Conta conta;
    private Funcionario[] funcionarios;

    public Loja(String nome, Funcionario[] funcionarios) {
        this.nome = nome;
        this.conta = new Conta(nome, 0);
        this.funcionarios = funcionarios;
    }

    public synchronized void receberPagamento(double valor) {
        conta.depositar(valor);
        for (Funcionario funcionario : funcionarios) {
            if (conta.getSaldo() >= 1400) {
                conta.sacar(1400);
                funcionario.receberSalario(1400);
            }
        }
    }

    public Conta getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }
}
