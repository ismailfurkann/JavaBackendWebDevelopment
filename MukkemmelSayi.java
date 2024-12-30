import java.util.Scanner;
public class MukkemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("sayi giriniz: ");
        int sayi = inp.nextInt();

        if (mukemmelSayi(sayi)){
            System.out.println("bu sayi mukkemmel sayidir"+ sayi);
        }else {
            System.out.println("bu sayi mukkemmel sayi degildir "+ sayi);
        }
    }
    public static boolean mukemmelSayi(int sayi) {
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        return toplam == sayi;
    }
}
