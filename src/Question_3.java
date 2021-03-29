import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_3 {
    public static List<String> urunler = new ArrayList<>();
    public static List<Double> fiyatlar = new ArrayList<>();
    public static double toplamfiyat=0;

    public static void main(String[] args) {
       // 2. Adım:
       // Başka bir ürün isteyip istemediğini sorun -İstemiyorsa
       //         * Baştan herhangi bir ürün seçmesini isterse toplam tutarı göster
       // 9:49
       // Alışverişi bitirmek isteyene kadar bu işlemi tekrarlayın.
       //         * 3. Adım:
       // Müşteri herhangi bir ürün seçtiğinde ürünün fiyatını toplam tutara ekler.
       // 9:49
       // 4. Adım:
       // Alışveriş bittiğinde toplam tutarı gösterin.
       //         *
       // *CustomerChoice() ve cash () adlı iki yöntem oluşturun
        char Evethayır = 'e';
        urunler.add("Patates");
        fiyatlar.add(0.7);
        urunler.add("Domates");
        fiyatlar.add(1.5);
        urunler.add("Elma");
        fiyatlar.add(1.2);
        do {
            int i = 1;
            for (String w: urunler) {
                System.out.println(i +"."+ w);
                i++;
            }
            Scanner scan = new Scanner(System.in);
            System.out.print("Almak istediginiz urunu kodunu giriniz: ");
            int secim = scan.nextInt();
            System.out.print("Kac kg almak istiyorsunuz: ");
            int kg = scan.nextInt();
            fiyataekle(secim-1,kg);
            System.out.println("Cıkmak istiyor musun(e/h)");
            Evethayır = scan.next().charAt(0);
        }while(Evethayır == 'h');
        System.out.println("Aldıgınız urunlerin toplam fiyati = " + toplamfiyat);
    }
    public static void fiyataekle(int index,int kilo) {
        toplamfiyat = fiyatlar.get(index) * kilo;
    }


}

