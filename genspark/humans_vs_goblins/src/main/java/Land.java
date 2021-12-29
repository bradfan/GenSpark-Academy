import javax.swing.*;
import java.awt.*;

public class Land {
    //  constructor
    public Land() {
        JFrame frameObj;
        frameObj = new JFrame();
        frameObj.setLayout(new GridLayout(3,3));
        frameObj.setSize(10,10);
        frameObj.setVisible(true);
        System.out.println("GRID: " + frameObj);
    }

    public static void main(String[] args) {
        new Land();
        System.out.println();
    }



}
