import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
/*


        Panel Oluşumu


        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(200,200);
        JButton buton = new JButton("Buton");
        frame.getContentPane().add(buton);
        panel.add(buton);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

         */

        /*

        Buton Kullanımı



        JFrame frame = new JFrame("Buton Örneği");
        JButton buton = new JButton("Gönder");

        frame.add(buton);
        buton.setBounds(0,0,100,30); //butonun yerini belirliyor.

        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Butona Tıklandı");
            }
        });


        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);


         */

        /*

        Label Kullanımı


        JFrame frame = new JFrame("Label Örneği");
        JLabel label = new JLabel("Yazı Kısmı");
        label.setText("Yazı Kısmı");
        label.setBounds(100,50,100,30);

        JButton buton = new JButton("Değiştir");
        buton.setBounds(100,100,100,30);

        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Butona Tıklandı");
            }
        });

        frame.add(label);
        frame.add(buton);


        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);


         */

        //Test1

        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        JButton adminbutonu = new JButton();
        JButton kullanicibutonu = new JButton();
        JButton sirketbutonu = new JButton();

        frame.add(adminbutonu);
        frame.add(kullanicibutonu);
        frame.add(sirketbutonu);

        adminbutonu.setText("adminbutonu");
        kullanicibutonu.setText("kullanicibutonu");
        sirketbutonu.setText("sirketbutonu");

        adminbutonu.setBounds(0,0,200,100);
        kullanicibutonu.setBounds(0,200,200,100);
        sirketbutonu.setBounds(0,400,200,100);

        adminbutonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame adminframe = new JFrame();
                JLabel label = new JLabel();
                label.setBounds(200,200,200,200);
                adminframe.setSize(1000,1000);
                adminframe.add(label);

                label.setText("admin paneline hoş geldiniz");


                adminframe.setLayout(null);
                adminframe.setVisible(true);
            }
        });


        frame.setLayout(null);
        frame.setVisible(true);




    }
}