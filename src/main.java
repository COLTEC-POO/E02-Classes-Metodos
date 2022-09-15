public class main {
    public static void main(String[] args) {

        cliente contaPedro = new cliente();
        conta contaJoão = new conta();
        conta contaMaria = new conta();

        contaPedro.nome = "Pedro Nunes";
        contaPedro.CPF = "44444444";
        contaPedro.endereco = "Rua dos bobos, N 0";
        contaPedro.idade = 27;
        contaPedro.sexo = 'M';

        contaJoão.numConta = 77777777;
        contaJoão.nome = "João Nunes";
        contaJoão.saldo = 1587.60;
        contaJoão.limite = 12000.00;

        contaMaria.nome = "Maria";
        contaMaria.limite = 5000.0;
        contaMaria.numConta = 9636;
        contaMaria.saldo = 8422.00;

        contaJoão.imprimir(); //usando classe conta
        System.out.println();

        contaPedro.imprimir(); //usando classe cliente
        System.out.println();

        contaJoão.transferir(contaMaria, 200);
        System.out.println();
        contaJoão.imprimir();
        System.out.println();
        contaMaria.imprimir();

    }
}
