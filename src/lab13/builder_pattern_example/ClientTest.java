package lab13.builder_pattern_example;

public class ClientTest {
    public static void main(String[] args) {
        House house1 = new HouseBuilder()
                .buildWalls(4)
                .buildDoors(2)
                .buildColor("Red")
                .buildRoof(true)
                .build();
        System.out.println(house1);
    }
}

//House{walls=4, doors=2, hasPool=false, hasRoof=true, color='Red'}