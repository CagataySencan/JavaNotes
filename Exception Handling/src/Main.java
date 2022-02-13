
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void ucuncuFonksiyon() {

        try {
            int a = 12/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Sayı 0'a bölünemez");
        }
    }
    public static void ikinciFonksiyon() {
        ucuncuFonksiyon();
    }
    public static void birinciFonksiyon() {
        ikinciFonksiyon();
    }
    public static void main(String[] args)  {
        // Bir catch bloğu çalıştıktan sonra diğer catch blokları çalışamaz.
//        try{
//            String s = null;
//            System.out.println(s.hashCode());
//        }
//        catch (NullPointerException e) {
//            System.out.println("Null referans");
//            e.printStackTrace();
//        }
//        finally {
            // Yakalanmayan exceptionlarda da bu blok çalışır
//            System.out.println("Finally blogu çalışıyor");
//        }

        Scanner scanner = new Scanner(System.in);
        int yas = scanner.nextInt();
        try {
            mekanci(yas);
        }
        catch (InvalidAgeException e ) {
            e.printStackTrace();
        }
//        try {
//            mekanci(yas);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try{
//            mekanci(yas);
//        }
//        catch (Exception e) {
//            System.out.println("18 yaşından küçküler mekana giremez");
//        }

        // Runtime Exceptiondan türeyen exceptionlar unchecked diğerleri checked exceptiondur
        // Checked exceptionlar java tarafından öngörüp uyarı verilen exceptionlardır.
        // Checked excepitonlar metodlarda belirtilmek zorundadır.

        // İç içe gelen fonksiyonlarda her yerde exception handle edilebilir.
        // birinciFonksiyon();




    }


    public static void mekanci(int yas)  {
        if(yas < 18) {
            throw new InvalidAgeException("Yaş geçerli değil");

        }
        else {
            System.out.println("Mekana hoş geldiniz");
        }
    }
}
