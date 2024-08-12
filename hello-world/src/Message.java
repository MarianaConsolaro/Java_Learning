import java.util.Scanner;

public class Message {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        int number = scanner.nextInt();

        //String message;
        if ( number >=1 && number <= 5) {
            String message = "Quem avisa amigo é!";
        } else if (number >= 6 && number <= 10) {
            String message = "Você é o que você come!";
        } else {
            String message = "Informe uma opção válida.";
            System.out.println(message);
        }
    }



}
