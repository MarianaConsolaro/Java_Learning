public class App {

    public static void main(String[] args) {
        Student student1 = new Student (
            "Estudante 1", 2025, 10.0);
            Student student2 = new Student (
            "Estudante 2", 2024, 8.0);

            student1.setYearGraduation(2026);
            System.out.println(student1.yearGraduation);
            System.out.println(student2.yearGraduation);
    }

}






    // public static void main(String[] args) {
    //     User user1 = new User(
    //         "mconsolaro",
    //         "mari.consolaro",
    //         "mariana@gmail.com.br"            
    //     );

    //     User user2 = new User(
    //         "user2",
    //         "user2",
    //         "user2@gmail.com.br"
    //     );

    //     user1.active = true;
    //     //System.out.println(user1.isActive());
    //     //System.out.println(user2.isActive());
    //     //System.out.println(User.getCharacterLimit());
  
    //     System.out.println(user1.username);
    //     System.out.println(user2.username);
    //     System.out.println(User.NUMBER_OF_CHARACTERS_USER);
    // }

