package app.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BenvenutoFrame extends CustomFrame implements ActionListener {

    JButton loginB = new JButton("Entra nell'applicazione");

    public BenvenutoFrame() {
        super();
        super.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 0, 10, 0);
        JLabel label = new JLabel("Benvenuto!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        loginB.setPreferredSize(new Dimension(250, 50));
        loginB.addActionListener(this);
        gbc.gridy = 0;
        this.add(label, gbc);
        gbc.gridy = 1;
        this.add(loginB, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginB) {
            new HomeFrame();
            this.dispose();
        }
    }

}
