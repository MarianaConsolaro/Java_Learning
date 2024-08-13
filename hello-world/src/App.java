public class App {

    public static void main(String[] args) {
        User user1 = new User(
            "mconsolaro",
            "mari.consolaro",
            "mariana@gmail.com.br"            
        );

        User user2 = new User(
            "user2",
            "user2",
            "user2@gmail.com.br"
        );

        user1.active = true;
        //System.out.println(user1.isActive());
        //System.out.println(user2.isActive());
        //System.out.println(User.getCharacterLimit());
  
        System.out.println(user1.username);
        System.out.println(user2.username);
        System.out.println(User.NUMBER_OF_CHARACTERS_USER);
    }
}
