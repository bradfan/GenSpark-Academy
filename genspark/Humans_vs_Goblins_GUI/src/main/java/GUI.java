import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton buttonStart;
    private JPanel fr;


    public GUI() {

        frame = new JFrame();
        buttonStart = new JButton("START");
        buttonStart.addActionListener(this);
        label = new JLabel("PRESS START TO BEGIN YOUR ADVENTURE");
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
        fr = new JPanel();
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        fr.add(b1); fr.add(b2); fr.add(b3);
        fr.add(b4); fr.add(b5); fr.add(b6);
        fr.add(b7); fr.add(b8); fr.add(b9);
        fr.setLayout(new GridLayout(3, 3));
        fr.setSize(300,300);
        fr.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        buttonStart.setVisible(false);
        label.setText("As you were briefed before the mission, you have entered the Goblin Maze! Navigate this terrible place by using the grid above.");
        fr.setVisible(true);
        frame.add(fr, BorderLayout.CENTER);

    }


}
