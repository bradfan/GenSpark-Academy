import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton button;


    public GUI() {

        frame = new JFrame();

        button = new JButton("START");
        button.addActionListener(this);
        label = new JLabel("PRESS START TO BEGIN YOUR ADVENTURE");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30,10, 30));
        panel.setLayout(new GridLayout(0, 1));
//        revisit this GridLayout as the gui evolves (rows, cols).
        panel.add(button);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Humans vs. Goblins");
        frame.pack();
        frame.setVisible(true);




    }


    @Override
    public void actionPerformed(ActionEvent e) {



    }
}
