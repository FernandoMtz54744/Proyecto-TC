package TC;

import TC.Definicion;
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

public class Portada extends JFrame{

    
    public Portada(){
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
    this.getContentPane().add(panel); //Agregar panel a la ventana
    this.getContentPane().setBackground(new Color(229,229,229));
    panel.setBounds(240,0,700,700);
    panel.setBackground(new Color(229,229,229));
    
    JLabel etiqueta1 = new JLabel("INSTITUTO POLITÉCNICO NACIONAL");
    panel.add(etiqueta1); //Agregar etiqueta al panel
    etiqueta1.setForeground(new Color(144,12,63)); //Color a la etiqueta
    etiqueta1.setFont(new Font("cooper black",Font.PLAIN,20)); //Establecer fuente de texto
    etiqueta1.setBounds(40,10,450,30);
    
    JLabel etiqueta = new JLabel("ESCUELA SUPERIOR DE CÓMPUTO");
    panel.add(etiqueta); 
    etiqueta.setForeground(new Color(51,232,255)); 
    etiqueta.setFont(new Font("cooper black",Font.PLAIN,20)); 
    etiqueta.setBounds(50,70,450,30);
    
    JLabel etiqueta0 = new JLabel("PROYECTO FINAL");
    panel.add(etiqueta0); 
    etiqueta0.setForeground(new Color(255,110,51)); 
    etiqueta0.setFont(new Font("cooper black",Font.PLAIN,20)); 
    etiqueta0.setBounds(140,140,300,30);
    
    JLabel etiqueta2 = new JLabel("CORTES LÓPEZ JAIME ALEJANDRO");
    panel.add(etiqueta2); 
    etiqueta2.setForeground(new Color(145,224,209)); 
    etiqueta2.setFont(new Font("cooper black",Font.PLAIN,20)); 
    etiqueta2.setBounds(50,210,470,30);
    
    JLabel etiqueta3 = new JLabel("MARTÍNEZ MARTÍNEZ FERNANDO");
    panel.add(etiqueta3); 
    etiqueta3.setForeground(new Color(123,209,224)); 
    etiqueta3.setFont(new Font("cooper black",Font.PLAIN,20)); 
    etiqueta3.setBounds(60,280,470,30);
    
    JLabel etiqueta4 = new JLabel("AUTÓMATAS FINITOS");
    panel.add(etiqueta4); 
    etiqueta4.setForeground(new Color(195,215,49)); 
    etiqueta4.setFont(new Font("cooper black",Font.PLAIN,20)); 
    etiqueta4.setBounds(120,350,470,30);
    
    JButton boton = new JButton();
    boton.setText("Comenzar");
    boton.setBounds(200,400,100,30);
    panel.add(boton);
    boton.setEnabled(true); 
    boton.setForeground(Color.BLUE); 
    boton.setFont(new Font("arial",Font.ITALIC,10));
    
    ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/18.PNG")); //ESCOM
    JLabel I1 = new JLabel();
    I1.setBounds(370,350,100,100);
    I1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(I1.getWidth(),I1.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(I1);
    
    ImageIcon imagen1 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/17.PNG")); //IPN
    JLabel I2 = new JLabel();
    I2.setBounds(10,350,100,100);
    I2.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(I2.getWidth(),I2.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(I2);
    
    ActionListener oyenteDeAccion = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        Definicion a = new Definicion();
        a.setVisible(true); 
        dispose();
        }
         
     };
     boton.addActionListener(oyenteDeAccion);
    
    }
    
    public static void main(String[] args){
    new Portada().setVisible(true);
    }
}
