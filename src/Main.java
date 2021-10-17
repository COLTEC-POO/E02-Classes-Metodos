import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Imports
        Scanner input = new Scanner(System.in);

        //Instâncias
        Conta createdAccount = new Conta();

        //Variáveis primitivas aux
        byte menuOpcoes;


        // -------------------------------------- Inicialização do código -------------------------------------- \\

        //Questão 03
        System.out.println("Realize o seu primeiro cadastro");
        createdAccount.User.getInfoClient();

        do {
            createdAccount.imprimirAcoes(); //A opçõa de transferência não foi incluída no menu
            System.out.print("Digite a opção: ");
            menuOpcoes = input.nextByte();
            System.out.println();

            switch (menuOpcoes) {
                case 0:
                    break;
                case 1: {
                    System.out.print("Informe o valor para depósito R$");
                    double value = input.nextDouble();
                    createdAccount.deposit(value);
                    System.out.println("Seu depósito foi realizado com sucesso, seu novo saldo é de R$" + createdAccount.saldo);
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.print("Informe o valor para saque R$");
                    double value = input.nextDouble();
                    System.out.println("Seu saque foi realizado com sucesso, seu novo saldo é de R$" + createdAccount.saldo);
                    createdAccount.withdrawMoney(value);
                    System.out.println();
                    break;
                }
                case 3: {
                    createdAccount.imprimir();
                    System.out.println();
                    break;
                }
                case 4: {
                    createdAccount.User.imprimirCliente();
                    System.out.println();
                    break;
                }
                default: {
                    System.out.println("Opção inválida, por favor, tente novamente");
                }
            }
        } while (menuOpcoes != 0);


    }
}