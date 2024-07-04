package banco;

public class Funcionario extends Thread {
    private Conta contaSalario;
    private Conta contaInvestimento;

    public Funcionario(String nome, Conta contaSalario, Conta contaInvestimento) {
        super(nome);
        this.contaSalario = contaSalario;
        this.contaInvestimento = contaInvestimento;
    }

    public void receberSalario(double valor) {
        contaSalario.depositar(valor);
        double investimento = valor * 0.2;
        contaInvestimento.depositar(investimento);
    }

    @Override
    public void run() {
    }

    public Conta getContaSalario() {
        return contaSalario;
    }
}
