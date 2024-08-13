public class App {

    public static void main(String[] args) {
        User user = new User(
            "mconsolaro",
            "mari.consolaro",
            "mariana@gmail.com.br"
            
            
        );
        System.out.println(user.email);
        System.out.println(user.username);
        System.out.println(user.password);

    }
}
