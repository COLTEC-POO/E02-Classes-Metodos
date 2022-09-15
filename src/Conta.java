public class Conta {

    // atributos
    public Cliente titular = new Cliente();;
    public int numConta;
    public double saldo;
    public double limite;

    // ações
    public void imprimir(){
        System.out.println("==== Dados da conta ====");
        System.out.println("Nome...........: " + this.titular.nome);
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Saldo..........: " + this.saldo);
        System.out.println("Limite.........: " + this.limite);
    }

    public void imprimirSaldo(){
        System.out.println("==== Conta " +this.numConta + " ====");
        System.out.println("Nome:  "+ this.titular.nome);
        System.out.println("Saldo: "+ this.saldo);
    }

    public boolean sacar(double valor){
        if(valor > this.saldo || valor < 0){
            return false;
        } else{
            this.saldo -=valor;
            return true;
        }
    }

    public boolean depositar(double valor){
        if(valor < 0){
            return  false;
        } else{
            this.saldo += valor;
            return true;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        } else{
            return false;
        }

    }
}