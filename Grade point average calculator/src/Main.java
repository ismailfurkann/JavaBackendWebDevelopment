
import java.util.Scanner;

class OrtalamaHesaplayıcı {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç dersin var?");
        int dersSayisi = sc.nextInt();
        sc.nextLine();

        Double ToplamNot = 0.0;

        for (int i = 1; i < dersSayisi + 1; i++) {
            System.out.print(i + ". dersin adını girin: ");
            String dersAdi = sc.nextLine();

            System.out.print(dersAdi + " dersinin notunu girin: ");
            double not = sc.nextDouble();
            sc.nextLine();

            ToplamNot += not;
        }
        Double ortalama = ToplamNot / dersSayisi;
        System.out.println("Ortalamanız: "+ortalama);

    }
}