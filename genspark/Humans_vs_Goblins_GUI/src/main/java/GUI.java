import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextLayout;

public class GUI implements ActionListener {

    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton buttonStart;
    private JPanel panel2;
    Font font = new Font("Ink Free", Font.BOLD,30);

    public GUI() {

        frame = new JFrame();
        buttonStart = new JButton("START");
        buttonStart.setFont(font);
        buttonStart.addActionListener(this);
        label = new JLabel("PRESS START TO BEGIN YOUR ADVENTURE THEN FIND YOUR GOBLIN AND TAKE HIM OUT!", SwingConstants.CENTER);
        label.setFont(font);
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(buttonStart);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Humans vs. Goblins");
        frame.pack();
        frame.setVisible(true);
        panel2 = new JPanel();

        JButton b1 = new JButton("");
        JButton b2 = new JButton("North");
        b2.setFont(font);
        JButton b3 = new JButton("");
        JButton b4 = new JButton("West");
        b4.setFont(font);
        JButton b5 = new JButton("\"Click North, South, East or West\"");
        b5.setFont(font);
        JButton b6 = new JButton("East");
        b6.setFont(font);
        JButton b7 = new JButton("");
        JButton b8 = new JButton("South");
        b8.setFont(font);
        JButton b9 = new JButton("");
        panel2.add(b1); panel2.add(b2); panel2.add(b3);
        panel2.add(b4); panel2.add(b5); panel2.add(b6);
        panel2.add(b7); panel2.add(b8); panel2.add(b9);
        b1.setVisible(false);
        b3.setVisible(false);
        b7.setVisible(false);
        b9.setVisible(false);
        panel2.setLayout(new GridLayout(3, 3));
        panel2.setSize(300,300);
        panel2.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        buttonStart.setVisible(false);
        label.setText("");
        panel2.setVisible(true);
        frame.add(panel2, BorderLayout.CENTER);

    }


}
