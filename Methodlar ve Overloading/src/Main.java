import java.util.Scanner;

public class Main {
//    public static void selam() {
//        System.out.println("Helo");
//    }
//    public static void fact() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Sayı giriniz ");
//        int num = scanner.nextInt();
//        int factoriel = 1;
//        while (num > 0) {
//
//            factoriel *= num;
//            num--;
//        }
//        System.out.println(factoriel);
//
//    }
//    public static void fact(int num) {
//        int factoriel = 1;
//        while (num > 0) {
//
//            factoriel *= num;
//            num--;
//        }
//        System.out.println(factoriel);
//
//    }
//   public static int fact(int num) {
//       int factoriel = 1;
//       while (num > 0) {
//           factoriel *= num;
//           num--;
//       }
//       return factoriel;
//  }
//    Metodlarda Overloading
    public static void toplama(int a, int b) {
        System.out.println(a+b);
    }

    public static void toplama(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {

  //   erişim belirleyici, ekstra özellikler, dönüş tipi, method ismi(Parametreler)

  //   Scanner scanner = new Scanner(System.in);
  //   System.out.println("Sayı giriniz ");
  //   int num = scanner.nextInt();
  //   int factReturn = fact(num);
  //   System.out.println(factReturn);

        //   Metodlarda Overloading
       toplama(1,2);
       toplama(1,2,3);






    }
}
