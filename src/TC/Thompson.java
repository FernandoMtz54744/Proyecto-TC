package TC;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Thompson extends JFrame implements ActionListener{
    JLabel info;
    String textInfo, textInfo2;
    JButton next, back;
    int contSig=0;
    public Thompson(){
        HamburguerMenu h = new HamburguerMenu(getContentPane());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50,50,1000, 600);
        setTitle("Thompson");
        setLayout(null);
        setBackground(new Color(229, 229, 229));
        h.diag.setBackground(new Color(93, 222, 244));
        Font fo = h.getFont();
        
        textInfo = "<html>"
                + "<p style=\"text-align:justify;\">Si dada una cadena w se nos pregunta si w pertenece a un lenguaje A, se deben analizar no solo los "
                + "caracteres que aparecen en w, sino también sus posiciones relativas.<br><br>"
                + "Para ello, se puede construir un diagrama que nos ayude a determinar los distintos miembros del lenguaje. "
                + "Tal diagrama tiene la forma de un grafo dirigido con información adicional añadida y se llama <b>Diagrama de transicion</b> o <b>Diagrama de Thompson</b><br><br>"
                + "Los nodos del grafo se llaman <b>Estados</b> y se usan para señalar , en ese momento, hasta que lugar se ha analizado"
                + "la cadena.<br><br>"
                + "Las aristas del grafo se etiquetan con carácteres del alfabeto y se llaman <b>Transiciones</b>.</p>"
                + "</html>";
        
        textInfo2 = "<html>"
                + "<p style=\"text-align:justify;\">"
                + "Si el siguiente a reconocer concuerda con la etiqueta de alguna transición que parta del estado actual, "
                + "nos desplazamos al estado al que nos lleve la arista correspondiente. <br><br>"
                + "Naturalmente, debemos emepezar por un <b>Estado inicial</b>, y cuando se hayan tratado todos los carácteres "
                + "de la cadena correspondiente necesitamos saber si la cadena es \"legal\". <br><br>"
                + "Para ello se marcan ciertos estados como <b>Estados de aceptación</b> o <b>Estados finales</b>.<br><br>"
                + "Se marca el estado inicial con una flecha (->) y alredededor de los estados de aceptación se traza un circulo."
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
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Siguiente")){
            if(contSig==0){
                info.setText(textInfo2);
                contSig++;
            }else{
                Thompson2 t = new Thompson2();
                dispose();
            }
        }else{
            if(contSig == 1){
                info.setText(textInfo);
                contSig--;
            }else{
                Ejercicios2 anterior = new Ejercicios2();
                anterior.setVisible(true);
                dispose();
            }
        }
    }
}
