import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int derece ;
        System.out.println("Bu günün sıcaklığını giriniz.");
        derece = sc.nextInt();

        if (derece > 25){
            System.out.println("25° den sıcak havalrda yapılabilecek etkinlikler:\nyüzme,\nPlaj voleybolu,\nBisiklet sürmek,\nDoğa yürüyüşleri (trekking),\nPiknik,\nBahçe veya parkta kitap okumak.");

        }
        else if ( 15 < derece && derece < 25){
            System.out.print("15°C ile 25°C arasında yapılabilecek etkinlikler:\n" +
                    "1. Koşu veya Jogging\n" +
                    "2. Bisiklet sürmek\n" +
                    "3. Doğa yürüyüşü (Trekking)\n" +
                    "4. Parkta yürüyüş\n" +
                    "5. Piknik\n" +
                    "6. Kamp yapmak\n" +
                    "7. Açık hava egzersizleri (fitness, yoga)\n" +
                    "8. Tarihi yerleri gezmek\n" +
                    "9. Fotoğraf çekimi\n" +
                    "10. Açık hava sporları (tenis, futbol, basketbol)\n");
        }
        else if ( 5 < derece && derece < 15){
            System.out.print("5°C ile 15°C arasında yapılabilecek etkinlikler:\n" +
                    "1. Yürüyüş\n" +
                    "2. Hafif koşu\n" +
                    "3. Fotoğraf çekimi (doğa veya şehir)\n" +
                    "4. Doğa yürüyüşü (Trekking)\n" +
                    "5. Müze veya sergi gezmek\n" +
                    "6. Bisiklet sürmek\n" +
                    "7. Açık hava pazarlarına gitmek\n" +
                    "8. Parkta spor yapmak\n" +
                    "9. Kamp yapmak (soğuk havaya uygun ekipmanlarla)\n" +
                    "10. Bahçede çalışmak (bitki dikimi, düzenleme)\n");

        }
        else if (derece < 5){
            System.out.print("5°C'nin altında yapılabilecek etkinlikler:\n" +
                    "1. Kar yürüyüşü\n" +
                    "2. Kayak veya snowboard\n" +
                    "3. Buz pateni\n" +
                    "4. Sıcak içeceklerle kafede vakit geçirmek\n" +
                    "5. Sinema veya tiyatroya gitmek\n" +
                    "6. Müze gezmek\n" +
                    "7. Kapalı spor salonlarında egzersiz yapmak\n" +
                    "8. Evde film izlemek veya kitap okumak\n" +
                    "9. Kaplıca veya termal tesislere gitmek\n" +
                    "10. Kar topu oynamak veya kardan adam yapmak\n");

        }


    }
}