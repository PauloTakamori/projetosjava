package empresa;

public class Main {

    public static void main(String[] args) {
        //atributos do objetos
        Funcionarios funcionario1 = new Funcionarios("0001","Paulo Takamori","Vendedor",2000.00);
        Funcionarios funcionario2 = new Funcionarios("0002","Raniele Takamori","Gerente",3000.00);
        Funcionarios funcionario3 = new Funcionarios("0003","Alexandre Takamori","Assistente",1000.00);
        //cadastro de dados dos funcionarios
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Matricula do Funcionario: " + funcionario1.getMatricula());
        System.out.println("Nome do Funcionario: " + funcionario1.getNome());
        System.out.println("Cargo do Funcionario: " + funcionario1.getCargo());
        System.out.println("Salario: R$" + funcionario1.getSalario());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Matricula do Funcionario: " + funcionario2.getMatricula());
        System.out.println("Nome do Funcionario: " + funcionario2.getNome());
        System.out.println("Cargo do Funcionario: " + funcionario2.getCargo());
        System.out.println("Salario: R$" + funcionario2.getSalario());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Matricula do Funcionario: " + funcionario3.getMatricula());
        System.out.println("Nome do Funcionario: " + funcionario3.getNome());
        System.out.println("Cargo do funcioanrio: " + funcionario3.getCargo());
        System.out.println("Salario: R$" + funcionario3.getSalario());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        Funcionarios.aumentoVendor(funcionario1,funcionario1.getSalario());
        System.out.println("Aumento para os Vendedores: R$" + funcionario1.getSalario());

        Funcionarios.aumentoGerente(funcionario2,funcionario2.getSalario());
        System.out.println("Aumento para os Gerentes: R$" + funcionario2.getSalario());

        Funcionarios.aumentoAssistente(funcionario3,funcionario3.getSalario());
        System.out.println("Aumetos para os Assistentes: R$" + funcionario3.getSalario());








    }
}
