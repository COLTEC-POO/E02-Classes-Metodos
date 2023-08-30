public class Conta {
    Cliente titularConta = new Cliente();
    String Dono;
    int numeroConta;
    double saldoConta;
    double limiteConta;

    public Conta(){
        this.Dono = "<INVALIDO>";
        this.numeroConta = -1;
        this.limiteConta = 0;
        this.saldoConta = 0;
    }

    public void depositar(double valor){
        this.saldoConta += valor;
    }

    public void sacar(double valor){
        this.saldoConta -= valor;
    }

    public void imprimir1(){
        System.out.println("E02: Método de Impressao");
        System.out.println("Nome do dono da conta: " + Dono);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo atual: " + saldoConta);
        System.out.println("Limite: " + limiteConta);
    }

    public void imprimir2(){
        System.out.println();
        System.out.println("E03: Classe Cliente");
        System.out.println("Nome: " + titularConta.Nome);
        System.out.println("CPF: " + titularConta.CPF);
        System.out.println("Endereco: " + titularConta.Endereco);
        System.out.println("Idade: " + titularConta.Idade);
        System.out.println("Sexo: " + titularConta.Sexo);
    }

}
