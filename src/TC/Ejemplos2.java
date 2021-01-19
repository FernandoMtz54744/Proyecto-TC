
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

public class Ejemplos2 extends JFrame{
    
        public Ejemplos2(){
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
         
         
         JLabel etiqueta = new JLabel("3. ¿Cuál es el lenguaje aceptado por el siguiente autómata?");
         panel.add(etiqueta);
         etiqueta.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta.setBounds(10,40,400,30);
         
         ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/11.PNG")); //Ejemplo3
         JLabel I1 = new JLabel();
         I1.setBounds(100,70,230,90);
         I1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(I1.getWidth(),I1.getHeight(),Image.SCALE_SMOOTH)));
         panel.add(I1);
         
         ImageIcon imagen0 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/12.PNG")); //Ejemplo4
         JLabel I2 = new JLabel();
         I2.setBounds(120,240,220,90);
         I2.setIcon(new ImageIcon(imagen0.getImage().getScaledInstance(I2.getWidth(),I2.getHeight(),Image.SCALE_SMOOTH)));
         panel.add(I2);
         
         JLabel etiqueta0 = new JLabel("Solución");
         panel.add(etiqueta0);
         etiqueta0.setFont(new Font("arial black",Font.PLAIN,15));
         etiqueta0.setBounds(10,150,100,30);
         
         JLabel etiqueta2 = new JLabel("Aquí se observa que a y b se llaman recursivamente pero al pasar de q0 a q1 y de");
         panel.add(etiqueta2);
         etiqueta2.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta2.setBounds(10,170,500,30);
         
         JLabel etiqueta3 = new JLabel("q1 a q2 hay una letra a y otra b, esto quiere decir que habrá por lo menos las letras");
         panel.add(etiqueta3);
         etiqueta3.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta3.setBounds(10,180,500,30);
         
         JLabel etiqueta4 = new JLabel("ab y puede o no haber mas letras a y b de acuerdo a la recursividad en los estados");
         panel.add(etiqueta4);
         etiqueta4.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta4.setBounds(10,190,500,30);
         
         JLabel etiqueta5 = new JLabel("q1 y q2. Por lo que el lenguaje aceptado es:");
         panel.add(etiqueta5);
         etiqueta5.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta5.setBounds(10,200,300,30);
         
         JLabel etiqueta6 = new JLabel("aa*bb*");
         panel.add(etiqueta6);
         etiqueta6.setFont(new Font("arial black",Font.PLAIN,15));
         etiqueta6.setBounds(270,200,100,30);
         etiqueta6.setForeground(Color.RED);
         
         JLabel etiqueta7 = new JLabel("4. ¿Cuál es el lenguaje aceptado por el siguiente autómata?");
         panel.add(etiqueta7);
         etiqueta7.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta7.setBounds(10,220,400,30);
         
         JLabel etiqueta8 = new JLabel("Solución");
         panel.add(etiqueta8);
         etiqueta8.setFont(new Font("arial black",Font.PLAIN,15));
         etiqueta8.setBounds(10,300,100,30);
         
         JLabel etiqueta9 = new JLabel("En este caso se tiene una recursividad de b en q2 que estará junto a c y se llega");
         panel.add(etiqueta9);
         etiqueta9.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta9.setBounds(10,330,500,30);
         
         JLabel etiquetaA = new JLabel("a un estado final, mientras que, al pasar de q0 a q1 hay dos letras a,c las cuales");
         panel.add(etiquetaA);
         etiquetaA.setFont(new Font("arial black",Font.PLAIN,10));
         etiquetaA.setBounds(10,340,500,30);
         
         JLabel etiquetaB = new JLabel("se sumarán.Al tener 2 estados finales, estos sumarán las letras que llegaron a los");
         panel.add(etiquetaB);
         etiquetaB.setFont(new Font("arial black",Font.PLAIN,10));
         etiquetaB.setBounds(10,350,500,30);
         
         JLabel etiquetaC = new JLabel("mismos. Por lo tanto, el lenguaje aceptado para este autómata es:");
         panel.add(etiquetaC);
         etiquetaC.setFont(new Font("arial black",Font.PLAIN,10));
         etiquetaC.setBounds(10,360,500,30);
         
         JLabel etiquetaD = new JLabel("a+c+b*c");
         panel.add(etiquetaD);
         etiquetaD.setFont(new Font("arial black",Font.PLAIN,15));
         etiquetaD.setBounds(200,380,100,30);
         etiquetaD.setForeground(Color.RED);
         
         JButton boton = new JButton();
         boton.setText("Siguiente");
         boton.setBounds(340,400,100,30);
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
        Ejercicios3 a = new Ejercicios3();
        a.setVisible(true); 
        dispose();
        }
         
     };
     boton.addActionListener(oyenteDeAccion);
     
        ActionListener oyenteDeAccion2 = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        Ejemplos b = new Ejemplos();
        b.setVisible(true); 
        dispose();
        }
         
     };
     boton0.addActionListener(oyenteDeAccion2);
         
        }
        
    /*
    public static void main(String[] args){
    Ejemplos2 v1 = new Ejemplos2();
    v1.setVisible(true);
    }
*/
}
