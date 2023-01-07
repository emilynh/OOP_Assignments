package lab12.factory_pattern.uml;

public class FruitFactory {
    Fruit provideFruit(String name) throws Exception {
        return switch (name) {
            case "apple" -> new Apple();
            case "banana" -> new Banana();
            case "orange" -> new Orange();
            default -> throw new Exception("No matching fruit could be provide");
        };
    }
}
