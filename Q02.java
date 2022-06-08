package practice_free;

import java.util.ArrayList;

public class Q02 {
    public static void main(String[] args) {
       // 100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
       // Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        ArrayList <Integer> list=new ArrayList<Integer>();

        for (int i = 100; i >0 ; i--) {
         if (i%13==0){

             System.out.println(i+" ");
         }
        }
    }
}
