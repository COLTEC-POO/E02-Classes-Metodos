public class Main {
    public static void main(String[] args){

        Conta minhaConta = new Conta();


        minhaConta.dono.nome = "Karen";
        minhaConta.saldo= 500.0;
        minhaConta.numero= 12345;
        minhaConta.dono.cpf= "123456789-88";
        minhaConta.dono.idade= 18;

        minhaConta.imprimir();

    }
}
