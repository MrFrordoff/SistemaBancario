package banco;

public class Banco {
    public synchronized void realizarCompra(Cliente cliente, Loja loja, double valor) {
        Conta contaCliente = cliente.getConta();
        if (contaCliente.sacar(valor)) {
            loja.receberPagamento(valor);
        }
    }
}
