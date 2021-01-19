package TC;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TablaT extends JFrame implements ActionListener{
    String textInfo, textTabla;
    JLabel info, img1, tabla;
    JButton next, back;

    public TablaT(){
    HamburguerMenu h = new HamburguerMenu(getContentPane());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50,50,1000, 600);
        setTitle("Tabla de transicion");
        setLayout(null);
        setBackground(new Color(229, 229, 229));
        h.diag.setBackground(new Color(93, 222, 244));
        Font fo = h.getFont();
        
          textInfo = "<html>"
                + "<p style=\"text-align:justify;\">Tabla de Transiciones<br><br>"
                + "Una Tabla de transiciones es una representación tabular convencional de una funcion, por ejemplo &delta, "
                  + "que toma dos argumentos y devuelve un valor.<br><br>"
                  + "Las <b>filas</b> de la tabla corresponden a los <b>estados</b> y las <b>columnas</b> a las entradas."
                  + " La entrada para la fila correspondiente al estado <b>q</b> y a la columna correspondiente a la entrada <b>a</b> "
                  + "es el estado <b>&delta(q,a)</b><br><br>"
                  + "Ejemplo: Diagrama de transiociones del AFD que acepta todas las cadenas que "
                + "contienen a la subcadena 01 "
                + "</p></html>";
            
        textTabla = "<html>"
                + "<style>"
                + "table, td{border:1px solid black;  text-align: center; vertical-align: middle;}"
                + "</style>"
                + "<table>"
                + "<tr><td></td><td><b>0</b></td><td><b>1</b></td></tr>"
                + "<tr><td>->q0</td><td>q2</td><td>q0</td></tr>"
                + "<tr><td>*q1</td><td>q1</td><td>q1</td></tr>"
                + "<tr><td>q2</td><td>q2</td><td>q1</td></tr>"
                + "</table></html>";
        
        info = new JLabel(textInfo);
        info.setBounds(250, 50, 600, 220);
        info.setFont(fo.deriveFont(16f));
        add(info);
        
        tabla = new JLabel(textTabla);
        tabla.setFont(fo.deriveFont(22f));
        tabla.setBounds(650, 300, 400, 200);
        add(tabla);
        
        ImageIcon iconImg1 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/TablaT_1.png"));
        img1 = new JLabel();
        img1.setBounds(200, 300, 300, 150);
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
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Siguiente")){
           TablaT2 t = new TablaT2();
           dispose();
        }else{
            Thompson2 t = new Thompson2();
            dispose();
        }
    }

}
