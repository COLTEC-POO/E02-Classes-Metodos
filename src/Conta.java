public class Conta {
        
    
    public Cliente Cliente = new Cliente();
    public int numConta = 0;
    public double saldo = 0;   
    public double limite = 0;
    

    public void imprimirInfo() {
        System.out.println("....Numero da conta:  " + numConta);
        System.out.println("....Nome:  " + Cliente.nome);
        System.out.println("....Saldo atual:  " + saldo);
        System.out.println("....Limite:  " + limite);
    }

    
}
