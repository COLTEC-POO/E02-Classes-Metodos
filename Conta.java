public class Conta {
    String dono;
    int numero;
    double saldo;
    String senha;
    double limite;
                        
    public void imprimir() {
        System.out.println("Nome: " + dono);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    } 
}
