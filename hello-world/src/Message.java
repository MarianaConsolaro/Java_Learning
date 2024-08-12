import java.util.Scanner;

public class Message {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        int number = scanner.nextInt();

        if ( number >=1 && number <= 5) {
            System.out.println("Quem avisa amigo é!");
        } else if (number >= 6 && number <= 10) {
            System.out.println("Você é o que você come!");
        } else {
            System.out.println("Informe uma opção válida.");
        }
    }

}
