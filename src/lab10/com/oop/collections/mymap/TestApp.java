package lab10.com.oop.collections.mymap;

public class TestApp {
    public static void main(String[] args) {
        MyMap m = new MyHashMap();
        m.put(11, "Nicola");
        m.put(11, "Nicola");
        m.put(21, "Marzia");
        m.put(33, "Agata");
        m.remove(21);
        System.out.println(m.contains(11));
        System.out.println(m.contains(77));
        System.out.println(m.size());
        System.out.println(m);
    }
}

//true
//false
//2
//[bucket 0] -> null
//[bucket 1] -> (33, Agata)
//[bucket 2] -> null
//[bucket 3] -> (11, Nicola)
//[bucket 4] -> null
//[bucket 5] -> null
//[bucket 6] -> null
//[bucket 7] -> null