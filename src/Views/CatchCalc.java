package Views;

import Controllers.Controller;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CatchCalc {

    private static BufferedImage image;

    public static void main(String[] args) {
        String imageIcon = "Images/logo.png";

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            URL url = ClassLoader.getSystemResource(imageIcon);
            image = ImageIO.read(url);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | IOException e) {
            System.err.println("There is an error in the way the UI looks. Contact the developer of the program!" + e);
        }

        Controller frame = new Controller();
        frame.setSize(720, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setTitle("CatchCalc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setIconImage(image);
    }
}
