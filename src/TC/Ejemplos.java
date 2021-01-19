
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

public class Ejemplos extends JFrame{
    
    public Ejemplos(){
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
         
         
         JLabel etiqueta = new JLabel("Ejemplos");
         panel.add(etiqueta);
         etiqueta.setFont(new Font("arial black",Font.PLAIN,15));
         etiqueta.setBounds(10,40,100,30);
         
         JLabel etiqueta3 = new JLabel("1. ¿Cuál es el lenguaje aceptado por el siguiente autómata?");
         panel.add(etiqueta3);
         etiqueta3.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta3.setBounds(10,60,400,30);
         
         ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/9.PNG")); //Ejemplo1
         JLabel I1 = new JLabel();
         I1.setBounds(10,90,110,110);
         I1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(I1.getWidth(),I1.getHeight(),Image.SCALE_SMOOTH)));
         panel.add(I1);
         
         ImageIcon imagen0 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/10.PNG")); //Ejemplo2
         JLabel I2 = new JLabel();
         I2.setBounds(10,250,220,110);
         I2.setIcon(new ImageIcon(imagen0.getImage().getScaledInstance(I2.getWidth(),I2.getHeight(),Image.SCALE_SMOOTH)));
         panel.add(I2);
         
         JLabel etiqueta2 = new JLabel("Solución");
         panel.add(etiqueta2);
         etiqueta2.setFont(new Font("arial black",Font.PLAIN,15));
         etiqueta2.setBounds(130,80,100,30);
         
         JLabel etiqueta4 = new JLabel("Como se observa, la letra a es recursiva pues se");
         panel.add(etiqueta4);
         etiqueta4.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta4.setBounds(130,100,300,30);
         
         JLabel etiqueta5 = new JLabel("encuentra en un mismo estado y al ser el final");
         panel.add(etiqueta5);
         etiqueta5.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta5.setBounds(130,120,300,30);
         
         JLabel etiqueta6 = new JLabel("puede no existir ningún elemento, por lo tanto:");
         panel.add(etiqueta6);
         etiqueta6.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta6.setBounds(130,140,300,30);
         
         JLabel etiqueta7 = new JLabel("El lenguaje aceptado para este automata es:");
         panel.add(etiqueta7);
         etiqueta7.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta7.setBounds(130,160,300,30);
         
         JLabel etiqueta8 = new JLabel("a*");
         panel.add(etiqueta8);
         etiqueta8.setFont(new Font("arial black",Font.PLAIN,20));
         etiqueta8.setBounds(240,180,100,30);
         etiqueta8.setForeground(Color.RED);
         
         JLabel etiqueta9 = new JLabel("2. ¿Cuál es el lenguaje aceptado por el siguiente autómata?");
         panel.add(etiqueta9);
         etiqueta9.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta9.setBounds(10,220,400,30);
         
         JLabel etiquetaA = new JLabel("Solucion");
         panel.add(etiquetaA);
         etiquetaA.setFont(new Font("arial black",Font.PLAIN,15));
         etiquetaA.setBounds(240,240,100,30);
         
         JLabel etiquetaB = new JLabel("En este caso, el autómata siempre va a");
         panel.add(etiquetaB);
         etiquetaB.setFont(new Font("arial black",Font.PLAIN,10));
         etiquetaB.setBounds(240,260,300,30);
         
         JLabel etiquetaC = new JLabel("generar las letras ab las veces que sea ");
         panel.add(etiquetaC);
         etiquetaC.setFont(new Font("arial black",Font.PLAIN,10));
         etiquetaC.setBounds(240,280,300,30);
         
         JLabel etiquetaD = new JLabel("y como el estado inicial es igual al final,");
         panel.add(etiquetaD);
         etiquetaD.setFont(new Font("arial black",Font.PLAIN,10));
         etiquetaD.setBounds(240,300,300,30);
         
         JLabel etiquetaE = new JLabel("puede que no exista ningún elemento");
         panel.add(etiquetaE);
         etiquetaE.setFont(new Font("arial black",Font.PLAIN,10));
         etiquetaE.setBounds(240,320,300,30);
         
         JLabel etiquetaF = new JLabel("como en el caso anterior, por tanto, el");
         panel.add(etiquetaF);
         etiquetaF.setFont(new Font("arial black",Font.PLAIN,10));
         etiquetaF.setBounds(240,340,300,30);
         
         JLabel etiquetaG = new JLabel("lenguaje aceptado es:");
         panel.add(etiquetaG);
         etiquetaG.setFont(new Font("arial black",Font.PLAIN,10));
         etiquetaG.setBounds(240,360,300,30);
         
         JLabel etiquetaH = new JLabel("(ab)*");
         panel.add(etiquetaH);
         etiquetaH.setFont(new Font("arial black",Font.PLAIN,20));
         etiquetaH.setBounds(240,380,100,30);
         etiquetaH.setForeground(Color.RED);
         
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
        Ejemplos2 a = new Ejemplos2();
        a.setVisible(true); 
        dispose();
        }
         
     };
     boton.addActionListener(oyenteDeAccion);
     
        ActionListener oyenteDeAccion2 = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        Lenguajes b = new Lenguajes();
        b.setVisible(true); 
        dispose();
        }
         
     };
     boton0.addActionListener(oyenteDeAccion2);
         
    }
    
    /*
    public static void main(String[] args){
    Ejemplos v1 = new Ejemplos();
    v1.setVisible(true);
    }
*/
}
