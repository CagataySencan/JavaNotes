package InnerClasslar;

public class Seyirci {
    private String isim;
    public static int seyirciSayÄ± = 0;

    public void oyunSeyret() {
        System.out.println(isim + " oyun seyrediyor");
    }



    public Seyirci(String isim) {
        seyirciSayÄ±++;
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
