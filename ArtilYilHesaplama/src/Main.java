import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yılı giriniz: : ");
        int Artikyil = sc.nextInt();

        if (Artikyil % 4 == 0) {
            if (Artikyil % 100 == 0) {
                if (Artikyil % 400 == 0) {
                    System.out.println(Artikyil + " yılı bir artık yıldır");
                } else {
                    System.out.println(Artikyil + " yılı bir artık yıl değildir");
                }
            }else {
                System.out.println(Artikyil + " yılı bir artık yıldır");
            }
        }else {
            System.out.println(Artikyil + " yılı bir artık yıl değildir");
        }


    }
}