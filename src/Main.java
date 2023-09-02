import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){

        Scanner input = new Scanner(System.in); // Scanner que vai ser usado ao longo do código

        Cliente userVicente = new Cliente("Vicente do Carmo", "777-777-777.77", "Rua ABC, 123", 24, 'M');
        Conta contaVicente = new Conta(69420, userVicente, 100.00, 200.00); 

        Cliente userSilvana = new Cliente("Silvana Mara", "888-888-888.88", "Rua CDE, 456", 61, 'F');
        Conta contaSilvana = new Conta(196223, userSilvana, 5000.00, 10000.00);

         // Exercício 2
     
        contaVicente.imprimeConta();   
        contaSilvana.imprimeConta();

        // Recebe os valores do scanner e os passa por referência para os métodos
        contaSilvana.transferir(contaVicente, input);

        contaVicente.depositar(input); 
        
        contaVicente.sacar(input);

        contaVicente.imprimeConta();
        contaSilvana.imprimeConta();

        // Exercício 3

        userVicente.imprimeUser();
        userSilvana.imprimeUser();

        input.close();
    }
}
