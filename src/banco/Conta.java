package banco;

public class Conta {

    private String agencia;
    private String numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(String agencia, String numeroConta, Cliente cliente) {
        super();
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 0.00;
        this.cliente = cliente;
    }

    /*public Conta(Cliente cliente){
        super();
        this.cliente = cliente;
    }*/

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static double depositar(Conta conta, double valorDepositado){

        conta.setSaldo(conta.getSaldo() + valorDepositado);
        return valorDepositado;
    }

    public static double sacar(Conta conta, double valorSacado){

        conta.setSaldo(conta.getSaldo() - valorSacado);
        return valorSacado;
    }

    public static double transferir(Conta contaOrigem, Conta contaDestino, double valorTransferido){

        contaOrigem.setSaldo(contaOrigem.getSaldo() - valorTransferido);
        contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferido);
        return valorTransferido;
    }

}
