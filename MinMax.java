import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("kac adet sayi girilecek ?");
    int girilensayi = input.nextInt();
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 1; i <= girilensayi; i++) {

        System.out.println(i + ". sayiyi giriniz ");
        int sayi = input.nextInt();


        if (sayi > max) {
            max = sayi;
        }
        if (sayi < min) {
            min = sayi;
        }


    }
    System.out.println("min : " + min);
    System.out.println("max : " + max);
    }
}
