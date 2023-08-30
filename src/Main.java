public class Main {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente();
        novoCliente.Nome = "Duque";
        novoCliente.CPF = "123.321.123-45";
        novoCliente.Enderenco = "Rua dos Bobos, Numero 0";
        novoCliente.Idade = 18;
        novoCliente.Sexo = 'M';

        Conta minhaConta = new Conta();
        minhaConta.dono = novoCliente;
        minhaConta.saldo = 1000.0;
        minhaConta.limite = 100.0;
        minhaConta.numero++;

        minhaConta.imprimir();
    }
}
