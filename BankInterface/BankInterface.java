import java.util.*;


public class BankInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, password;
        int hak = 3;
        int paraMiktar = 20000;
        int select;
        int miktar;

        while (hak > 0) {
            System.out.println("lütfen isminizi giriniz");
            name = sc.nextLine();

            System.out.println("lütfen şifre giriniz");
            password = sc.nextLine();

            if (name.equals("ismail") && password.equals("1234")) {
                System.out.println("bankamıza hoş geldiniz ");

                do {
                    System.out.println("1. Bakiye Sorgula");
                    System.out.println("2. Para Yatır");
                    System.out.println("3. Para Çek");
                    System.out.println("4. Çıkış");
                    select = sc.nextInt();
                    System.out.println(select);

                    switch (select) {
                        case 1:
                            System.out.println("Bakiyeniz =" + paraMiktar);
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğiniz miktarı giriniz");
                            miktar = sc.nextInt();
                            paraMiktar = paraMiktar + miktar;
                            System.out.println("yeni bakiyeniz =" + paraMiktar);
                            break;
                        case 3:
                            System.out.println("Çekmek istediğiniz miktarı giriniz");
                            miktar = sc.nextInt();
                            if (miktar > paraMiktar) {
                                System.out.println("yetersiz bakiye maksimum hesabınızdaki para miktarı kadar çekebilirsiniz !!");
                            }else {
                            paraMiktar = paraMiktar - miktar;
                            System.out.println("yeni bakiyeniz =" + paraMiktar);
                            }
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;

                        default:
                            System.out.println("lütfen geçerli bir seçim yapınız");
                            break;
                    }
                }while (select != 4) ;
                    break;

            }else{
                hak--;
                System.out.println("Yanlış girdiniz tekrar deneyiniz" + hak);

            }
            if (hak == 0) {
                System.out.println("sistem bloke edilmiştir");
            }

        }
    }
}
