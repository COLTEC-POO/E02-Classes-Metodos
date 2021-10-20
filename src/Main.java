import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        byte Menu;

        //Criando novos clientes para a class Cliente
        Cliente Taldo = new Cliente();
        Cliente Renatinha = new Cliente();

        //Inicializando o preenchimento de dados dos novos clientes
        Taldo.nome="Taldo";
        Taldo.cpf="542.482.986-52";
        Taldo.idade=20;
        Taldo.sexo='M';
        Taldo.endereco="Rua Sinuka, Numero: 512, Bairro: Diamantina";

        Renatinha.nome="Renatinha";
        Renatinha.cpf="154.546.235-89";
        Renatinha.idade=85;
        Renatinha.sexo='F';
        Renatinha.endereco="Rua Zomo, Numero: 354, Bairro: Menta";

//-----------------------------------------------------------------------------------------------------//

        //declaração das Contas
        Conta taldo = new Conta();
        Conta renatinha = new Conta();

        //inicialização das Contas
        taldo.memoryCliente = Taldo;
        taldo.memoryId=567;
        taldo.memorySaldo=80000.00;
        taldo.memoryLimite=150000.00;

        renatinha.memoryCliente=Renatinha;
        renatinha.memoryId=247;
        renatinha.memorySaldo=89000.00;
        renatinha.memoryLimite=20000.00;
//-----------------------------------------------------------------------------------------------------//
        do {
            System.out.println();
            System.out.println("- Banco Intactoz -");
            System.out.println("1- Dados Clientes");
            System.out.println("2- Saque");
            System.out.println("3- Deposito");
            System.out.println("4- Transferência");
            System.out.println("5- Sair");
            System.out.print("Digite a opção desejada: ");
            Menu = input.nextByte();
            System.out.println();

            switch (Menu) {
                case 0:
                    break;
                case 1: {

                    //Função para imprimir dados dos clientes cadastrados
                    taldo.imprimirClientes(taldo);
                    renatinha.imprimirClientes(renatinha);

                    break;
                }
                case 2: {

                    //Função para sacar dinheiro na conta dos clientes
                    taldo.sacar(3895.00);
                    renatinha.sacar(4589.00);

                    //Imprimindo dados apos saque
                    System.out.println("Saque realizado com Sucesso!");
                    System.out.println("----------------------------------");
                    System.out.println("Dados Atualizados apos saque:");
                    System.out.println("Novo Saldo "+taldo.memoryCliente.nome+":"+taldo.memorySaldo);
                    System.out.println("Novo Saldo "+renatinha.memoryCliente.nome+":"+renatinha.memorySaldo);
                    break;
                }
                case 3: {

                    //Função para depositar dinheiro na conta dos clientes
                    taldo.depositar(5000.00);
                    renatinha.depositar(3500.00);

                    //Imprimindo os novos saldos apos deposito
                    System.out.println("Deposito realizado com Sucesso!");
                    System.out.println("----------------------------------");
                    System.out.println("Dados Atualizados apos deposito:");
                    System.out.println("Novo Saldo "+taldo.memoryCliente.nome+":"+taldo.memorySaldo);
                    System.out.println("Novo Saldo "+renatinha.memoryCliente.nome+":"+renatinha.memorySaldo);

                    break;
                }
                case 4: {

                    //Função para transferir dinheiro entre os clientes
                    taldo.transferir(renatinha,1500.00);

                    //IMprimindo os dados apos transferir
                    System.out.println("Transferência realizado com Sucesso!");
                    System.out.println("--------------------------------------");
                    System.out.println("Dados Atualizados apos transferência:");
                    System.out.println("Novo Saldo "+taldo.memoryCliente.nome+":"+taldo.memorySaldo);
                    System.out.println("Novo Saldo "+renatinha.memoryCliente.nome+":"+renatinha.memorySaldo);

                    break;
                }
                default: {
                    System.out.println("Error: Você escolheu uma opção invalida...");
                }
            }
        } while (Menu != 5);

//-----------------------------------------------------------------------------------------------------//

    }
}
