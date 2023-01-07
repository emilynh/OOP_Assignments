package lab11.singleton;

public class App {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM k66A5");

        Database bar = Database.getInstance();
        foo.query("SELECT * FROM k66A3");

        System.out.println(bar == foo);
    }
}
