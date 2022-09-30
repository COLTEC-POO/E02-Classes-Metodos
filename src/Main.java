public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao Sistema Bancário!");

        //objetos
        Conta contaJoao = new Conta();
        Conta contaMaria = new Conta();

        //manipulação
        contaJoao.dono = "João";
        contaJoao.saldo = 1000.0;
        contaJoao.numConta = 1;

        contaMaria.dono = "Maria";
        contaMaria.saldo = 2000.0;
        contaMaria.numConta = 2;


    }
}
