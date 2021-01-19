package TC;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TablaT2 extends JFrame implements ActionListener{
    String textInfo, textTabla;
    JLabel info, img1, tabla;
    JButton next, back;
    JTextField [] ent = new JTextField[8];
    String [] res ={"q2", "q1", "q3", "q0", "q0", "q3", "q1", "q2"}; 
    int correcto = 0;
    public TablaT2(){
    HamburguerMenu h = new HamburguerMenu(getContentPane());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50,50,1000, 600);
        setTitle("Tabla de transicion");
        setLayout(null);
        setBackground(new Color(229, 229, 229));
        h.diag.setBackground(new Color(93, 222, 244));
        Font fo = h.getFont();
        
          textInfo = "<html>"
                + "<p style=\"text-align:justify;\">Completa la tabla de transicion del siguiente autómata<br>"
                  + "A=({q0, q1, q2, q3}, {0,1}, &delta, q0, {q0})"
                + "</p></html>";
            
        textTabla = "<html>"
                + "<style>"
                + "table, td{border:1px solid black;  text-align: center; vertical-align: middle;}"
                + "td{width:100px;}"
                + "</style>"
                + "<table>"
                + "<tr><td>&delta</td><td><b>0</b></td><td><b>1</b></td></tr>"
                + "<tr><td>*->q0</td><td></td><td></td></tr>"
                + "<tr><td>q1</td><td></td><td></td></tr>"
                + "<tr><td>q2</td><td></td><td></td></tr>"
                + "<tr><td>q3</td><td></td><td></td></tr>"
                + "</table></html>";
        
        info = new JLabel(textInfo);
        info.setBounds(250, 50, 600, 100);
        info.setFont(fo.deriveFont(16f));
        add(info);
        
        ImageIcon iconImg1 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/TablaT_2.png"));
        img1 = new JLabel();
        img1.setBounds(200, 150, 300, 300);
        img1.setIcon(new ImageIcon(iconImg1.getImage().getScaledInstance(img1.getWidth(),img1.getHeight(),Image.SCALE_SMOOTH)));
        add(img1);
        
        tabla = new JLabel(textTabla);
        tabla.setFont(fo.deriveFont(25f));
        tabla.setBounds(600, 150, 200, 300);
        add(tabla);
        
       int cont = 0;
       int x=690;
       int y=245;
       for(int i=0; i<4; i++){
           for(int j=0; j<2; j++){
               ent[cont] = new JTextField();
               ent[cont].setBounds(x, y, 30, 30);
               add(ent[cont]);
               cont++;
               x+=60;
           }
           x=690;
           y+=40;
       }
        
        next = new JButton("Verificar");
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
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Verificar")){
            for(int i=0; i<res.length; i++){
                if(ent[i].getText().equalsIgnoreCase(res[i])){
                    ent[i].setBackground(new Color(0, 200, 83));
                    correcto++;
                }else{
                    ent[i].setBackground(new Color(255, 95, 82));
                }
            }
           if(correcto == 8){
               next.setText("Siguiente");
               info.setText("Haz respondido correctamente!!!");
           }else{
               correcto=0;
           }
            
        }else{
            if(e.getActionCommand().equals("Atras")){
                TablaT t = new TablaT();
                dispose();
            }else{
                if(e.getActionCommand().equals("Siguiente")){
                    Lenguajes a = new Lenguajes();
                    a.setVisible(true); 
                    dispose();
                    
                }
            }
        }
    }

}
