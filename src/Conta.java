public class Conta {
    public int numero;
    public Cliente dono;
    public double saldo;
    public double limite;

    // metodos, acoes, comportamentos dos objetos

    //Construtor
    public Conta(){
        this.numero = -1;
        //this.dono = "<INVALIDO>";
        this.saldo = 0;
        this.limite = 0;
    }

    //depositos
    public void depositar (double valor){
        this.saldo = this.saldo + valor;
    }

    //saques
    public boolean sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //transferencia
    public boolean transferir(Conta contaDestino, double valor){

        boolean retirou = this.sacar(valor);
        if (retirou){
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public void imprimir(){
        System.out.println("======" + this.numero + "=====");
        dono.imprimir();
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);

    }

    /**
     * //imprimir dados da conta na tela
     *
     *     public String toString(){
     *         return String.format ("Nome = %s\nNumero da conta = %d\n" +
     *                 "Saldo = %.2f\nLimite = %.2f", dono, numero, saldo, limite);
     *     }
     *      *     *
     * */
}

