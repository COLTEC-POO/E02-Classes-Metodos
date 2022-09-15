import java.util.Scanner;

public class Cliente{
    private String nome;
    private  int idade;
    private String CPF;
    private  String endereco;
    private char sexo;

    public Cliente(){
        Scanner entrada = new Scanner(System.in);
        boolean ERRO;

        System.out.println("Informe seu Nome: ");
        this.setNome(entrada.nextLine());

        do{
            System.out.println("Informe sua Idade: ");
            this.setIdade(entrada.nextInt());
            ERRO = this.getIdade() < 0;
            if(ERRO) System.out.println("IDADE INVALIDA");
        }while(ERRO);
        entrada.nextLine();

        System.out.println("Informe seu CPF: ");
        this.setCPF(entrada.nextLine());

        System.out.println("Informe seu Endereço: ");
        this.setEndereco(entrada.nextLine());


        do{
            System.out.println("Informe o sexo [M/F]: ");
            this.setSexo(entrada.next().charAt(0));
            ERRO = this.getSexo() != 'F' && this.getSexo() != 'M';
            if(ERRO) System.out.println("INFORME UM VALOR VALIDO [F/M]!");
        }while(ERRO);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }
}
