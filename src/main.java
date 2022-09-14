import java.util.Scanner;

public class main {
    /**
     * @param args
     * @param cliente TODO
     */
    public static void main(String[] args, Cliente cliente) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bem Vindo ao sistema Bancario");

        Conta contaJoao;
        Conta contaMaria;
        Cliente temp;

        temp = new Cliente("João", "15796345788", "Av Antonio Carlos, Coltec, Belo Horizonte MG", 33, "M");
        contaJoao = new Conta(temp , true, 500.00, 100.00, 6541 );
        temp = new Cliente ("Maria", "22222222222", "Av Antonio Carlos, Coltec, Belo Horizonte MG", 24, "F");
        contaMaria = new Conta(cliente , true, 8422.00, 100.00, 9636);

        contaJoao.imprimirSaldo();
        contaMaria.imprimirSaldo();

        contaJoao.mostraConta();
        contaJoao.mostraContaCompleta();
        contaMaria.mostraConta();
        contaMaria.mostraContaCompleta();

        System.out.println("Quanto deseja transferir: ");
        Double valor = input.nextDouble();
        contaJoao.transferir(contaMaria, valor);
        
        contaJoao.imprimirSaldo();
        contaMaria.imprimirSaldo();


        input.close();
    }
}