package TC;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class TheEnd extends JFrame implements ActionListener{
    String textInfo;
     JLabel info;
     JButton back;
    
    public TheEnd(){
        HamburguerMenu h = new HamburguerMenu(getContentPane());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50,50,1000, 600);
        setTitle("Fin");
        setLayout(null);
        setBackground(new Color(229, 229, 229));
        h.conv.setBackground(new Color(93, 222, 244));
        h.def.setBackground(new Color(93, 222, 244));
        h.diag.setBackground(new Color(93, 222, 244));
        h.lang.setBackground(new Color(93, 222, 244));
        Font fo = h.getFont();
        
        textInfo = "<html>"
                + "<p style=\"text-align:justify;\"> EN HORABUENA, HAS TERMINADO EL TEMARIO</p></html>";
        
        info = new JLabel(textInfo);
        info.setBounds(250, 80, 600, 300);
        info.setFont(fo.deriveFont(25f));
        add(info);
        
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
        if(ae.getActionCommand().equals("Atras")){
            Conv4 c = new Conv4();
            dispose();
        }        
    }    
}
