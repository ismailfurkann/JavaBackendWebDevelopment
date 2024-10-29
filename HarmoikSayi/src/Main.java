import java.util.*;
public class Main {
    public static double HarmonikSayi(double harmonik) {
        double result = 0;
        for (double i = 1; i <= harmonik; i++) {
         result += 1/i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Harmonik Sayıyı giriniz: ");
        double n = input.nextDouble();
        System.out.println("Sonucunuz : "+ HarmonikSayi(n));

    }
}