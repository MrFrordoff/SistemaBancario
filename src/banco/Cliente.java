package banco;

public class Cliente extends Thread {
    private Conta conta;
    private Loja loja1;
    private Loja loja2;
    private Banco banco;

    public Cliente(String nome, Conta conta, Loja loja1, Loja loja2, Banco banco) {
        super(nome);
        this.conta = conta;
        this.loja1 = loja1;
        this.loja2 = loja2;
        this.banco = banco;
    }

    @Override
    public void run() {
        while (conta.getSaldo() > 0) {
            Loja loja = Math.random() > 0.5 ? loja1 : loja2;
            double valorCompra = Math.random() > 0.5 ? 200.00 : 100.00;
            banco.realizarCompra(this, loja, valorCompra);
            try {
                Thread.sleep(100); // Pausa para simular o tempo entre as compras
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Conta getConta() {
        return conta;
    }
}
