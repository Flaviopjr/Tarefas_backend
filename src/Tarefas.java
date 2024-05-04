/**
 * @author flaviopjr
 */
import java.util.Scanner;
public class Tarefas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular suas notas.");
        System.out.println("Digite sua primeira nota: ");
        Integer nota1 = scanner.nextInt();
        System.out.println("A sua primeira nota é: " + nota1);
        System.out.println("Digite sua segunda nota: ");
        Integer nota2 = scanner.nextInt();
        System.out.println("Sua segunda nota é: " + nota2);
        System.out.println("Digite a terceira nota: ");
        Integer nota3 = scanner.nextInt();
        System.out.println("Sua terceira nota é: " + nota3);
        System.out.println("Digite sua última nota: ");
        Integer nota4 = scanner.nextInt();

        Integer result = nota1 + nota2 + nota3 + nota4 / 4;

    public static String getResult (Integer result) {
            if (result >= 7) {
                System.out.println("Você está aprovado.");
            } else if (result >= 5 && result < 7) {
                System.out.println("Você está de recuperação.");
            } else if (result < 5) {
                System.out.println("Você está reprovado.");
            }
        }
    }
}