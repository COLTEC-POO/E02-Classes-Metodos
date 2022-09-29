//classe conta 
public class Conta {

//  public static void main(String[] args) {
//atributos
        int numero;
        String dono;
        double saldo;
        double limite;

//classe main
public class Main {
    public static void main(String[]args){

        Conta contaminha = new Conta();
        Conta contaIron = new Conta();

        // manipulação contaminha

        contaminha.dono= "Bruna";
        contaminha.saldo=100000.00;
        contaminha.numero=13;

        contaIron.dono= "Iron";
        contaIron.saldo = 10000.0;
        contaIron.numero=3;

        System.out.println("Conta Bruna informações:");

         System.out.println("Nome conta:"+contaminha.dono);
         System.out.println("Saldo conta:"+contaminha.saldo);
         System.out.println("Número conta:"+contaminha.numero);

        System.out.println("\nConta Iron informações:");
        System.out.println("Nome conta:"+contaIron.dono);
        System.out.println("Saldo conta:"+contaIron.saldo);
        
        System.out.println("Saldo conta:"+contaIron.saldo);
        System.out.println("Numero conta:" +contaIron.numero);

        
