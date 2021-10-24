public class Conta {

    public Cliente dono;
    public int numero;
    public double saldo;
    public double limite;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar (double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean tranferir (Conta destino, double valor){
        boolean saqueRealizado = this.sacar(valor);

        if (saqueRealizado){
            destino.depositar(valor);
            return true;
        }else{
            return false;
        }
    }

    public void imprimir(){
        System.out.println("-----------------");

        dono.imprimir();

        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }

}