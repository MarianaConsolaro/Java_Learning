public class Method {

    public static void main(String[] args) {
        System.out.println("Antes do Alarme");
        snackTimeAlarm();
        System.out.println("Depois do Alarme");

        double media = calculateMedia(7.0, 8.0, 9.0);

        if(media >= 7.0){
            System.out.println("Aprovado");
        }else {
        System.out.println("Reporvado");
        }
    }

    public static void snackTimeAlarm() {
        System.out.println("Hora do Lanche!");
    }

    public static double calculateMedia(double grade1, double grade2, double grade3) {
        double media = (grade1 + grade2 + grade3) / 3.0;
        System.out.println(media);
        return media;
    }

}
