import java.util.Scanner;

public class salary {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora: ");
        double hourValue = scanner.nextDouble();
        System.out.println("Digite o número de horas:");
        double numberOfHours = scanner.nextDouble();

        double salary = calculateSalary(hourValue, numberOfHours);
        System.out.println(salary);
    }

    public static double calculateSalary(double hourValue, double numberOfHours) {
        double salary = hourValue * numberOfHours;
        return salary;
    }

}
