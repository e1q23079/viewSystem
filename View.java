import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Frame;

public class View extends JFrame {
    public View(int width, int height) {
        // Set title
        super.setTitle("View");
        // Set size
        super.setSize(width, height);
        // Set the window display position
        // super.setLocationRelativeTo(null);
        
        // Close the frame to end
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Show text
    public void showText(String text) {

        Container container = this.getContentPane();

        JLabel label = new JLabel(text);

        container.add(label);

    }

    // Show Image
    public void showImage(String filePath) {

        Container container = this.getContentPane();

        ImageIcon icon = new ImageIcon(filePath);

        JLabel label = new JLabel(icon);

        container.add(label);

    }

    // setFile
    public String setFile(){
        
        FileDialog dg = new FileDialog((Frame)null,"View");

        dg.setVisible(true);

        return dg.getDirectory() + dg.getFile();

    }
}
