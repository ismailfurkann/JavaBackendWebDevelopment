import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Tutar;
        double kdvRate = 0.15;

        System.out.println("Please enter your Tutar: ");
        Tutar = sc.nextDouble();
        double KdvTutar = Tutar * kdvRate;
        double Total = KdvTutar + Tutar;
        System.out.println("Your Tutar without Kdv : " + Tutar);
        System.out.println("Your Kdv rate is : " + KdvTutar);
        System.out.println("Your Total Tutar is : " + Total);

        sc.close();
    }
}