import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int Limit = sc.nextInt();

        System.out.println("4 ün katları :");
        int Katları4 = 1;
        while (Katları4<=Limit){
            System.out.print(Katları4 + " ");
            Katları4 *= 4;
        }
        System.out.println("\n5 ün katları :");
        int Katları5 = 1;
        while (Katları5<=Limit){
            System.out.print(Katları5 + " ");
            Katları5 *= 5;
        }



    }
}