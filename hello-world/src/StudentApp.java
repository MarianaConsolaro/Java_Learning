public class StudentApp {
    public static void main(String[] args) throws Exception {
        int age = 18;
        String initialName = "M";
        String initialLastName = "C";
        double media = 10.0;
        boolean approved = true;
        String name = "Mariana";
        String lastName = "Consolaro";

        System.out.println(age);
        System.out.println(initialName);
        System.out.println(initialLastName);
        System.out.println(media);
        System.out.println(approved);
        System.out.println(name + " " + lastName);
        System.out.println(initialName + " " + initialLastName);
        //printing a text and not a variable
        System.out.println("Mariana");

        System.out.println(
            age + ", " 
            + initialName + ", " 
            + initialLastName + ", " 
            + media + ", " 
            + approved + ", " 
            + name + " " + lastName
        );

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(6));
        
        System.out.println(name.length());

        System.out.println(name.charAt(name.length() - 1));

        System.out.println(name.equals(lastName));

    }
}
