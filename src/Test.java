import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://i.pinimg.com/736x/bc/50/83/bc5083118fff004307cef586b8081e0d.jpg");
        System.out.println(url.getFile());
        System.out.println(url.getPath());
    }
}
