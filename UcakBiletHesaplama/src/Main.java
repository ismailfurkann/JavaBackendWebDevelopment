import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double normalTutar;
        double indirimlitutar = 0;
        double birimFiyat = 0.10;


        System.out.println("Yaşınızı giriniz: ");
        int yas = sc.nextInt();

        System.out.print("Mesafenizi giriniz (KM): ");
        int mesafe = sc.nextInt();

        System.out.println("Yolculuk tipini giriniz (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculuktipi = sc.nextInt();


        if (mesafe <= 0 || yas <= 0 || (yolculuktipi != 1 && yolculuktipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }


        normalTutar = mesafe * birimFiyat;
        indirimlitutar = normalTutar;


        if (yas <= 12) {
            System.out.println("%50 indirimli fiyat üzerinden ücret alınacaktır.");
            indirimlitutar *= 0.50;
        } else if (yas >= 12 && yas <= 24) {
            System.out.println("%10 indirimli fiyat üzerinden ücret alınacaktır.");
            indirimlitutar *= 0.90;
        } else if (yas > 64) {
            System.out.println("%30 indirimli fiyat üzerinden ücret alınacaktır.");
            indirimlitutar *= 0.70;
        }


        if (yolculuktipi == 2) {
            indirimlitutar *= 0.80;
        }


        System.out.println("Normal bilet fiyatı: " + normalTutar + " TL");
        System.out.println("İndirimli bilet fiyatı: " + indirimlitutar + " TL");
    }
}
