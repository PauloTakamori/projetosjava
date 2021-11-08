package empresa;

public class Funcionarios {
    //Atributos para Classe Funcionario
    private String matricula;
    private String nome;
    private String cargo;
    private double salario;
    //Consultor
    public Funcionarios(String matricula, String nome, String cargo, double salario){
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    //setter
    public void setMatricula(String matricula) {

        this.matricula = matricula;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    //getter pegar informacao/acessar a informacao

    public String getMatricula() {

        return matricula;
    }

    public String getNome() {

        return nome;
    }

    public String getCargo() {

        return cargo;
    }

    public double getSalario() {

        return salario;
    }
    //reaguste do salario gerente 15%
    public static double aumentoGerente(Funcionarios funcionarios, double valorreajustado){
        funcionarios.setSalario(((funcionarios.getSalario() * 15) / 100)+valorreajustado);
        return valorreajustado;
    }
    //reajuste do salario vendedos 10%
    public static double aumentoVendor(Funcionarios funcionarios, double valorreajustado){
        funcionarios.setSalario(((funcionarios.getSalario() * 10) / 100)+valorreajustado);
        return valorreajustado;
    }
    //reajuse do salario assistente 5%
    public static double aumentoAssistente(Funcionarios funcionarios, double valorreajustado){
        funcionarios.setSalario(((funcionarios.getSalario() * 5) / 100)+valorreajustado);
        return valorreajustado;
    }

}
