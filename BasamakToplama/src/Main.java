import java.util.*;
public class Main {


public static int BasamakToplama(int a ) {
    int toplam = 0;
    while (a > 0) {
        toplam += a % 10;
        a /= 10;
    }
    return toplam;
}





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Basamakları hesaplanacak sayıyı giriniz: ");
        int girileceksayi = sc.nextInt();
        System.out.println(BasamakToplama(girileceksayi));


    }
}
