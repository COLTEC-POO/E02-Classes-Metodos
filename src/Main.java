public class Main {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema Bancário");

        Conta contaTeste = new Conta();

        contaTeste.titular.nome = "Eduardo";
        contaTeste.titular.cpf = "123456789-01";
        contaTeste.titular.endereco = "Belo Horizonte";
        contaTeste.titular.idade = 20;
        contaTeste.titular.sexo = 'm';
        contaTeste.numConta = 1201;
        contaTeste.saldo = 2237.43;
        contaTeste.limite = 10000;


        contaTeste.imprimir();

    }
}