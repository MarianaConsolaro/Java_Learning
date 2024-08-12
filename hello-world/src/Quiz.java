import java.util.Scanner;

public class Quiz {

    public static void main (String [] args) {
        String question = "Qual a melhor linguagem de programaçãp?";
        String alternative1 = "1 - javascript";
        String alternative2 = "2 - python";
        String alternative3 = "3 - java";
        int rightResponse = 3;

        System.out.println(question);
        System.out.println(alternative1);
        System.out.println(alternative2);
        System.out.println(alternative3);
        System.out.println("Digite a resposta certa (1,2 ou 3):");

        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt();

        if (response == rightResponse){
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Que pena! A resposta era: " + rightResponse);
        }
    }


}
