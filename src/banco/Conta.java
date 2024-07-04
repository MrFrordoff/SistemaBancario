package banco;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double valor) {
        saldo += valor;
        System.out.println(titular + " depositou: R$ " + valor);
    }

    public synchronized boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println(titular + " sacou: R$ " + valor);
            return true;
        }
        System.out.println(titular + " tentou sacar R$ " + valor + " mas saldo insuficiente.");
        return false;
    }

    public synchronized double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
