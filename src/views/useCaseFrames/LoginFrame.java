package views.useCaseFrames;

import javax.swing.*;
import views.swingComponents.PathManager;
import java.awt.*;

public class LoginFrame extends JFrame{

    private ImageIcon uhuruLogo = new ImageIcon(getClass().getResource(new PathManager().setFileLink("../img/loginView/loginBackground.jpg")));
    private JLabel background = new JLabel();
    
    LoginFrame(){

        super("Uhuru");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(800,600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Image image1 = uhuruLogo.getImage();
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        Image image2 = image1.getScaledInstance(width, height, DO_NOTHING_ON_CLOSE);

        background.setIcon(new ImageIcon(image2));
        add(background);

        setVisible(true);
    }
}
