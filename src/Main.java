public class Main {

    public static void main (String [] args){
        System.out.println("=== Sistema Bancário ===");

        Conta contaBruna = new Conta();
        Conta minhaConta = new Conta();

        contaBruna.Dono = "Bruna FS";
        contaBruna.numeroConta = 102023;
        contaBruna.saldoConta = 10000;
        contaBruna.limiteConta = 50000;

        minhaConta.titularConta.Nome = "Marina LVM";
        minhaConta.titularConta.CPF = "123.123.123";
        minhaConta.titularConta.Endereco = "Avenida Atlantida";
        minhaConta.titularConta.Idade = 24;
        minhaConta.titularConta.Sexo = 'F';

        contaBruna.imprimir1();             // Exercicio 02
        minhaConta.imprimir2();             // Exercicio 03
    }
}

