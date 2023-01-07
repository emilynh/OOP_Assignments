package lab14.com.patterns.bridge;

public class App {
    public static void main(String[] args) {
        Computer computer = new PC(new WindowsOS());
        computer.startup();
        computer.browseInternet("fb.com");

        Computer computer1 = new Laptop(new MacOS());
        computer1.startup();
        computer1.browseInternet("youtube.com");
        if (computer1.canMove()) {
            System.out.println("Move to another place");
        }
    }
}

//WindowsOS start up
//Load fb.com from Edge
//Mac start up
//Load youtube.com from Safari
//Move to another place