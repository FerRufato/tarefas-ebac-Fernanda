import java.util.*;

public class SepararPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes e gêneros no formato 'Nome-M' ou 'Nome-F', separados por vírgula:");
        String input = scanner.nextLine();

       
        String[] entradas = input.split(",");

        
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        
        for (String entrada : entradas) {
            String[] partes = entrada.trim().split("-"); 
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim().toUpperCase();

                if (genero.equals("M")) {
                    masculinos.add(nome);
                } else if (genero.equals("F")) {
                    femininos.add(nome);
                }
            }
        }

        System.out.println("\nGrupo Masculino:");
        for (String nome : masculinos) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : femininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
