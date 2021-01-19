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

public class Conv4 extends JFrame implements ActionListener{
    String textInfo, textInfo2;
     JLabel info, img1, info2, img2;
     JButton next, back;
    
    public Conv4(){
         HamburguerMenu h = new HamburguerMenu(getContentPane());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50,50,1000, 600);
        setTitle("Conversion");
        setLayout(null);
        setBackground(new Color(229, 229, 229));
        h.conv.setBackground(new Color(93, 222, 244));
        Font fo = h.getFont();
        
        textInfo = "<html>"
                + "<p style=\"text-align:justify;\">Realizando su tabla de transicion:</li>"
                + "</p></html>";
        
        info = new JLabel(textInfo);
        info.setBounds(400, 80, 600, 40);
        info.setFont(fo.deriveFont(18f));
        add(info);
        
        ImageIcon iconImg1 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/TablaAFN.PNG"));
        img1 = new JLabel();
        img1.setBounds(450, 120, 200, 150);
        img1.setIcon(new ImageIcon(iconImg1.getImage().getScaledInstance(img1.getWidth(),img1.getHeight(),Image.SCALE_SMOOTH)));
        add(img1);
        
        textInfo2 = "<html><p style=\"text-align:justify;\">Y finalmente el diagrama AFN convertido a AFD </p></html>";
        
        info2 = new JLabel(textInfo2);
        info2.setBounds(400, 200, 350, 200);
        info2.setFont(fo.deriveFont(15f));
        add(info2);
        
        ImageIcon iconImg2 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/AFNtoAFD.PNG"));
        img2 = new JLabel();
        img2.setBounds(320, 320, 450, 150);
        img2.setIcon(new ImageIcon(iconImg2.getImage().getScaledInstance(img2.getWidth(),img2.getHeight(),Image.SCALE_SMOOTH)));
        add(img2);
        
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
            TheEnd fin = new TheEnd();
        }else{
             Conv3 c =new Conv3();
        }
        dispose();
    }
    
}
