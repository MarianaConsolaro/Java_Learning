import java.util.Scanner;

public class MusicRepeat {

    public static void main(String [] args) {
        boolean repeat = true;

        while (repeat == true) {
            System.out.println("Tocar a música.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Devo repetir a música(true ou false)?");
            repeat = scanner.nextBoolean();
        }

        System.out.println("Encerrando a música");
    }
}
