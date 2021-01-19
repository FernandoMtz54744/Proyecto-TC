package TC;

import TC.Ejemplos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import TC.TablaT2;

public class Lenguajes extends JFrame{
    
     public Lenguajes(){
        setSize(1000,600);
        init();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Proyecto Final");
        setLocationRelativeTo(null); 
        setLayout(null);
    }
     
      private void init(){
          JPanel panel = new JPanel(); //Inicializa un panel
         panel.setLayout(null);
         HamburguerMenu v = new HamburguerMenu(getContentPane());
         v.lang.setBackground(new Color(93,222,244));
         this.getContentPane().add(panel); //Agregar panel a la ventana
         this.getContentPane().setBackground(new Color(229,229,229));
         panel.setBackground(new Color(229,229,229));
         panel.setBounds(330,50,700,700);
         
         
         JLabel etiqueta = new JLabel("¿Qué lenguajes aceptan los automatas?");
         panel.add(etiqueta);
         etiqueta.setFont(new Font("arial black",Font.PLAIN,15));
         etiqueta.setBounds(10,40,350,30);
         
         JLabel etiqueta0 = new JLabel("A) Deterministas");
         panel.add(etiqueta0);
         etiqueta0.setFont(new Font("arial black",Font.PLAIN,15));
         etiqueta0.setBounds(10,60,300,30);
         
         JLabel etiqueta3 = new JLabel("El lenguaje aceptado por estos automatas es el conjunto de");
         panel.add(etiqueta3);
         etiqueta3.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta3.setBounds(10,80,400,30);
         
         JLabel etiqueta4 = new JLabel("palabras tales que a partir del estado inicial y siguiendo la función");
         panel.add(etiqueta4);
         etiqueta4.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta4.setBounds(10,100,400,30);
         
         JLabel etiqueta5 = new JLabel("de transición se llega a un estado de aceptación. Es decir:");
         panel.add(etiqueta5);
         etiqueta5.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta5.setBounds(10,120,350,30);
         
         ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/7.PNG")); //Conjunto de estados
         JLabel I1 = new JLabel();
         I1.setBounds(130,160,180,25);
         I1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(I1.getWidth(),I1.getHeight(),Image.SCALE_SMOOTH)));
         panel.add(I1);
    
         JLabel etiqueta6 = new JLabel("B) No Deterministas");
         panel.add(etiqueta6);
         etiqueta6.setFont(new Font("arial black",Font.PLAIN,15));
         etiqueta6.setBounds(10,200,300,30);
         
         JLabel etiqueta7 = new JLabel("El lenguaje aceptado por estos autómatas será aquel w el cual,");
         panel.add(etiqueta7);
         etiqueta7.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta7.setBounds(10,220,450,30);

         
         JLabel etiqueta9 = new JLabel("si a partir del estado inicial, y leyendo w es posible llegar a");
         panel.add(etiqueta9);
         etiqueta9.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta9.setBounds(10,240,350,30);
         
         JLabel etiqueta10 = new JLabel("algún estado que sea de aceptación.");
         panel.add(etiqueta10);
         etiqueta10.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta10.setBounds(10,260,350,30);
         
         ImageIcon imagen1 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/8.PNG")); //Conjunto de estados
         JLabel I2 = new JLabel();
         I2.setBounds(130,310,180,25);
         I2.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(I2.getWidth(),I2.getHeight(),Image.SCALE_SMOOTH)));
         panel.add(I2);
         
         JButton boton = new JButton();
         boton.setText("Siguiente");
         boton.setBounds(350,400,100,30);
         panel.add(boton);
         boton.setEnabled(true); 
         boton.setForeground(Color.BLUE); 
         boton.setFont(new Font("arial",Font.ITALIC,10)); 
    
         JButton boton0 = new JButton();
         boton0.setText("Anterior");
         boton0.setBounds(10,400,100,30);
         panel.add(boton0);
         boton0.setEnabled(true); 
         boton0.setForeground(Color.BLUE); 
         boton0.setFont(new Font("arial",Font.ITALIC,10)); 
         
         ActionListener oyenteDeAccion = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        Ejemplos a = new Ejemplos();
        a.setVisible(true); 
        dispose();
        }
         
     };
     boton.addActionListener(oyenteDeAccion);
     
        ActionListener oyenteDeAccion2 = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            TablaT2 t = new TablaT2();
            dispose();
        }
         
     };
     boton0.addActionListener(oyenteDeAccion2);
         
      }
     
      public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
