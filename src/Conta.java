public class Conta {

    String nome;
    String cpf;
    String endereco;
    int Idade;
    char genero;


    // declarando os dados das contas

    int numero;
    String dono;
    double saldo;
    double limite;

    // ações

    // Exercicio 02
    public void imprimir() {
        System.out.println("E03: Metodo de Impressao ");
        System.out.println("Numero da conta: " + numero);
        System.out.println("Dono da conta: " + dono);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("Limite da conta: " + limite);
    }

    // Exercicio 03
    public void impressaoCliente() {
        System.out.println("E03: Classe Cliente");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + Idade);
        System.out.println("Genero: " + genero);

    }
}
