/**
 * @author flaviopjr
 */
import java.util.Scanner;
public class Tarefas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("A sua idade é: " + idade);

        System.out.print("Digite a sua idade: ");
        Integer idade1 = scanner.nextInt();
        System.out.println("A sua idade é: " + idade1);

    }
}