
import java.util.Scanner;

public class NotasAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();
        
       
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        
        System.out.println("A média do aluno é: " + media);
        
        
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }
        
        scanner.close(); 
    }
}
