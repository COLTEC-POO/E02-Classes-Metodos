public class Conta {
    int numero;
    String senha;
    double saldo;
    Cliente dono;

    public Conta(int numero, String senha, double saldo, Cliente dono){
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.dono = dono;
    }
    public void imprimir(){
        System.out.println("Número: " + numero + "\n"+
                           "Senha: " + senha + "\n"  +
                           "Saldo: " + saldo + "\n"  +
                            "Cliente: \n");
        dono.imprimir();
    }
}
