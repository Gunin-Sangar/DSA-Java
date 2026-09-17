package FileHandling.aboutFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class UrlImage {
    public static void main(String[] args) {
        try {
            // 1. Define the internet path to your PNG image
            String webPath = "https://i.pinimg.com/1200x/f1/20/73/f120731c4711224507bb5524b9f3d379.jpg";

            // 2. Convert the String to a URL object via URI (best practice)
            URL url = URI.create(webPath).toURL();

            // 3. Read the image from the web path
            BufferedImage image = ImageIO.read(url);

            System.out.println("Success! Image width is: " + image);

        } catch (IOException e) {
            System.err.println("Error loading the image: " + e.getMessage());
        }
    }
}
