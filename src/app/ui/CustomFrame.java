package app.ui;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {

    public CustomFrame() {
        this.setTitle("Gestore di Libreria Personale - Progetto IdS");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(870, 550);
        this.getContentPane().setBackground(new Color(249, 246, 238));
        this.setLayout(new GridBagLayout());
    }

}
