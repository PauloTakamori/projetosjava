package banco;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Alexandre","123456789","11972860961","Rua Sao genaro,476");
        Cliente cliente2 = new Cliente("Raniele","987654321","1125891478","Rua Vesurio, 10");
        Cliente cliente3 = new Cliente("Paulo","147852369","11987456321","Rua Francisco de Camargo, 476");

        Conta conta1 = new Conta("0160","10158458",cliente1);
        Conta conta2 = new Conta("0170","32165454",cliente2);
        Conta conta3 = new Conta("0365","65498714",cliente3);

        System.out.println("******************************************************************************************************");

        System.out.println("Dados do Cliente 1 ");
        System.out.println("Nome Cliente: " + cliente1.getNome());
        System.out.println("CPF Cliente: " + cliente1.getCpf());
        System.out.println("Telefone Cliente: " + cliente1.getTelefone());
        System.out.println("Endereco Cliente: " + cliente1.getEndereco());

        System.out.println("******************************************************************************************************");

        System.out.println("Dados da Conta 1 ");
        System.out.println("Agencia: " + conta1.getAgencia());
        System.out.println("Numero da Conta: " + conta1.getNumeroConta());
        System.out.println("Saldo da Conta: " + conta1.getSaldo());
        System.out.println("Nome do Cliente: " + conta1.getCliente().getNome());

        System.out.println("******************************************************************************************************");

        System.out.println("Dados do Clinte 2 ");
        System.out.println("Nome Clinte: " + cliente2.getNome());
        System.out.println("CPF Cliente: " + cliente2.getCpf());
        System.out.println("Telefone Cliente: " + cliente2.getTelefone());
        System.out.println("Endereco Cliente: " + cliente2.getEndereco());

        System.out.println("******************************************************************************************************");

        System.out.println("Dados da Conta 2 ");
        System.out.println("Agencia: " + conta2.getAgencia());
        System.out.println("Numero da Conta: " + conta2.getNumeroConta());
        System.out.println("Saldo da Conta: " + conta2.getSaldo());
        System.out.println("Nome do Cliente: " + conta2.getCliente().getNome());

        System.out.println("******************************************************************************************************");

        Conta.depositar(conta1,100);
        Conta.depositar(conta2,200);

        System.out.println("Saldo Atual apos o Deposito na Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo Atual apos o Deposito na Conta 2: " + conta2.getSaldo());

        System.out.println("******************************************************************************************************");

        /*Conta.sacar(conta1,50);
        Conta.sacar(conta2,100);*/

        System.out.println("Saldo apos o Saque da Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo apos o Saque da Conta 2: " + conta2.getSaldo());

        System.out.println("******************************************************************************************************");

        Conta.transferir(conta2,conta1,20);

        System.out.println("Saldo da Conta 1" + conta1.getSaldo());
        System.out.println("Saldo da Conta 2" + conta2.getSaldo());

        System.out.println("Detalhe Transferencia ");
        System.out.println("Conta origem: " + conta1.getAgencia() + " Numero da Conta: " + conta1.getNumeroConta() + " Saldo: " + conta1.getSaldo() +
                " Nome Cliente: " + conta1.getCliente().getNome());

        System.out.println("Detalhe Transferencia ");
        System.out.println("Conta origem: " + conta2.getAgencia() + " Numero da Conta: " + conta2.getNumeroConta() + " Saldo: " + conta2.getSaldo() +
                " Nome Cliente: " + conta2.getCliente().getNome());
    }

}
