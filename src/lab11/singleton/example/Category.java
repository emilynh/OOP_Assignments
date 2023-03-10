package lab11.singleton.example;

public class Category {
    int id;
    String catName;

    public Category(int id, String catName) {
        this.id = id;
        this.catName = catName;
    }

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
