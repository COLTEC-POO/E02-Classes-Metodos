

public class Main {
    
    public static void main(String[] args) {
        
        Conta contaGabi;
        
        contaGabi = new Conta();
        contaGabi.Cliente.nome= "Gabriella";
        contaGabi.numConta = 0030;
        contaGabi.Cliente.cpf = "439.354.876-23";
        contaGabi.limite = 5000.00;
        contaGabi.saldo = 3420.00;
        contaGabi.Cliente.endereco = "Rua Alta, 200 - Baixo";
        contaGabi.Cliente.idade = 19;
        contaGabi.Cliente.sexo = 'F';

        contaGabi.Cliente.imprimirDadosCliente();
        contaGabi.imprimirInfo();
    }
}
