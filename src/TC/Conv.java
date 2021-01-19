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

public class Conv extends JFrame implements ActionListener{
    String textInfo;
     JLabel info, img1;
     JButton next, back;
    
    public Conv(){
         HamburguerMenu h = new HamburguerMenu(getContentPane());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50,50,1000, 600);
        setTitle("Conversion");
        setLayout(null);
        setBackground(new Color(229, 229, 229));
        h.conv.setBackground(new Color(93, 222, 244));
        Font fo = h.getFont();
        
        textInfo = "<html>"
                + "<p style=\"text-align:justify;\">Un autómata finito no determinista (abreviado, AFN) <br>"
                + "puede representar mediante un grafo dirigido etiquetado, llamado grafo de transiciones,\n" +
                "en el que los nodos son los estados y las aristas etiquetadas representan las funciones de transición.\n" +
                "Este grafo se parece a un diagrama de transiciones, pero <b>el mismo carácter puede etiquetar dos o\n" +
                "más transiciones fuera de un estado</b><br><br>"
                + "Observese como el siguiene diagrama, el simbolo 'a' tiene dos transiciones en un mismo estado"
                + "</p></html>";
        
        info = new JLabel(textInfo);
        info.setBounds(250, 80, 600, 200);
        info.setFont(fo.deriveFont(18f));
        add(info);
        
        ImageIcon iconImg1 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/AFN1.PNG"));
        img1 = new JLabel();
        img1.setBounds(300, 320, 500, 200);
        img1.setIcon(new ImageIcon(iconImg1.getImage().getScaledInstance(img1.getWidth(),img1.getHeight(),Image.SCALE_SMOOTH)));
        add(img1);
        
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
            Conv2 c =new Conv2();
        }else{
            Ejercicios4 ej = new Ejercicios4();
            ej.setVisible(true);
            dispose();
        }
        dispose();
    }
    
}
