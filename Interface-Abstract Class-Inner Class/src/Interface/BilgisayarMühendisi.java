package Interface;

import java.util.Arrays;

public class BilgisayarMühendisi implements IMuhendis{

    private boolean askerlik;
    private boolean adliSicil;

    public BilgisayarMühendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlikSorgula() {
        if(askerlik) {
            System.out.println("Askerlik yapıldı");
        }
        else
        {
            System.out.println("Askerlik Henüz yapılmadı.");
        }
    }

    @Override
    public String mezuniyetOrtalamasi(Double derece) {


        return "Ortalamam " + derece;
    }

    @Override
    public void adliSicilSorgula() {
        if(adliSicil) {
            System.out.println("Sicil kaydı var");

        }
        else
        {
            System.out.println("Herhangi bir sicil kaydı yok");
        }

    }

    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("Bilgisayar mühendisi olarak şu şirketlerde çalıştım :");
        System.out.println(Arrays.toString(array));
    }
}
