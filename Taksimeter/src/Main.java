import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km ;
        double perKm = 2.20 , total , startPrice = 10 ;
         System.out.println("Enter the number of Km");
        km = sc.nextInt();
        total = km * perKm;
        total += startPrice;

        total = (total < 20  ) ? 20: total;
        System.out.println("Total is " + total);
    }
}