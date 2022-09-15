import java.util.Scanner;
public class Conta {
    Scanner entrada = new Scanner(System.in);
    public static int contadorNumContas = 0;

    ///atributos

    Cliente dono = new Cliente();
    private String nome;
    private int idade;
    private int numConta;
    private double saldo;

    private double limite;
    private String cpf;

    private String endereco;



    public Conta(String nome, String cpf, int idade, int numConta, double saldo, double limite){
        dono.nome = nome;
        dono.idade = idade;
        dono.cpf = cpf;
        dono.endereco = endereco;
        this.numConta = numConta;
        this.saldo = saldo;
        this.limite = limite;




        Conta.contadorNumContas ++;

    }

    ///ações
    /// TIPO NOMEMETODO(TIPO NOME, TIPO NOME, .....){
    /// } corpo do método

    void imprimir(){
        System.out.println("Número da conta: " + numConta);
        System.out.println("Titular: " + dono.nome);
        System.out.println("CPF: " + dono.cpf);
        System.out.println("Idade: " + dono.idade);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " +limite);

    }

    public boolean sacar(double valor){
        if(valor > this.saldo || valor < 0){
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public boolean depositar(double saldo) {
        if(saldo < 0) return  false;
        this.saldo += saldo;
        return  true;
    }

    public boolean transferir(Conta destino, double valor){

        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        } else {
            return  false;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(){
        this.limite = limite;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(){
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco() {
        this.endereco = endereco;
    }
}
