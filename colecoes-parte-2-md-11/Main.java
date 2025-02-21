import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        List<String[]> pessoas = Arrays.asList(
            new String[]{"Ana", "F"},
            new String[]{"Carlos", "M"},
            new String[]{"Mariana", "F"},
            new String[]{"Pedro", "M"},
            new String[]{"Juliana", "F"},
            new String[]{"Roberto", "M"}
        );

        
        Set<String> masculino = new HashSet<>();
        Set<String> feminino = new HashSet<>();

        
        for (String[] pessoa : pessoas) {
            String nome = pessoa[0];
            String sexo = pessoa[1];

            if (sexo.equalsIgnoreCase("M")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino.add(nome);
            }
        }

        
        System.out.println("Pessoas cadastradas:");
        System.out.println("Masculino: " + masculino);
        System.out.println("Feminino: " + feminino);
    }
}
