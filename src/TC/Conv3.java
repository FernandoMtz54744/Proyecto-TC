package TC;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class Conv3 extends JFrame implements ActionListener{
    String textInfo, textInfo2;
     JLabel info, img1, info2;
     JButton next, back;
    
    public Conv3(){
         HamburguerMenu h = new HamburguerMenu(getContentPane());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50,50,1000, 600);
        setTitle("Conversion");
        setLayout(null);
        setBackground(new Color(229, 229, 229));
        h.conv.setBackground(new Color(93, 222, 244));
        Font fo = h.getFont();
        
        textInfo = "<html>"
                + "<p style=\"text-align:justify;\">Implementando el algoritmo al siguiente AFN que acepta c(aa)* se tiene:  </li>"
                + "</p></html>";
        
        info = new JLabel(textInfo);
        info.setBounds(250, 80, 600, 50);
        info.setFont(fo.deriveFont(18f));
        add(info);
        
        ImageIcon iconImg1 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/AFN2.PNG"));
        img1 = new JLabel();
        img1.setBounds(300, 120, 450, 150);
        img1.setIcon(new ImageIcon(iconImg1.getImage().getScaledInstance(img1.getWidth(),img1.getHeight(),Image.SCALE_SMOOTH)));
        add(img1);
        
        textInfo2 = "<html>"
                + "<p style=\"text-align:justify;\">Cerradura-&epsilon(0) = {0} = A<br>"
                + "mueve(A,a) = &empty<br>"
                + "mueve(A,c) = {1}<br>"
                + "Cerradura-&epsilon({1}) = {1,2,5} = B<br>" 
                +"mueve(B,a) = {3}<br>"
                +"Cerradura-&epsilon({3}) = {3} = C<br>"
                +"mueve(B,c) = &empty<br>"
                +"mueve(C,a) = {4}<br>"
                +"Cerradura-&epsilon({4}) = {4,2,5} = D<br>"
                +"mueve(C,c) = &empty<br>"
                +"mueve(D,a) = {3}<br>"
                +"Cerradura-ε({3}) = C<br>"
                +"mueve(D,c) = &empty<br>"
                + "</p></html><br>";
        
        info2 = new JLabel(textInfo2);
        info2.setBounds(400, 200, 600, 400);
        info2.setFont(fo.deriveFont(15f));
        add(info2);
        
        next = new JButton("Siguiente");
        next.setFont(fo.deriveFont(12f));
        next.setBounds(850, 500, 100, 40);
        next.setBackground(new Color(0, 188, 212));
        next.setBorderPainted(false);
        next.addActionListener(this);
        add(next);
        
        back = new JButton("Atras");
        back.setFont(fo.deriveFont(12f));
        back.setBounds(180, 500, 100, 40);
        back.setBackground(new Color(0, 188, 212));
        back.setBorderPainted(false);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Siguiente")){
            Conv4 c =new Conv4();
        }else{
             Conv2 c =new Conv2();
        }
        dispose();
    }
    
}
