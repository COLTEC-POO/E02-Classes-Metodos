public class cliente {

    public String nome;
    public String CPF;
    public String endereco;
    public int idade;
    public char sexo;

    public cliente(){
        this.nome = "Invalido";
        this.CPF = "00000000000";
        this.endereco = " ----------- ";
        this.idade = 0;
        this.sexo = '-';
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("ENDEREÇO: " + this.endereco);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }
}
