package funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //chama teclado no padrao americano
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in); //solicitando ao usuario informacoes de entrada de dados no programa

        List<Employee> list = new ArrayList<>();
        System.out.print("Quantos funcionarios serão registrados? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (hasId(list,id)){
                System.out.println("ID já obtido! Tente novamente");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id,name,salary);
            list.add(emp);

        }
        System.out.println();
        System.out.print("Entre com o funcionario que tera o aumento de salario: ");
        int idsalary = sc.nextInt();

        Integer pos = position(list,idsalary);
        if (pos == null){
            System.out.println("Esse ID não existe!!!");
        }else {
            System.out.println("Entre com a porcentagem: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("Lista de Employees: ");
        for (Employee e:list){
            System.out.println(e);
        }
        sc.close();
    }

    //metodo para determinar a posicao o ID na lista Employee
    public static Integer position(List<Employee> list,int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list,int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        //fazer varredura da lista Employee, filtrando e pegando apenas o "id", o que for diferente = "null"
        return emp != null;
    }



}
