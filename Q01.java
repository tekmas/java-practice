package practice_free;

import java.util.Scanner;

public class Q01 {
    /*
     Problem Tanımı :
     Basit 4 islem yapan bir hesap makinesi kodlayiniz....
     ullanicidan yapacagi işlem türünü secmesini saglayalinız.
     Kullanicidan iki sayi girmesini isteyiniz.
     Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yapacaginiz işlem türünü belirtin..: ");
        char islem = scan.next().charAt(0);
        System.out.print("islem icin birinci sayiyi giriniz :");
        double sayi1 = scan.nextDouble();
        System.out.print("islem icin ikinci sayiyi giriniz :");
        double sayi2 = scan.nextDouble();
        hesapMakinesi(islem, sayi1, sayi2);
    }
    public static void hesapMakinesi(char islem, double sayi1, double sayi2) {
        switch (islem) {
            case '*':
                System.out.println(sayi1 + "*" + sayi2 + " = " + (sayi1 * sayi2));
                break;
            case '+':
                System.out.println(sayi1 + "+" + sayi2 + " = " + (sayi1 + sayi2));
                break;
            case '/':
                System.out.println(sayi1 + "/" + sayi2 + " = " + (sayi1 / sayi2));
                break;
            case '-':
                System.out.println(sayi1 + "-" + sayi2 + " = " + (sayi1 - sayi2));
                break;
            default:
                System.out.println("dort islem harici bir secim yaptiniz..");
        }
    }
}
