public class Conta {

    int numConta;
    String dono;
    double saldo;
    double limite;

    public Conta() {
        this.numConta = -1;
        this.dono = "<INVÁLIDO>";
        this.saldo = 0;
        this.limite = 0;
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

}
