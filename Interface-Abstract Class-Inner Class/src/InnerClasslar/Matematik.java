package InnerClasslar;

import java.util.Scanner;

public class Matematik {
    private double PI = Math.PI;

    public class Factoriyel {
        public void faktöriyel() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Sayı giriniz");
            int sayi = scanner.nextInt();
            int fact = 1;
            for(int i = 2 ; i <= sayi; i++) {
                fact *= i;

            }
            System.out.println(fact);
        }
    }
    public class Asal{
        public boolean isAsal(int sayi) {
            int i = 2;
            while (i < sayi) {
                if (sayi % i == 0) {
                    return false;
                }
                i++;

            }
            return true;

        }
    }
    public class Alan{
        public class DaireAlan{
            public void daireAlan(int yariCap) {
                System.out.println("Alan = " + (PI*yariCap*yariCap));

            }
        }
    }
}
