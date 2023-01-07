package lab11.adapter.example;

public class JapaneseAdaptee {
    public void receive(String words) {
        System.out.println("Retrieving words from Adapter...");
        System.out.println(words);
    }
}
