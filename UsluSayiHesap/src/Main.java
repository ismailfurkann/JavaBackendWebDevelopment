import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Üssünü almak istediğiniz sayıyı yazınız : ");
        int n = sc.nextInt();
        System.out.println("Üssünü yazaınız : ");
        int r = sc.nextInt();
        int sonuc =1;
         for (int i = 1; i <= r; i++) {
             sonuc *= n ;

         }
        System.out.print(sonuc + " ");
    }
}