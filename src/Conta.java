public class Conta {

    Cliente dono = new Cliente();
    int numConta;
    double saldo;
    double limite;
    public Conta() {
    }
    //depósito
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    //saque
    public boolean sacar(double valor){

        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //transferência
    public boolean transferir(Conta contaDestino, double valor){

        boolean retirou = this.sacar(valor);

        if (retirou){
            contaDestino.depositar((valor));
            return true;
        } else {
            return false;
        }
    }

    public void imprimir(){
        System.out.println(">>Dados da conta<<");
        System.out.println("Dono da conta: " + this.dono.nome);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Limite: " + limite);
    }

    public void imprimirSaldo(){
        System.out.println(">>Conta: " +this.numConta + "<<");
        System.out.println("Dono da conta: " + this.dono.nome);
        System.out.println("Saldo: " + this.saldo);
    }
}
