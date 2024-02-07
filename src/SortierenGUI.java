import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortierenGUI {
    private JButton SortierenB;
    private JPanel sortieren;



    public SortierenGUI() {



            SortierenB.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  for (int i=0;i<10;i++){}


                }
            });
        }


    public static void main(String[] args) {
        JFrame frame = new JFrame("SortierenGUI");
        frame.setContentPane(new SortierenGUI().sortieren);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

