import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        // FileOutputStream v FileInputStream
//        FileOutputStream fos = null;
//        File file = new File("dosya.txt");
//        try {
//            fos = new FileOutputStream(file,true); // dosya.txt diye de yazılabilir
//            byte[] array = {65,66,67,68,69,70};
//            String s = "Çağatay Şencan";
//            byte[] array2 = s.getBytes();
//            fos.write(array2);
//        } catch (FileNotFoundException e) {
//            System.out.println("Dosya bulunamadı.");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("Dosyaya yazılırken hata.");
//            e.printStackTrace();
//        } finally {
//            try {
//                fos.close();
//            } catch (IOException e) {
//                System.out.println("Dosya kapatma hatası.");
//                e.printStackTrace();
//            }
//        }

//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream("dosya.txt");
//            System.out.println((char)fis.read());
//            fis.skip(8);
//            System.out.println((char)fis.read());
//            int deger;
//            String str = "";
//            int say = 0;
//            fis.skip(15);
//            while((deger = fis.read()) != -1) {
//                str += (char)deger;
//                say++;
//                if(say == 5) {
//                    break;
//                }
//            }

//            while((deger = fis.read()) != -1) {
//                str += (char)deger;
//
//            }
//            System.out.println(str);
//
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Dosya bulunamadı.");
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//        try {
//            if(fis != null) {
//                fis.close();
//            }
//        } catch (IOException e) {
//            System.out.println("Dosya kapatma hatası.");
//            e.printStackTrace();
//        }
//    }

        // FileWritter ile dosyaya veri yazma
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter("dosya2.txt",true);
//            writer.write("Çağatay Şencan Java Öğreniyor \n");
//            writer.write("ßaro Veri Bilimi Öğreniyor\n");
//
//        } catch (IOException e) {
//            System.out.println("Dosya açılırken hata");
//            e.printStackTrace();
//        }
//        finally {
//            if(writer != null) {
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    System.out.println("Dosya kapanırken hata");
//                    e.printStackTrace();
//                }
//            }
//            else {
//                System.out.println("Writer referansı null");
//            }
//        }

        // Try with Resource, kod kalabalığı olmaması için kullanılır.

//        try(FileWriter writer1 = new FileWriter("dosya3.txt");
//            FileWriter writer2 = new FileWriter("dosya4.txt")) {
//            writer1.write("Deneme\n");
//            writer2.write("Deneme\n");
//
//        } catch (IOException e) {
//            System.out.println("Dosya oluşturulurken hata");
//            e.printStackTrace();
//        }

        // FileReader BufferedReader v BufferedWriter
//        try(Scanner scanner = new Scanner(new BufferedReader (new FileReader("dosya2.txt")))) {
//            while(scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//
//
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Dosya bulunamadı.");
//            e.printStackTrace();
//        }
//
//        // BufferedReader büyük dosyaların okunmasında kullanılır.
//        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dosya2.txt",true))) {
//            bufferedWriter.write("Gizem Java Öğreniyor\n");
//
//        } catch (IOException e) {
//            System.out.println("Dosya açılırken hata.");
//            e.printStackTrace();
//        }

        // Serialization API v SerialVersionUID
        // Objeleri serileştirp byte şeklinde dosyalara kaydetmemize yardımcı olur.
        // Oluşturulması uzun süren objeler kaydedilip daha sonra kullanılabilir.

        // Objeleri yazma işlemi
//        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {
//            Ogrenci ogrenci1 = new Ogrenci("Çağatay",18052085,"Matematik Mühendisliği");
//            Ogrenci ogrenci2 = new Ogrenci("Baro",18052052,"Matematik Mühendisliği");
//            outputStream.writeObject(ogrenci1);
//            outputStream.writeObject(ogrenci2);
//
//        } catch (IOException e) {
//            System.out.println("Dosya açılırken hata");
//            e.printStackTrace();
//        }

        // Objeleri okuma işlemi
//        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {
//            Ogrenci ogrenci1 = (Ogrenci) inputStream.readObject();
//            Ogrenci ogrenci2 = (Ogrenci) inputStream.readObject();
//            System.out.println(ogrenci1);
//            System.out.println(ogrenci2);
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Dosya bulunamadı.");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("Dosya açılırken hata");
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            System.out.println("Uygun sınıf bulunamadı.");
//            e.printStackTrace();
//        }

        // Array ve Collectionları serileştirmek
//        Ogrenci ogrenci1 = new Ogrenci("Çağatay",18052085,"Matematik Mühendisliği");
//        Ogrenci ogrenci2 = new Ogrenci("Barış",18052052,"Matematik Mühendisliği");
//        Ogrenci ogrenci3 = new Ogrenci("Mete",18052052,"Matematik Mühendisliği");
//        Ogrenci ogrenci4 = new Ogrenci("Taha",18052052,"Matematik Mühendisliği");
//
//        Ogrenci[] ogrenciArray = {ogrenci1,ogrenci2,ogrenci3,ogrenci4};
//        ArrayList<Ogrenci> ogrencisList = new ArrayList<Ogrenci>(Arrays.asList(ogrenciArray));
//
//        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ogrencinew.bin"))) {
//            outputStream.writeObject(ogrenciArray);
//            outputStream.writeObject(ogrencisList);
//        } catch (IOException e) {
//            System.out.println("Dosya açılırken hata");
//            e.printStackTrace();
//        }
//
//        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ogrencinew.bin"))) {
//            Ogrenci[] ogrenciArrayInput = (Ogrenci[]) inputStream.readObject();
//            ArrayList<Ogrenci> ogrenciArrayList = (ArrayList<Ogrenci>) inputStream.readObject();
//            System.out.println(Arrays.toString(ogrenciArrayInput));
//            for(Ogrenci o : ogrenciArrayList) {
//                System.out.println(o);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Dosya bulunamadı.");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("Dosya açılırken hata");
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            System.out.println("Sınıf bulunamadı.");
//            e.printStackTrace();
//        }

        // Transient Anahtar Kelimesi



    }
}
