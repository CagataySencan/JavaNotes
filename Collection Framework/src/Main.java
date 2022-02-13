import java.util.*;
//class KucuktenBuyugePlayer implements Comparator<Player> {
//
//    @Override
//    public int compare(Player o1, Player o2) {
//        if(o1.getId() < o2.getId()) {
//            return -1;
//        }
//        else if (o1.getId() > o2.getId()) {
//            return 1;
//        }
//        else {
//            return 0;
//        }
//    }
//
//}
//class BuyuktenKucugeString implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        return -o1.compareTo(o2);
//        // compareTo soldaki büyükse 1 sağdaki büyükse -1 eşite 0 döndürür
//
//    }
//}
class Player implements Comparable<Player>{
    private String isim;
    private int id;

    public Player(String isim, Integer id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return " ID : " + id + " İsim : " + isim;
    }
    // Custom objeleri kullanmak için
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return id == player.id && Objects.equals(isim, player.isim);
    }
    // Custom objeleri kullanmak için
    @Override
    public int hashCode() {
        return Objects.hash(isim, id);
    }
    // Custom objeleri sıralamak ve karşılaştırmak için
    @Override
    public int compareTo(Player player) {
        if (this.id < player.id) {
            return -1;
        }
        else if(this.id > player.id) {
            return 1;
        }
        else
        {
            return 0;
        }

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class Main {
    public static void main(String[] args) {
        // Collection Framwwork benzer veriler üzerindeki işlemleri yapmayı kolaylaştıran bir framworktür.
        // Collection Framwork içerisinde verilerin liste halinda tutulması için List, kuyruk halinde tutulması için Queue
        // Benzersiz tutulması için Set interface'i bulunur. Bu üç interface de Collection interface'inden türerler.
        // Map interface'i Collection ile bağlantılı olmamasına rağmen Framework içerisinde bulununa kullanışlı bir interface'dir.

        // List Interface
        // ArrayList

//         ArrayList<String> arrayList = new ArrayList<String>();
//         List<String> list = new ArrayList<String>();
//         list.add("Jawa");
//         list.add("Cpp");
//         list.add("Python");
//         System.out.println(list.get(0));
//
//         for (String s : list) {
//          // System.out.println(s);
//         }
//
//         list.remove(0);
//         list.remove("Python");

        // LinkedList v ArrayList
        // ArrayListler, LinkedListlere göre sona değer eklerken daha hızlı çalışır.
        // LinkedListler ise başa değer eklerken daha hızlı çalışır.

//         LinkedList<Integer> linkedList = new LinkedList<Integer>();
//         ArrayList<Integer> arrayList = new ArrayList<Integer>();
//         zamanHesapla("LinkedList", linkedList);
//         zamanHesapla("ArrayList", arrayList);



        // Set Interface, HashSet, LinkedHashSet ve TreeSet
        // Set Interface implement eden classlar bir elementten bir tane depolarlar.

        // HashSet, elementleri depolarlar.
        // HashSet'te bir eleman bir defa depolanır.
        // HashSet'te elementler ekleme sırasına göre depolanmaz.


        // TreeSet ağaç yapısını kullanır ve elementleri alfabetik sıralar.


        // HashSet v LinkedHashSet v TreeSet
        // HashSet elementleri sıralı değilir ve işlemleri O(1) sabit zamanıyla çalışır.
        // TreeSet metodları O(log(n)) zamanıyla çalışır.
        // LinkedHashSet sınıfı elementleri ekleme sırasına göre sıralar zamanı O(1)'dir.


//        Set<String> set1 = new HashSet<String>();
//        Set<String> set2 = new LinkedHashSet<String>();
//        Set<String> set3 = new TreeSet<String>();
//
//        set1.add("Java");
//        set1.add("Python");
//        set1.add("C++");
//        set1.add("Kotlin");
//        set1.add("JScript");
//
//        set2.add("Java");
//        set2.add("Python");
//        set2.add("C++");
//        set2.add("Kotlin");
//        set2.add("JScript");
//
//        set3.add("Java");
//        set3.add("Python");
//        set3.add("C++");
//        set3.add("Kotlin");
//        set3.add("JScript");

//        bastir(set1);
//        bastir(set2);
//        bastir(set3);

//        System.out.println(set1.contains("Go"));
//        System.out.println(set1.isEmpty());
//        set1.remove("Java");
//        System.out.println(set1.contains("Java"));
//        Set<String> set1 = new HashSet<String>();
//        Set<String> set2 = new HashSet<String>();
//        set1.add("Java");
//        set1.add("Python");
//        set1.add("C++");
//        set1.add("Kotlin");
//        set1.add("JScript");
//
//        set2.add("Go");
//        set2.add("Java");
//        set2.add("C++");
//        set2.add("CSS");
//        set2.add("JScript");

        // Fark kümesi bulma
//        Set<String> fark = new HashSet<String>(set2);
//        System.out.println(fark.removeAll(set1));
//        System.out.println(fark);

        // Kesişim Kümesi
//        Set<String> kesisim = new HashSet<String>(set2);
//        System.out.println(kesisim.retainAll(set1));
//        System.out.println(kesisim);


        // HashMap sınıfı
        // Değerleri key-value olarak tutar
        // Her key bir kere var olabilir ama bir değer birden fazla var olabilir.
        // Elementleri ekleme sırasına göre depolamaz.

//        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
//        hashMap.put(0,"Java");
//        hashMap.put(1,"Python");
//        hashMap.put(2,"Kotlin");
//        hashMap.put(3,"Java");
//        hashMap.put(0,"Go");
//        System.out.println(hashMap);
//        System.out.println(hashMap.get(0));

        // Ekrana yazdırma
//        for(Map.Entry<Integer,String> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }



        // HashMap, LinkedHashMap, TreeMap
        // HashMap sırasız, LinkedHashMap ekleme sırasına göre, TreeMap key'e göre sıralar

//        Map<Integer,String> hashMap = new HashMap<Integer,String>();
//        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
//        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
//
//        mapYazdir(hashMap);
//        mapYazdir(linkedHashMap);
//        mapYazdir(treeMap);
//
//        for(Integer key : hashMap.keySet()) {
//            System.out.println(hashMap.get(key));
//        }
//
//        Collection<String> values = hashMap.values();
//
//        for(String s : values) {
//            System.out.println(s);
//        }


        // Custom objeleri maplerde kullanmak, hashCode() ve equals() metodları
//        Set<Player> hashSet = new HashSet<Player>();
//        Player player1 = new Player("Çağatay",1);
//        Player player2 = new Player("Taha",7);
//        Player player3 = new Player("Barış",13);
//        Player player4 = new Player("Çağatay",1);
//
//        hashSet.add(player1);
//        hashSet.add(player2);
//        hashSet.add(player3);
//        hashSet.add(player4);
//
//        for(Player p : hashSet) {
//            System.out.println(p);
//        }


        // Listeleri sıralamak ve Comparable Interface kullanımı

//        List<String> stringList = new ArrayList<String>();
//        stringList.add("Java");
//        stringList.add("C++");
//        stringList.add("Python");
//        stringList.add("Kotlin");
//        stringList.add("Swift");
//
//        Collections.sort(stringList, new BuyuktenKucugeString()); // Comperator kullanarak custom sıralama
//        Collections.sort(stringList);
//        for(String s : stringList) {
//            System.out.println(s);
//        }
//        List<Player> playerList = new ArrayList<Player>();
//        Player player1 = new Player("Çağatay",1);
//        Player player2 = new Player("Taha",7);
//        Player player3 = new Player("Barış",13);
//        Player player4 = new Player("Çağatay",1);
//
//        playerList.add(player1);
//        playerList.add(player2);
//        playerList.add(player3);
//        playerList.add(player4);
//
//        System.out.println(player1.compareTo(player2));
//        Collections.sort(playerList,new KucuktenBuyugePlayer());
//        Collections.sort(playerList, new Comparator<Player>() {
//            @Override
//            public int compare(Player o1, Player o2) {
//                return o1.getIsim().compareTo(o2.getIsim());
//            }
//        });
//
//        for(Player p : playerList) {
//            System.out.println(p);
//        }
//
//        Set<Player> treeSet = new TreeSet<Player>();
//        treeSet.add(player1);
//        treeSet.add(player2);
//        treeSet.add(player3);
//        treeSet.add(player4);
//
//        for (Player p : treeSet) {
//            System.out.println(p);
//        }

        // Vektörler ve Stackler
        // Thread işlemlerinde ArrayList yerine genellikle Vector kullanılır.
        // ArrayListe göre daha yavaştır.

//        Vector<String> vector = new Vector<String>();
//        ArrayList<String> arrayList = new ArrayList<String>();
//
//        vector.add("Java");
//        vector.add("Python");
//        vector.add("Kotlin");
//        vector.add("C++");
//
//        for (String s : vector) {
//            System.out.println(s);
//        }
//
//        ListIterator<String> iterator = vector.listIterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        Enumeration<String> enumeration = vector.elements();
//
//        while (enumeration.hasMoreElements()) {
//            System.out.println(enumeration.nextElement());
//        }
//
//        System.out.println(vector.firstElement());
//        System.out.println(vector.lastElement());
//        System.out.println(vector.get(2));

        // Stackler Vektör sınıfından türerler ve kendi yapıları vardır.
        // Stacke son giren ilk çıkar.
        // Last in First out.

//        Stack<String> stringStack = new Stack<String>();
//
//        stringStack.push("Java");
//        stringStack.push("Python");
//        stringStack.push("Kotlin");
//        stringStack.push("Go");

//        Enumeration<String> enumeration = stringStack.elements();
//
//        while (enumeration.hasMoreElements()) {
//            System.out.println(enumeration.nextElement());
//        }

//        System.out.println(stringStack.peek()); // son eleman
//        stringStack.pop(); // son elemanı çıkartır
//        System.out.println(stringStack.empty());
//
//
//        for (String s : stringStack) {
//            System.out.println(s);
//        }

//        while (!stringStack.empty()) {
//            System.out.println("Eleman çıkarılıyor : " + stringStack.pop());
//        }


        // Queue Interface ve LinkedList'i Queue olarak kullanma
        // Stackler'in tersine ilk giren ilk çıkar
        // First in First out

//        Queue<String> queue = new LinkedList<String>();
//
//        queue.offer("Java");
//        queue.offer("Python");
//        queue.offer("Kotlin");
//        queue.offer("C++");
//
//        System.out.println(queue.peek());
//        System.out.println("**************************");
//        for(String s : queue) {
//            System.out.println(s);
//        }
//        System.out.println("**************************");
//        queue.poll();
//        for(String s : queue) {
//            System.out.println(s);
//        }
//        System.out.println("**************************");
//        System.out.println(queue.isEmpty());

        // Queue Interface ve Priority Queue Sınıfı
        // PriorityQueue normal Queue gibi davranmaz, elemanlar öncelik sıralarına göre hareket eder.
        // Intlerde en yüksek öncelik en düşük sayıdadır.
        // Stringlerde en yüksek öncelik alfabetik sıraya göre başta olandadır.

//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
//
//        priorityQueue.offer(44);
//        priorityQueue.offer(1);
//        priorityQueue.offer(77);
//        priorityQueue.offer(45);
//        priorityQueue.offer(98);
//
//        System.out.println(priorityQueue.peek());
//        System.out.println(priorityQueue.contains(45));
//
//        while (!priorityQueue.isEmpty()) {
//           System.out.println("Elemen çıkarılyor : " + priorityQueue.poll()) ;
//        }

//        PriorityQueue<Player> priorityQueue = new PriorityQueue<Player>();

//        priorityQueue.offer(player1);
//        priorityQueue.offer(player2);
//        priorityQueue.offer(player3);
//        priorityQueue.offer(player4);

//        while (!priorityQueue.isEmpty()) {
//            System.out.println("Elemen çıkarılyor : " + priorityQueue.poll()) ;
//        }

        // ListIterator sadece list interface implement eden objelerde kullanılır
        // add next previous metodları vardır
        // Iterator set list map implement eden objelerde kullanılır

//        Set<String> set = new HashSet<String>();
//        List<String> list = new ArrayList<String>();
//
//
//        set.add("Java");
//        set.add("Python");
//        set.add("C++");
//        set.add("Go");
//
//        list.add("Java");
//        list.add("Python");
//        list.add("C++");
//        list.add("Go");

//        Iterator<String> iterator1 = set.iterator();
//        Iterator<String> iterator2 = list.iterator();
//        ListIterator<String> listIterator = list.listIterator();
//        while (iterator1.hasNext()) {
//            System.out.println(iterator1.next());
//        }
//        System.out.println("********************************");
//        while (iterator2.hasNext()) {
//            System.out.println(iterator2.next());
//        }
//        System.out.println("********************************");
//
//
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
//        System.out.println("********************************");
//
//        while(listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }
//        while (listIterator.hasNext()) {
//            String value = listIterator.next();
//            if(value.equals("Go")) {
//                listIterator.remove();
//            }
//        }
//
//        for(String s : list) {
//            System.out.println(s);
//        }

        // Iterable class ve interface oluşturma
//        String[] kanallar = {"Viva","Fenomen","Pop","Alem","Alem2"};
//        Radio radio = new Radio(kanallar);
//
//        for(String s : radio) {
//            System.out.println(s);
//        }


    }
//    public static void isPalindrome(String cumle) {
//        String terstenCumle = "";
//        for(int i = (cumle.length() -1) ; i >= 0; i--) {
//            terstenCumle += cumle.charAt(i) ;
//        }
//        if (cumle.equals(terstenCumle)) {
//            System.out.println( cumle + " is palindrome!");
//        }
//        else
//        {
//            System.out.println( cumle + " is not palindrome");
//        }
//
//    }
//    public static void mapYazdir(Map<Integer,String> map) {
//        System.out.println("************************************");
//        map.put(10,"Java");
//        map.put(5,"Python");
//        map.put(1,"Kotlin");
//        map.put(2,"Java");
//        map.put(3,"C");
//        for(Map.Entry<Integer,String> entry : map.entrySet()) {
//            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
//
//        }
//    }
//    public static <T> void bastir(Set t){
//        System.out.println("****************************");
//            System.out.println(t);
//        System.out.println("****************************");
//    }
//    public static void zamanHesapla(String veriTipi, List<Integer> list) {
//        long start;
//        long bitis;
//        start = System.currentTimeMillis();
//        for(int i = 0; i < 1000000; i++) {
//            list.add(0,i);
//
//
//        }
//        bitis = System.currentTimeMillis();
//        System.out.println("Geçen sure = " + (bitis - start) );
//    }
}
