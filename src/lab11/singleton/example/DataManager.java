package lab11.singleton.example;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private static DataManager instance;
    List<Category> categories;
    List<Product> products;

    private DataManager() {
        categories = new ArrayList<>();
        products = new ArrayList<>();
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }


}
