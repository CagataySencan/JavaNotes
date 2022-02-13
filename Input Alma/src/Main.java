import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Inputu kontrol etme
        System.out.println("Yaş gir bre amcık");
        if(scanner.hasNextInt()) {
            int yas = scanner.nextInt();
            System.out.println("Yaşın = " + yas);
        }
        else {
            System.out.println("Düzgün sayı gir bea");
        }
        */

        /*
        System.out.println("Double Yaş gir bre amcık");
        double yasDouble = scanner.nextDouble();
        System.out.println(yasDouble); */

        /* Sayıdan sonra yazı inputu alma durumu
        System.out.println("Yaş gir bre amcık");
        int yas = scanner.nextInt();
        scanner.nextLine(); // dummy


        System.out.println("Yazı gir bre amcık");
        String yazi = scanner.nextLine();
        System.out.println("Yaşın = " + yas);
        System.out.println("Yazi = " + yazi); */

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println("i = " + i + " j = " + j + " z = " + z );



    }
}
