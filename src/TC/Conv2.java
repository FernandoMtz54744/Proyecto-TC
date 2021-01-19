package TC;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class Conv2 extends JFrame implements ActionListener{
    String textInfo;
     JLabel info;
     JButton next, back;
    
    public Conv2(){
         HamburguerMenu h = new HamburguerMenu(getContentPane());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50,50,1000, 600);
        setTitle("Conversion");
        setLayout(null);
        setBackground(new Color(229, 229, 229));
        h.conv.setBackground(new Color(93, 222, 244));
        Font fo = h.getFont();
        
        textInfo = "<html>"
                + "<p style=\"text-align:justify;\">Para convertir un AFN a AFD se utiliza el método de los subjconjuntos, <br>"
                + "dicho método toma en cuenta las transiciones lambda, para ello se definen las siguientes operaciones:"
                + "<br><li type=\"disc\">Cerradura &epsilon(s): Conjunto de estados del AFN alcanzables desde el estado s del AFN con transiciones &epsilon solamente.</li>"
                + "<br><li type=\"disc\">Cerradura &epsilon(T): Conjunto de estados del AFN alcanzables desde algún estado s en T con transiciones &epsilon solamente. </li>"
                + "<br><li type=\"disc\"> mover(T,a): Conjunto de estados del AFN hacia los cuales hay una transición con el símbolo de entrada a desde algún estado s en T del AFN. </li>"
                + "</p></html>";
        
        info = new JLabel(textInfo);
        info.setBounds(250, 80, 600, 300);
        info.setFont(fo.deriveFont(18f));
        add(info);
        
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
            Conv3 c =new Conv3();
        }else{
             Conv c =new Conv();
        }
        dispose();
    }
    
}
