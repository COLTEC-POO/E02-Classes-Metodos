public class Main {
    public static void main(String[] args) {

        Conta contaMaria = new Conta();

        contaMaria.imprimeDadosUsuario();

        //Atribui as informacoes da Maria
        contaMaria.dono.nome = "Maria";
        contaMaria.dono.sexo = 'm';
        contaMaria.dono.endereco = "Rua Jose 125";
        contaMaria.dono.cpf = "11122233344";
        contaMaria.dono.idade = 32;
        contaMaria.numeroConta = 1;
        contaMaria.saldo = 2000;
        contaMaria.limite = 5000;

        //Imprime dados usuario
        contaMaria.imprimeDadosUsuario();

        //Deposita
        contaMaria.depositar(3000);
        System.out.println("");

        //Saca
        contaMaria.sacar(2000);
        System.out.println("");

        //Imprime os dados apos as mudanças
        contaMaria.imprimeDadosUsuario();
    }
}
