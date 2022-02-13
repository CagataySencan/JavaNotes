import java.awt.print.Printable;
import java.util.*;

public class Main {
    public static void ekle(LinkedList<String> liste, String yeni) {
        ListIterator<String> iterator = liste.listIterator();
        while(iterator.hasNext()) {
            int compare = iterator.next().compareTo(yeni);
            if(compare == 0) {
                System.out.println("listede bu eleman var");
                return;
            }
            else if(compare < 0) {

            }
            else if(compare > 0) {
                iterator.previous();
                iterator.add(yeni);
                return;

            }
        }
        iterator.add(yeni);


    }

//    public static void bastir(LinkedList<String> liste) {
//
//        ListIterator<String> iterator = liste.listIterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//    }

//    public static int[] arrayDoldur(int sayi) {
//        Scanner scanner = new Scanner(System.in);
//        int output[] = new int[sayi];
//        for(int i = 0; i < sayi; i++) {
//            output[i] = scanner.nextInt();
//
//        }
//        return output;
//
//    }

//    private static void bastir(int[] array) {
//
//        for(int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//    }
//
//    public static double ortalama(int[] array) {
//        double j = 0;
//        for(int i = 0; i < array.length; i++) {
//            j += array[i];
//
//        }
//        return (double) j /array.length;
//    }
//
//    public static int[] terscevir(int[] array ) {
//        int[] newArray = new int[array.length];
//        for (int i = (array.length-1), j = 0; i >= 0 && j < array.length ; i--, j++) {
//            int temp = 0;
//            temp = array[i];
//            newArray[j] = temp;
//        }
//        return newArray;
//    }
    public static void main(String[] args) {
//         Arrayler
//
//         int[] a = new int[10]; // 10 tane depolanacak
//         int[] a = {31,42,69,100,131};
//        int[] a = new int[5];
//        for(int i = 0; i < 5; i++ ) {
//            a[i] = i*4 + 2;
//
//            System.out.println(a[i]);
//        }
//        Scanner scanner = new Scanner(System.in);
//        int[] b = new int[5];

//        for(int i = 0; i < 5; i++ ) {
//           b[i] = scanner.nextInt();
//
//        }


//         double[] b;

//        int b[] = {10,20,30,40,50};
//        System.out.println("Uzunluk = " + b.length);
//
//        bastir(b);
//        System.out.println(ortalama(b));
//         System.out.println(Arrays.toString(b)); arrayi bastırmak için
//         System.out.println(Arrays.toString(terscevir(b)));
//        int x[] = arrayDoldur(5);
//        int y[] = arrayDoldur(5);
//        Arrays.sort(y);
//        Arrays.sort(x);
//
//        if(Arrays.equals(x,y)) {
//            System.out.println("Eşitler bea");
//        }
//        else {
//            System.out.println("Eşit değiller bea");
//        }
//
//        System.out.println(Arrays.toString(x));
//        System.out.println(Arrays.toString(y));
//
//
//    }
//       Çok boyutlu Arrayler
//
//          int[][] array = new int[3][2];
//          int[][] array = {{31,69},{69,31}};
//
//          for (int i = 0; i < 2 ; i++) {
//              for(int j = 0; j < 2; j++) {
//                  System.out.print(array[i][j] + " ");
//              }
//              System.out.println(" ");
//        }
//
//        Foreach döngüsü
//        String[] array = {"Çuti","Tuha","ßaro","Keltoş"};
//        for(String a : array) {
//            System.out.println(a);
//        }
//
//        ArrayList, boyut belirtmeden kullanılan arraylerdir
//        ArrayList<String> arraylist = new ArrayList<String>();
//
//        arraylist.add("Tuha");
//        arraylist.add("Çuti");
//        arraylist.add("Tuha");
//
//        System.out.println(arraylist.get(0));
//        System.out.println(arraylist.size());
//        System.out.println(arraylist);
//
//        arraylist.remove("Tuha"); // index de verilebilir
//        System.out.println(arraylist);
//        System.out.println(arraylist.indexOf("Tuha")); // ilk gördüğü yerde durur, yoksa -1 döndürür
//        System.out.println(arraylist.lastIndexOf("Tuha")); // son index
//
//        arraylist.set(0,"ßaro");
//        System.out.println(arraylist);

//        Autoboxing ve Unboxing
//        ArrayList<String> liste = new ArrayList<String>();
//        ArrayList<Integer> liste2 = new ArrayList<Integer>();
//
//        for(int i = 0; i < 10 ; i++) {
//            liste2.add(i * 2); // Autoboxing
//
//
//        }
//
//        for(int i = 0; i < 10 ; i++) {
//            System.out.println(liste2.get(i)); // Unboxing
//
//
//        }
//
//        String sınıfı ve metodları
//        String a = "Çuti";
//        String b = new String("Çuti"); // farklı referanslar için oluşturulur
//
//        System.out.println("Harf sayısı = " + b.length());
//        System.out.println("0. index" + b.charAt(0));
//        for(int i = 0; i < a.length(); i++ ) {
//            System.out.println(a.charAt(i));
//        }
//        System.out.println(b.startsWith("Çu"));
//        System.out.println(b.endsWith("ti"));
//        System.out.println(b.indexOf('u'));
//        System.out.println(b.lastIndexOf('i'));
//        System.out.println(b.toLowerCase());
//        System.out.println(b.toUpperCase());
//
//        String x = "1453";
//        int c = Integer.parseInt(x); // string to int
//        int d = 1923;
//        String x1 = String.valueOf(d); // int to string

//        LinkedListlerde listelerdeki elemanlar birbirini referans olarak gösterir, bellekte daha fazla yer kaplar (hep referans hem değer taşıdıkları için)
//        ArrayList<String> diller = new ArrayList<String>();
//        diller.add("Jawa");
//        diller.add("Sikşarp");
//        diller.add("Götlin");
//        diller.add("Piton");
//        diller.add("Rüşt");
//
//
//
//        diller.add(1,"Siplasplas");
//
//        for (String s : diller) {
//            System.out.println(s);
//        }
        LinkedList<String> yerler = new LinkedList<String>();
//        yerler.add("Postane");
//        yerler.add("Market");
//        yerler.add("Okul");
//        yerler.add("Kütüphane");
//        yerler.add("Spor Salonu");
//        yerler.add("Ev");
//
//        Liste üzerinde gezinmek için iterator oluşturulmalı
//
//        yerler.add(4,"AVM");
//        yerler.remove(4);
//
//        bastir(yerler);
        ekle(yerler,"Postane");
        ekle(yerler,"Market");
        ekle(yerler,"Okul");
        ekle(yerler,"Kütüphane");
        ekle(yerler,"Spor Salonu");
        ekle(yerler,"Ev");

        System.out.println(yerler);




        































}
}
