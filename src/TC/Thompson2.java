package TC;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Thompson2 extends JFrame implements ActionListener{
    JLabel info, img;
    JButton back, next;
    String textInfo;
    JTextField [] entradas = new JTextField[5];
    String [] res = {"Estado inicial", "Estado final", "Diagrama de Transicion", "Estado","Transicion"};
    int correcto = 0;
    public Thompson2(){
        HamburguerMenu h = new HamburguerMenu(getContentPane());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50,50,1000, 600);
        setTitle("Thompson Ejercicio");
        setLayout(null);
        setBackground(new Color(229, 229, 229));
        h.diag.setBackground(new Color(93, 222, 244));
        Font fo = h.getFont();
        
        textInfo = "<html><p style=\"text-align:justify;\">Coloca los siguientes nombres donde corresponde al diagrama de a+bc*<br>"
                + "<li type=\"disc\">Diagrama de Transicion</li>"
                + "<li type=\"disc\">Estado</li>"
                + "<li type=\"disc\">Transicion</li"
                + "<li type=\"disc\">Estado inicial</li>"
                + "<li type=\"disc\">Estado Final</li>"
                + "</p></html>";
        info = new JLabel(textInfo);
        info.setBounds(250, 50, 600, 200);
        info.setFont(fo.deriveFont(16f));
        add(info);
        
        ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/Thompson2.png"));
        img = new JLabel();
        img.setBounds(350, 300, 400, 200);
        img.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
        add(img);
        
        //Estado inicial
        entradas[0] = new JTextField();
        entradas[0].setBounds(360, 310, 100, 20);
        add(entradas[0]);
        
        //Estado final
        entradas[1] = new JTextField();
        entradas[1].setBounds(650, 310, 100, 20);
        add(entradas[1]);
        
        //Diagrama de transicion
        entradas[2] = new JTextField();
        entradas[2].setBounds(500, 250, 150, 30);
        add(entradas[2]);
        
        //Estado
        entradas[3] = new JTextField();
        entradas[3].setBounds(520, 480, 100, 20);
        add(entradas[3]);
        
        //Transicion
        entradas[4] = new JTextField();
        entradas[4].setBounds(630, 420, 100, 20);
        add(entradas[4]);
        
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
                if(entradas[i].getText().equalsIgnoreCase(res[i])){
                    entradas[i].setBackground(new Color(0, 200, 83));
                    correcto++;
                }else{
                    entradas[i].setBackground(new Color(255, 95, 82));
                }
            }
            
           if(correcto == 5){
               next.setText("Siguiente");
               info.setText("Haz respondido correctamente!!!");
           }else{
               correcto=0;
           }
            
        }else{
            if(e.getActionCommand().equals("Atras")){
                Thompson t = new Thompson();
                dispose();
            }else{
                if(e.getActionCommand().equals("Siguiente")){
                    TablaT t = new TablaT();
                    dispose();
                }
            }
        }
    }
}
