import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double armut = 2.14;
    double elma = 3.67;
    double domates = 1.11;
    double muz = 0.95;
    double patlıcan = 5.00;
    

    System.out.println("kaç kilo armut aldın ?");
    double armutKg = sc.nextDouble();

    System.out.println("kaç kilo elma aldın ?");
    double elmaKg = sc.nextDouble();

    System.out.println("kaç kilo domates aldın ?");
    double domatesKg = sc.nextDouble();

    System.out.println("kaç kilo muz aldın ?");
    double muzKg = sc.nextDouble();

    System.out.println("kaç kilo patlıcan aldın ?");
    double patlKg = sc.nextDouble();
    System.out.print("Toplamda ");
    System.out.println(  (armut * armutKg) + (elmaKg*elmaKg) + (domatesKg*domatesKg) + (muzKg*muzKg) + (patlKg*patlKg) + " TL");











    }
}