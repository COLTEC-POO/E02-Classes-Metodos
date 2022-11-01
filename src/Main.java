public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao Sistema Bancário!");

        //objetos
        Conta contaJoao = new Conta();
        Conta contaMaria = new Conta();

        //manipulação
        contaJoao.dono.nome = "João";
        contaJoao.dono.cpf = "123.789.546-01";
        contaJoao.dono.endereco = "Rua Bernardo Vasconcelos 37";
        contaJoao.dono.idade = 27;
        contaJoao.dono.sexo = 'm';
        contaJoao.saldo = 1000.0;
        contaJoao.limite = 250.0;
        contaJoao.numConta = 101112;

        contaMaria.dono.nome = "Maria";
        contaMaria.dono.cpf = "908.345.123-02";
        contaMaria.dono.endereco = "Avenida Guarapari 1025";
        contaMaria.dono.idade = 25;
        contaMaria.dono.sexo = 'f';
        contaMaria.saldo = 2000.0;
        contaMaria.limite = 400;
        contaMaria.numConta = 121110;

        //imprimir dados das contas
        contaJoao.imprimir();
        System.out.println();
        contaMaria.imprimir();

        //transferência de maria para joão
        contaMaria.transferir(contaJoao, 500);
        System.out.println();

        //imprimir saldo após transferência
        contaJoao.imprimirSaldo();
        System.out.println();
        contaMaria.imprimirSaldo();

    }
}
