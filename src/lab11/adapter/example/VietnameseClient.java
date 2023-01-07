package lab11.adapter.example;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("xin chao");
    }
}

//Reading words...
//xin chao
//Translated!
//Sending words...
//Retrieving words from Adapter...
//こんにちは