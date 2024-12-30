import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob= 1;
        int sayi = 1;
        System.out.println("lutfen n1 i giriniz... ");
        int n1 = input.nextInt();
        System.out.println("lutfen n2 i giriniz... ");
        int n2 = input.nextInt();
        while (sayi <= n1 && sayi <= n2) {
            if (n1 % sayi == 0 && n2 % sayi == 0) {
                ebob= sayi;
            }
            sayi++;
        }
        System.out.println("EBOB: " + ebob);
        int ekok =(n1 * n2) / ebob;
        System.out.println("EKOK: " + ekok);
    }
}
