public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Lucas", "1232656", "Rua Teste", 20);
        Conta conta1 = new Conta(1215, "TesteSenha", 0.00, c1);

        conta1.imprimir();
    }
}