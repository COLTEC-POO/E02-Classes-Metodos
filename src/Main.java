public class Main {
    public static void main(String[] args) {

        Conta contaLeandro = new Conta();
        Conta contaJoao = new Conta();

        // manipulando conta

        contaLeandro.dono = "Leandro";
        contaLeandro.saldo = 1000.0;
        contaLeandro.numero = 1;
        contaLeandro.limite = 10000.0;

        contaJoao.dono = "Joao";
        contaJoao.saldo = 20000;
        contaJoao.numero = 2;
        contaJoao.limite = 200000.0;

        Conta clienteLeandro = new Conta();

        clienteLeandro.nome ="Leandro Xavier";
        clienteLeandro.cpf="700.485.936-30";
        clienteLeandro.endereco="Concordia";
        clienteLeandro.Idade= 22;
        clienteLeandro.genero = 'M';

        // imprimindo os dados das contas

        contaLeandro.imprimir();    // Exercicio 02
        contaJoao.imprimir();
        clienteLeandro.impressaoCliente();  //  Exercicio 03
    }
}
