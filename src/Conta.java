
public class Conta{

    static int nContasCadastradas = 0;
    private Cliente titular;
    private  int numeroConta;
    private double saldo;
    private double limite;

    public Conta(){
        System.out.println("Bem Vindo - Ao Sistema Bancario");
        System.out.println("Vamos criar sua conta.");
        this.numeroConta = (1000 + nContasCadastradas);
        this.cadastrarTitular();
        this.saldo = 0;
        this.limite = 0;
        nContasCadastradas++;
    }

    public void imprimir(){
        System.out.println("\n------------------------");
        System.out.printf("TITULAR: %s\nCONTA: %d\n", this.titular.getNome(), this.getNumeroConta());
        System.out.printf("SALDO: R$ %.2f/ LIMITE: R$ %.2f\n", this.getSaldo(), this.getLimite());
        System.out.println("------------------------\n");
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(valor > this.getSaldo()){
            System.out.println("SALDO INSUFICIENTE");
        }else {
            this.saldo -= valor;
        }
    }

    public void transferir(Conta contaDestino, double valor){
        if(valor > this.getSaldo()){
            System.out.println("SALDO INSUFICIENTE");
        }else{
            this.saldo -= valor;
            contaDestino.depositar(valor);
        }
    }

    public void cadastrarTitular(){
        this.titular = new Cliente();
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}
