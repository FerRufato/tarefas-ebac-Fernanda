import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OrdenaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgula:");
        String input = scanner.nextLine();

       
        String[] nomes = input.split(",");

        
        Set<String> nomesOrdenados = new TreeSet<>();

        for (String nome : nomes) {
            nomesOrdenados.add(nome.trim()); 
        }

       
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomesOrdenados) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
