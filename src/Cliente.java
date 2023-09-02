public class Cliente {
    String nome;
    String CPF;
    String endereço;
    int idade;
    char sexo;

        // Método construtor da classe Cliente

        Cliente (String nome, String CPF, String endereço, int idade, char sexo) {
            this.nome = nome;
            this.CPF = CPF;
            this.endereço = endereço;
            this.idade = idade;
            this.sexo = sexo;        
    }

        // Método para imprimir as informações do dono de uma conta no banco (Exercício 3)

    void imprimeUser () {
            System.out.println("Dados do cliente " + this.nome);
            System.out.println("CPF: " + this.CPF);
            System.out.println("Endereço: " + this.endereço);
            System.out.println("Idade: " + this.idade);
            System.out.println("Gênero: " + this.sexo);

    }
}
