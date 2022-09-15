import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Conta conta_1;
        Conta conta_2;

        System.out.println("Vamos Criar a Primeira Conta:");
        conta_1 = new Conta();
        conta_1.imprimir();
        System.out.println("Certo Agora informe um valor a depositar: ");
        conta_1.depositar(entrada.nextDouble());
        conta_1.imprimir();
        System.out.println("Testar a realização de saque, informe um valor: ");
        conta_1.sacar(entrada.nextDouble());
        conta_1.imprimir();

        System.out.println("Vamos Criar a Segunda Conta:");
        conta_2 = new Conta();
        conta_2.imprimir();
        System.out.println("Certo Agora informe um valor a depositar: ");
        conta_2.depositar(entrada.nextDouble());
        conta_2.imprimir();
        System.out.println("Testar a realização de saque, informe um valor: ");
        conta_2.sacar(entrada.nextDouble());
        conta_2.imprimir();

        System.out.println("Agora Transferir Valor da Conta 1 para 2:");
        System.out.println("Informe o valor que deseja transferir");
        conta_1.transferir(conta_2, entrada.nextDouble());
        conta_1.imprimir();
        conta_2.imprimir();
    }
}
