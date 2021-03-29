import java.util.Scanner;

public class Question_2 {
    public static final String [] rakamlar= {"","bir","iki","uc","dort","bes","altı","yedi","sekiz","dokuz"};
    public static final String [] onlar = {"","on","yirmi","otuz","kırk","elli","altmıs","yetmis","seksen","doksan"};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yuzden kucuk sayıyı gir: ");
        int sayi = scan.nextInt();
        Cevir(sayi);
    }
    public static void Cevir(int n) {
        int bir = n % 10;
        int on = (n - bir) / 10;
        System.out.println(onlar[on] +rakamlar[bir] );
    }
}
