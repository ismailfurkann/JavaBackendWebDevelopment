import java.util.Scanner;
public class Main {

    public static int faktoriyel(int sayi) {
        int sonuç = 1;
        for (int i = 2; i <= sayi; i++) {
            sonuç *= i;
        }
        return sonuç;
    }


    public static int kombinasyon(int n, int r)
    {
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Kombinasyon Sayisini giriniz: ");
       int n = input.nextInt();
       int r = input.nextInt();

        int sonuc = kombinasyon(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + sonuc);
    }
}

