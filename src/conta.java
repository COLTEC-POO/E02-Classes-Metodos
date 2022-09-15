public class conta {

    public int numConta;
    public String nome;
    public double saldo;
    public double limite;

    //constructor
    public conta(){
        this.nome = "Invalido";

        this.saldo = 0;
        this.limite = 0;
    }

    public void imprimir() {
        System.out.println("===== Conta " + numConta + " ====");
        System.out.println("Dono: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    };

    public boolean sacar(double valor) {
        if (valor > saldo || valor <0) {
            return false;
        } else {
            this.saldo-= valor;
            return true;
        }
    }

    public boolean depositar(double valor) {
        if (valor < 0){
            return false;
        } else {
            this.saldo += valor;
            return true;
        }
    }

    public boolean transferir(conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
}
