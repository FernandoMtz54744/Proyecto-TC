package TC;

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

public class Definicion extends JFrame{
    
    public Definicion(){
        setSize(1000,600);
        init();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Proyecto Final"); //Establecer el titulo
        setLocationRelativeTo(null); //Ventana en el centro
        setLayout(null);
    }
    
    private void init(){
    JPanel panel = new JPanel(); //Inicializa un panel
    panel.setLayout(null);
    HamburguerMenu v = new HamburguerMenu(getContentPane());
    v.def.setBackground(new Color(93,222,244));
    this.getContentPane().add(panel); //Agregar panel a la ventana
    this.getContentPane().setBackground(new Color(229,229,229));
    panel.setBackground(new Color(229,229,229));
    panel.setBounds(330,50,700,700);
    
    
    
    JLabel etiqueta = new JLabel("¿Cómo estan definidos los autómatas?");
    panel.add(etiqueta);
    etiqueta.setFont(new Font("arial black",Font.PLAIN,15));
    etiqueta.setBounds(10,40,350,30);
    
    JLabel etiqueta2 = new JLabel("A) Deterministas");
    panel.add(etiqueta2);
    etiqueta2.setFont(new Font("arial black",Font.PLAIN,15));
    etiqueta2.setBounds(10,60,300,30);
    
    JLabel etiqueta3 = new JLabel("Estan definidos por:");
    panel.add(etiqueta3);
    etiqueta3.setFont(new Font("arial black",Font.PLAIN,10));
    etiqueta3.setBounds(10,80,300,30);
    
    JLabel etiqueta4 = new JLabel("*Un conjunto finito de estados");
    panel.add(etiqueta4);
    etiqueta4.setFont(new Font("arial black",Font.PLAIN,10));
    etiqueta4.setBounds(10,100,300,30);
    
    ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/0.PNG")); //Conjunto de estados
    JLabel I1 = new JLabel();
    I1.setBounds(200,100,150,25);
    I1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(I1.getWidth(),I1.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(I1);
    
    ImageIcon imagen0 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/1.PNG")); // Alfabeto
    JLabel I2 = new JLabel();
    I2.setBounds(10,140,30,25);
    I2.setIcon(new ImageIcon(imagen0.getImage().getScaledInstance(I2.getWidth(),I2.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(I2);
    
    ImageIcon imagen1 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/2.PNG")); // Transicion
    JLabel I3 = new JLabel();
    I3.setBounds(250,180,150,25);
    I3.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(I3.getWidth(),I3.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(I3);
    
    ImageIcon imagen2 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/3.PNG")); // Estado inicial
    JLabel I4 = new JLabel();
    I4.setBounds(10,220,100,25);
    I4.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(I4.getWidth(),I4.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(I4);
    
    ImageIcon imagen3 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/4.PNG")); // subconjunto
    JLabel I5 = new JLabel();
    I5.setBounds(280,260,80,25);
    I5.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(I5.getWidth(),I5.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(I5);
    
    ImageIcon imagen4 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/5.PNG")); // Tupla
    JLabel I6 = new JLabel();
    I6.setBounds(140,340,170,25);
    I6.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(I6.getWidth(),I6.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(I6);
    
    
    JLabel etiqueta5 = new JLabel("*Un alfabeto de entrada");
    panel.add(etiqueta5);
    etiqueta5.setFont(new Font("arial black",Font.PLAIN,10));
    etiqueta5.setBounds(60,140,300,30);
    
    JLabel etiqueta6 = new JLabel("*Una función de transición de estados");
    panel.add(etiqueta6);
    etiqueta6.setFont(new Font("arial black",Font.PLAIN,10));
    etiqueta6.setBounds(10,180,300,30);
    
    JLabel etiqueta7 = new JLabel("*Un estado inicial");
    panel.add(etiqueta7);
    etiqueta7.setFont(new Font("arial black",Font.PLAIN,10));
    etiqueta7.setBounds(130,220,300,30);
    
    JLabel etiqueta8 = new JLabel("*Un subconjunto de estados de aceptación.");
    panel.add(etiqueta8);
    etiqueta8.setFont(new Font("arial black",Font.PLAIN,10));
    etiqueta8.setBounds(10,260,300,30);
    
    JLabel etiqueta9 = new JLabel("De modo que se forma una tupla:");
    panel.add(etiqueta9);
    etiqueta9.setFont(new Font("arial black",Font.PLAIN,10));
    etiqueta9.setBounds(130,300,300,30);
    
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
        DefinicionAFN b = new DefinicionAFN();
        b.setVisible(true); 
        dispose();
        }
         
     };
     boton.addActionListener(oyenteDeAccion);
     
     ActionListener oyenteDeAccion0 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        Portada b = new Portada();
        b.setVisible(true); 
        dispose();
        }
         
     };
     boton0.addActionListener(oyenteDeAccion0);
     
    }
}
