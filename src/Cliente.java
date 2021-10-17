import java.util.Scanner;

public class Cliente {
    Scanner input = new Scanner(System.in);

    // Atrubutos
    String NameUser;
    String NumberCPF;
    String AddressUser;
    int AgeUser;
    char Sex;

    //Inicialização de usuário
    String lixo;

    //Impressão de dados para obtenção de valores
    public void getInfoClient(){
       System.out.print("Por favor, informe o nome completo do cliente: ");
       this.NameUser = input.nextLine();

       System.out.print("Digite o sexo [M/F]: ");
       this.Sex = input.next().charAt(0);

       System.out.print("Digite o CPF: ");
        this.lixo = input.nextLine(); //Método de contorno para pegar a quebra de linha do buffer
        this.NumberCPF = input.nextLine();

       System.out.print("Digite a idade: ");
       this.AgeUser = input.nextInt();

       System.out.print("Por fim, digite o endereço: ");
       this.lixo = input.nextLine(); //Método de contorno para pegar a quebra de linha do buffer
       this.AddressUser = input.nextLine();
    }

    public void imprimirCliente(){
        System.out.println("Proprietário: " + this.NameUser);

        System.out.println("CPF: " + this.NumberCPF);

        System.out.println("Idade: " + this.AgeUser);

        System.out.println("Endereço: " + this.AddressUser);

        System.out.println("Sexo: " + this.Sex);
    }
}
