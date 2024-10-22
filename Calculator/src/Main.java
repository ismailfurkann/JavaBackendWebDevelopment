import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,seçim;
        System.out.println("1. sayıyı giriniz");
        n1 = sc.nextInt();
        System.out.println("2. sayıyı giriniz");
        n2 = sc.nextInt();

        System.out.println("1-Toplama\n2-Çıkartma\n3-çarpma\n4-Bölme\n");
        System.out.println("Seçiminiz :");
        seçim = sc.nextInt();


        switch (seçim){
            case 1:
                System.out.println("Toplamı ="+(n1 + n2));
                break;
            case 2:
                System.out.println("Çıkartma ="+(n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma ="+(n1 * n2));
                break;
            case 4:
                System.out.println("Bölümü ="+(n1 / n2));
                break;


        }





    }
}