public class Main {
    public static void main(String[] args){

    // Inicializacao Cliente

    Cliente jessica = new Cliente();

    jessica.nome = "Jéssica Alves";
    jessica.cpf = "123.455.789-11";
    jessica.endereco = "Rua Laranjeiras";
    jessica.idade = 21;
    jessica.sexo = 'f';

    Cliente pedro = new Cliente();

    pedro.nome = "Pedro Henrique";
    pedro.cpf = "111.222.333-44";
    pedro.endereco = "Rua Cerejeira";
    pedro.idade = 25;
    pedro.sexo = 'm';

    // inicialização Conta

    Conta minhaConta = new Conta();
    Conta suaConta = new Conta();

    minhaConta.dono = jessica;
    minhaConta.numConta = 1003;
    minhaConta.saldo = 2000.0;
    minhaConta.limite = 4000.0;

    suaConta.dono = pedro;
    suaConta.numConta = 1212;
    suaConta.saldo = 10000;
    suaConta.limite = 20000;

    // exemplo depósito

    System.out.println("Saldo atual: " + minhaConta.saldo);
    minhaConta.depositar(500);
    System.out.println("Saldo após depósito: " + minhaConta.saldo);
    System.out.println("-------------------------------------------");

    // exemplo saque

    System.out.println("Saldo atual: " + minhaConta.saldo);
    boolean saqueRealizado = minhaConta.sacar(1000);
    System.out.println("Saldo após saque: " + minhaConta.saldo);

    if (saqueRealizado)
    {
        System.out.println(" ** Saque realizado com sucesso! **");
    }
    else{
        System.out.println("** Erro na realização do saque **");
    }
    System.out.println("-------------------------------------------");

    // exemplo transferência

    System.out.println("Saldo Jessica: " + minhaConta.saldo);
    System.out.println("Saldo Pedro: " + suaConta.saldo);
    suaConta.transferir(minhaConta, 1000);
    System.out.println("Saldo Jessica após transferência: " + minhaConta.saldo);
    System.out.println("Saldo Pedro após transferência: " + suaConta.saldo);
    System.out.println("-------------------------------------------");

    // impressão dados da conta

    minhaConta.imprimir();
    suaConta.imprimir();

    }
}