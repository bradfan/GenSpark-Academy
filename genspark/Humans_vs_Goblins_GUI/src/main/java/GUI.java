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
    private JButton[] combatButtons = new JButton[4];
    Font font = new Font("Ink Free", Font.BOLD,30);
    Goblin goblin = new Goblin();
    Human human = new Human();
    int locationIndex = (int) (Math.random() * 4);

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
        JButton north = new JButton("North");
        JButton b3 = new JButton("");
        JButton west = new JButton("West");
        JButton center = new JButton("\"Click North, South, East or West\"");
        center.setFont(font);
        JButton east = new JButton("East");
        JButton b7 = new JButton("");
        JButton south = new JButton("South");
        JButton b9 = new JButton("");
        panel2.add(b1); panel2.add(north); panel2.add(b3);
        panel2.add(west); panel2.add(center); panel2.add(east);
        panel2.add(b7); panel2.add(south); panel2.add(b9);
        b1.setVisible(false);
        b3.setVisible(false);
        b7.setVisible(false);
        b9.setVisible(false);
        panel2.setLayout(new GridLayout(3, 3, 2, 2));
        panel2.setSize(300,300);
        panel2.setVisible(true);

        combatButtons[0] = north;
        combatButtons[1] = west;
        combatButtons[2] = east;
        combatButtons[3] = south;

        for(int i = 0; i <= 3; i++) {
            combatButtons[i].setFont(font);
            combatButtons[i].addActionListener(this);
            combatButtons[i].setBackground(Color.LIGHT_GRAY);
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        buttonStart.setVisible(false);
        label.setText("");
        panel2.setVisible(true);
        frame.add(panel2, BorderLayout.CENTER);
        if(e.getSource() == combatButtons[locationIndex] ) {
            goblin.goblinAttack(human);
            System.out.println("Eureka!!");
//compare the click to the random location of the goblin; if it matches then combat ensues, if not "The goblin isn't here."
        } else if(e.getSource() != combatButtons[locationIndex]) {
            System.out.println("Click!!");
        }
    }



}







