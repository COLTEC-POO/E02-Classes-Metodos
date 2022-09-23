public class Conta {
    //atributos

    public int numConta; //Utilizar public para que possa ser acessado
    public Cliente Cliente;
    public double saldo;
    public double limite;

    //Ações

    public Conta(){
        this.numConta = -1;
        this.Cliente = new Cliente();
        this.saldo= 0;
        this.limite = 0;
        
    }
    //Metodo para fazer depositos
    //Para criar um metodo basta colocar o public + retorno +nome + (tipo parametro)
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    //Metodo para saque 

    public boolean sacar(double valor){ //Para ter retorno se funcionou

        if(valor<=this.saldo){
            this.saldo-= valor;
            return true; 
        }
        else{
            return false;
        }
    }

    public void imprimirDados(){
        System.out.println("Nome:" + Cliente.Nome);
        System.out.println("Nome:" + Cliente.CPF);
        System.out.println("Nome:" + Cliente.Endereco);
        System.out.println("Nome:" + Cliente.Idade);
        System.out.println("Nome:" + Cliente.Sexo);
        System.out.println("Numero da conta: " + numConta);
        System.out.println("Saldo Atual da conta: " + saldo);
        System.out.println("Limite da conta: " + limite);
    }
}