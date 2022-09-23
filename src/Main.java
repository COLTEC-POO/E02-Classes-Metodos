public class Main {
    public static void main(String[] args){
        //Criação de variavel para referenciar a classe Conta
        Conta minhaConta= new Conta();
        Conta contaGabi = new Conta();

        // Para atribuir a variavel criada basta acessa-la .atributodaclass e atribuir.
        minhaConta.Cliente.Nome= "Mariana";
        minhaConta.Cliente.CPF= "012.345.678-90";
        minhaConta.Cliente.Endereco="Rua Um , Bairro 2";
        minhaConta.Cliente.Idade=24;
        minhaConta.Cliente.Sexo='F';
        minhaConta.saldo= 1000.0;
        minhaConta.numConta= 1;

        contaGabi.Cliente.Nome = "Gabriela";
        contaGabi.Cliente.CPF="987.654.321.-09";
        contaGabi.Cliente.Endereco= "Rua 2, Bairro 1.";
        contaGabi.Cliente.Idade = 18;
        contaGabi.Cliente.Sexo = 'F';
        contaGabi.saldo = 20000.0;
        contaGabi.numConta = 2;


        minhaConta.depositar(500);
        System.out.println(minhaConta.saldo);

        contaGabi.depositar(500);
        System.out.println(contaGabi.saldo);

        boolean saquerealizado = minhaConta.sacar( 500);

        if (saquerealizado) {
            System.out.println(" Saque realizado com sucesso!");
        } else {
            System.out.println("Erro na realização do saque: Saldo Insuficiente");
        }
        
       minhaConta.imprimirDados();
       contaGabi.imprimirDados();


    

    }
    
}
