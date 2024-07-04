package banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Funcionario funcionario1 = new Funcionario("Funcionario1", new Conta("Funcionario1 - Salario", 0), new Conta("Funcionario1 - Investimento", 0));
        Funcionario funcionario2 = new Funcionario("Funcionario2", new Conta("Funcionario2 - Salario", 0), new Conta("Funcionario2 - Investimento", 0));
        Funcionario funcionario3 = new Funcionario("Funcionario3", new Conta("Funcionario3 - Salario", 0), new Conta("Funcionario3 - Investimento", 0));
        Funcionario funcionario4 = new Funcionario("Funcionario4", new Conta("Funcionario4 - Salario", 0), new Conta("Funcionario4 - Investimento", 0));

        Loja loja1 = new Loja("Loja1", new Funcionario[]{funcionario1, funcionario2});
        Loja loja2 = new Loja("Loja2", new Funcionario[]{funcionario3, funcionario4});

        Cliente cliente1 = new Cliente("Cliente1", new Conta("Cliente1", 1000), loja1, loja2, banco);
        Cliente cliente2 = new Cliente("Cliente2", new Conta("Cliente2", 1000), loja1, loja2, banco);
        Cliente cliente3 = new Cliente("Cliente3", new Conta("Cliente3", 1000), loja1, loja2, banco);
        Cliente cliente4 = new Cliente("Cliente4", new Conta("Cliente4", 1000), loja1, loja2, banco);
        Cliente cliente5 = new Cliente("Cliente5", new Conta("Cliente5", 1000), loja1, loja2, banco);

        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();

        try {
            cliente1.join();
            cliente2.join();
            cliente3.join();
            cliente4.join();
            cliente5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Saldo final da loja1: R$ " + loja1.getConta().getSaldo());
        System.out.println("Saldo final da loja2: R$ " + loja2.getConta().getSaldo());

        System.out.println("Saldo final dos funcionários:");
        System.out.println(funcionario1.getName() + " - Salário: R$ " + funcionario1.getContaSalario().getSaldo());
        System.out.println(funcionario2.getName() + " - Salário: R$ " + funcionario2.getContaSalario().getSaldo());
        System.out.println(funcionario3.getName() + " - Salário: R$ " + funcionario3.getContaSalario().getSaldo());
        System.out.println(funcionario4.getName() + " - Salário: R$ " + funcionario4.getContaSalario().getSaldo());
    }
}
