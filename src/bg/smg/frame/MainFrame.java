package bg.smg.frame;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame  {
    private JLabel bannerLbl;
    private ImageIcon bannerIcn;
    private JLabel screenTitle;


    public MainFrame(){
        this.setSize(600,500);
        this.setTitle("Bank App");

        bannerIcn = new ImageIcon("resources/bankBanner.png");
        bannerLbl = new JLabel(bannerIcn);

        this.add(bannerLbl);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
