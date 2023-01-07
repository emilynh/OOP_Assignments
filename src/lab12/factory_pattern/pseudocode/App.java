package lab12.factory_pattern.pseudocode;

public class App {
    private static Dialog dialog;

    public static void initialize(String osType) throws Exception {
        if (osType.equals("Windows")) {
            dialog = new WindowsDialog();
        } else if (osType.equals("Web")) {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error! Unknown OS");
        }
    }

    public static void main(String[] args) {
        try {
            initialize("Windows");
            dialog.render();
            System.out.println("================");
            initialize("Web");
            dialog.render();
            System.out.println("================");
            initialize("MacOS");
            dialog.render();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

//Bind a native OS click event
//Render button in Windows style
//================
//Bind a web browser click event
//HTML representation of button
//================
//Error! Unknown OS