package ifelse;

public class CondicaoComposta {
    public static void main(String[] args) {

        int hora1 = 18;

        if (hora1 < 12){
            System.out.println("Bom Dia!");
         }else{
            if (hora1 < 18){
                System.out.println("Boa Tarde!");
            }else{
                System.out.println("Boa Noite!");
            }
        }





    }
}
