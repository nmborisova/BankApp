package bg.smg.frame;

import bg.smg.model.Account;
import bg.smg.model.User;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame implements ItemListener, ActionListener {
    private JLabel bannerLbl;
    private ImageIcon bannerIcn;
    private JLabel screenTitle;

    static JFrame mainFr;
    static JComboBox menuAccounts;


    public MainFrame(User currentUser){
        mainFr = new JFrame();
        mainFr.setSize(600,500);
        mainFr.setTitle("Bank App");
        mainFr.setLayout(new FlowLayout());

        //bannerIcn = new ImageIcon("resources/bankBanner.png");
        Image image = new ImageIcon("resources/bankBanner.png").getImage();
        Image scaledInstance = image.getScaledInstance(300, 75, Image.SCALE_SMOOTH);
        bannerIcn = new ImageIcon(scaledInstance);

        bannerLbl = new JLabel(bannerIcn);

        mainFr.add(bannerLbl);


        List<Account> currentUserAccounts = currentUser.getBankAccounts();
        List<String> currentUserIbans = new ArrayList<>();
        for(Account account : currentUserAccounts) {
            currentUserIbans.add(account.getIBAN());
        }
        menuAccounts = new JComboBox(currentUserIbans.toArray());

        menuAccounts.addItemListener(this);
        JPanel menuPanel = new JPanel();
        menuPanel.setBorder(new LineBorder(Color.RED));
        menuPanel.add(menuAccounts);

        mainFr.add(menuPanel);

        mainFr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFr.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    /**
     * Invoked when an item has been selected or deselected by the user.
     * The code written for this method performs the operations
     * that need to occur when an item is selected (or deselected).
     *
     * @param e the event to be processed
     */
    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
