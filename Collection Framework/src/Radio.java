import java.util.ArrayList;
import java.util.Iterator;

public class Radio implements Iterable<String> {
    private ArrayList<String> kanallarListesi = new ArrayList<String>();

    public Radio(String[] kanallar ) {
        for(String kanal : kanallar) {
            kanallarListesi.add(kanal);

        }
    }


    public Iterator<String> iterator() {
        return new RadioIterator();
    }
    public class RadioIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            if(index < kanallarListesi.size()) {
                return true;
            }
            else
            {
                return false;
            }
        }

        @Override
        public String next() {
            String deger = kanallarListesi.get(index);
            index++;
            return deger;

        }
    }
}
