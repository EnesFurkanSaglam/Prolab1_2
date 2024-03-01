import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class first {
    private JButton btnadmin;
    private JButton btnkullanici;
    private JButton btnfirma;

    private JPanel panel;

    public first() {
        btnfirma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"selam");


            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame ("App"); frame.setContentPane (new first().panel);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible (true);



    }
}


