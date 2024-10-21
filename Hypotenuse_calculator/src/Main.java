import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        double c;
        System.out.println("Please enter the first edge(a): ");
        a = sc.nextInt();
        System.out.println("Please enter the second edge(b): ");
        b = sc.nextInt();
        c = Math.sqrt(a*a + b*b);
        System.out.println("Hypotenuse is : " + c );
     sc.close();
    }
}