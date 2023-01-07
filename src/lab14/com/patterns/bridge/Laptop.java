package lab14.com.patterns.bridge;

public class Laptop extends Computer {
    public Laptop(OperatingSystem os) {
        super(os);
    }
    @Override
    public void startup() {
        os.startup();
    }

    @Override
    public void browseInternet(String url) {
        os.loadUrl(url);
    }

    @Override
    public boolean canMove() {
        return true;
    }
}
