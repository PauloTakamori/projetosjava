package mapprogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramTest {

    public static void main(String[] args) {
        //bloco onde o programa mostra a lista completa
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> votes = new LinkedHashMap<>();

        System.out.print("Entre com o caminho do Arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                //System.out.println(line);
                //line = br.readLine();

                //bloco onde o programa mostra apenas os candidatos mais votados
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)){
                    int votesSoFar = votes.get(name);
                    votes.put(name, count + votesSoFar);
                }else {
                    votes.put(name, count);
                }
                line = br.readLine();
            }
            for (String key : votes.keySet()){
                System.out.println(key + ": " + votes.get(key));
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();


    }

}
