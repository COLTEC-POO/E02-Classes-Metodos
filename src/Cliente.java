public class Cliente {
    String name;
    String CPF;
    String endereco;
    int idade;

    Cliente(String name, String CPF, String endereco, int idade){
        this.name = name;
        this.CPF = CPF;
        this.endereco = endereco;
        this.idade = idade;
    }
    public void imprimir(){
        System.out.println("Nome: " + name + "\n" +
                           "CPF: " + CPF + "\n" +
                           "Endereco: " + endereco + "\n" +
                           "Idade: " + idade);
    }
}
