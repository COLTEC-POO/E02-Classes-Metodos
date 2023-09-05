public class Conta {
    int numero;
    String senha;
    double saldo;
    String dono;

    //construtores
    public Conta(int numero, String senha, double saldo, String dono){
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.dono = dono;
    }

    public Conta(int numero, String senha, String dono){
        this.numero = numero;
        this.senha = senha;
        this.dono = dono;
        this.saldo = 0;
    }

    public Conta() {
        this.numero = -1;
        this.senha = null;
        this.saldo = 0;
        this.dono = null;
    }

    public boolean depositar(double valor){
        if (valor >= 0){
            this.saldo += valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean sacar(double valor){
        if(valor >= 0 && valor <= this.saldo){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino){
        if(this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
}
