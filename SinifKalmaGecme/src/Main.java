import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Mat, fizik, turkce, kimya, muzik,ortalama;
        System.out.print("Matematik notunuzu giriniz: ");
        Mat = sc.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = sc.nextInt();
        System.out.println("Turkce notunuzu giriniz: ");
        turkce = sc.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = sc.nextInt();
        System.out.print("Muzik notunuzu giriniz: ");
        muzik = sc.nextInt();

        ortalama = (fizik + turkce + kimya + muzik)/5;

        if (ortalama >= 60){
            System.out.println("Tebrikler sınıfı geçtiniz");
            System.out.println("Ortalaman: " + ortalama);
        }else {
            System.out.println("Sınıfı geçemedin");
            System.out.println("Ortalaman: " + ortalama);
        }

    }
}