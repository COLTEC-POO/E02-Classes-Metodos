public class Main {

    public static void main (String [] args){

        Cliente jessica = new Cliente();
        jessica.nome = "Jéssica";
        jessica.cpf = "122.553.255-42";
        jessica.endereco = "Rua Filadelfia, 32";
        jessica.idade = 19;
        jessica.sexo = 'F';

        Cliente felipe = new Cliente();
        felipe.nome = "Felipe";
        felipe.cpf = "142.608.146-65";
        felipe.endereco = "Rua Margarida, 176";
        felipe.idade = 32;
        felipe.sexo = 'M';

        Conta minhaConta = new Conta();
        Conta suaConta = new Conta();

        minhaConta.dono = jessica;
        minhaConta.numero = 456;
        minhaConta.saldo = 3500.0;
        minhaConta.limite = 5000.0;

        suaConta.dono = felipe;
        suaConta.numero = 789;
        suaConta.saldo = 1500.0;
        suaConta.limite = 3000.0;

        minhaConta.depositar(100);
        suaConta.sacar(200);
        minhaConta.tranferir(suaConta, 400);

        minhaConta.imprimir();
        System.out.println();
        suaConta.imprimir();

    }
}