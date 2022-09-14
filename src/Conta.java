public class Conta {

    //atributos
    private static Integer qtdContas = 0;

    private Cliente cliente;
    private Integer numConta;
    private Double saldo;
    private Double limite;
    private Boolean tipo;


    // Construct para iniciar a conta

    /**
     * @param cliente
     * @param tipo
     * @param saldo_inicial
     * @param limite
     * @param numConta
     */
    public Conta(Cliente cliente, Boolean tipo, Double saldo_inicial, Double limite, Integer numConta){
        try{
            validaCliente(cliente);
            validaTipo(tipo);
            validaSaldo(saldo_inicial);
            validaLimite(limite);
            validaNumConta(numConta);
            qtdContas++;
        }catch (Exception e) {
            System.out.println("Dados invalidos!");
        }
    }

    //Getters
    public String getNome(){
        return this.nome;
    }

    public Boolean getTipo(){
        return this.tipo;
    }

    public String getSaldo(){
        return this.saldo;
    }

    public String getLimite(){
        return this.limite;
    }

    public String getNumConta(){
        return this.numConta;
    }
    //FIM Getters

    //Setters
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setTipo(Boolean tipo){
        this.tipo = tipo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public void setLimite(Double limite){
        this.limite = limite;
    }

    public void setNumConta(Integer numConta){
        this.numConta = numConta;
    }
    //FIM Setters

    //Validadores de dados
    private void validaCliente(Cliente cliente){
        setCliente(cliente);
    }

    private void validaTipo(Boolean tipo){
        setTipo(tipo);
    }

    private void validaSaldo(Double saldo){
        if (saldo >= 0)
            setSaldo(saldo);
    }

    private void validaLimite(Double limite){
        if (limite >= 0)
            setLimite(limite);
    }

    private void validaNumConta(Integer numConta){
        setNumConta(numConta);
    }
    //FIM Validadores


    //Operações com as contas
    public void imprimirSaldo() {
        System.out.println("Conta " + this.numConta);
        System.out.println("Saldo: R$" + this.saldo);
    };

    public Boolean sacar(Double valor) {
      if (valor > saldo || valor <0) {
          return false;
      } else {
          this.saldo-= valor;
          System.out.println("Valor sacado: R$" + valor);
          System.out.println("Novo Saldo: R$" + this.saldo);
          return true;
      }
    }

    public Boolean depositar(Double valor) {
        if (valor < 0){
            return false;
        } else {
            this.saldo += valor;
            System.out.println("Valor depositado: R$" + valor);
            System.out.println("Novo Saldo: R$" + this.saldo);
            return true;
        }
    }

    public Boolean transferir(Conta destino, Double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        } else {
            System.out.println("Transferencia incompleta, saldo disponivel: R$" + this.saldo);
            return false;
        }
    }

    public void mostraConta(){
        System.out.println("Conta " + this.numConta);
        System.out.println("Proprietário " + this.cliente.getNome() + " CPF: " + this.cliente.getCPF());
        System.out.println("Saldo: R$" + this.saldo + " Limite: R$ " + this.limite);
    }

    public void mostraContaCompleta(){
        System.out.println("Conta " + this.numConta);
        System.out.println("Saldo: R$" + this.saldo + " Limite: R$ " + this.limite);
        cliente.mostraCliente();
    }
    //FIM Operações com as contas

}