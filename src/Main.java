public class Main {
    public static void main (String [] args) {

        Conta minhaConta;
        minhaConta = new Conta ();

        Conta novaConta;
        novaConta = new Conta ();

        Cliente brenda;
        brenda = new Cliente ();

        Cliente novoCliente;
        novoCliente = new Cliente ();

        minhaConta.dono = brenda;
        minhaConta.saldo = 5000;
        minhaConta.numeroDaConta = 101;
        minhaConta.limite = 10000;

        brenda.nome = "Brenda Sales";
        brenda.idade = 24;
        brenda.sexo = 'F';
        brenda.CPF = "000.000.000-00";
        brenda.endereco = "Rua X, bairro Y.";

        novaConta.dono = novoCliente;
        novaConta.saldo = 10000;
        novaConta.numeroDaConta = 202;
        novaConta.limite = 20000;

        novoCliente.nome = "Novo Cliente";
        novoCliente.idade = 24;
        novoCliente.sexo = 'M';
        novoCliente.CPF = "111.111.111-11";
        novoCliente.endereco = "Rua Y, bairro X.";

        minhaConta.imprimir(minhaConta);
        System.out.println ("------------------------------------------");
        minhaConta.imprimir(novaConta);
        System.out.println ("------------------------------------------");

        minhaConta.depositar(2000);
        System.out.println ("Saldo atual: R$ " + minhaConta.saldo);
        minhaConta.sacar(1000);
        System.out.println ("Saldo atual: R$ " + minhaConta.saldo);
        minhaConta.transferir(novaConta, 2000);
        System.out.println ("Saldo atual conta de origem: R$ " + minhaConta.saldo);
        System.out.println ("Saldo atual conta de destino: R$ " + novaConta.saldo);

    }
}
