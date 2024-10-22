import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("a sayısını giriniz:");
        a = sc.nextInt();
        System.out.println("b sayısını giriniz:");
        b = sc.nextInt();
        System.out.println("c sayısını giriniz:");
        c = sc.nextInt();

        if (a >b && a>c){
            if (b>c){
                System.out.println("a > b > c");
            }else if (c>b){
                System.out.println("a > c > b");
            }

        }
        if (b >a && b>c){
            if (a>c){
                System.out.println("b > a > c");
            }else if (c>a){
                System.out.println("b > c > a");
            }

        }
        if (c>a && c>b){
            if (b>a){
                System.out.println("c > b > a");
            }else if (a>b){
                System.out.println("c > a > b");
            }

        }
        sc.close();

    }
}