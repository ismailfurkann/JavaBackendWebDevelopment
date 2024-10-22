import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName , Password ;
        System.out.println("Enter your username: ");
        userName = sc.nextLine();
        System.out.println("Enter your password: ");
        Password = sc.nextLine();

        if (userName.equals("ismailfurkan")&&Password.equals("skopje123")) {
            System.out.println("You are logged in");
        }else {
            System.out.println("You are not logged in");
        }


    }
}