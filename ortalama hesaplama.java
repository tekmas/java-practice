package practice_free;


import java.util.Scanner;

public class Q6 {
    public static void main (String[] args) {
        Scanner not=new Scanner(System.in);
        System.out.println("matematik notunuzu giriniz");
        int mat=not.nextInt();
        System.out.println("fizik notunuzu giriniz");
        int fizik=not.nextInt();
        System.out.println("kimya notunuzu giriniz");
        int kimya=not.nextInt();
        System.out.println("türkçe notunuzu giriniz");
        int turkce=not.nextInt();
        System.out.println("tarih notunuzu giriniz");
        int tarih=not.nextInt();
        System.out.println("müzik notunuzu giriniz");
        int muzik=not.nextInt();
        int ortalama=((mat+fizik+kimya+turkce+tarih+muzik)/6);
        boolean durum=ortalama>60;
        System.out.println(durum?"geçti":"kaldı");
           }
}
