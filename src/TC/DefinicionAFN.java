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

public class DefinicionAFN extends JFrame{
    public DefinicionAFN(){
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
         v.def.setBackground(new Color(93,222,244));
         this.getContentPane().add(panel); //Agregar panel a la ventana
         this.getContentPane().setBackground(new Color(229,229,229));
         panel.setBackground(new Color(229,229,229));
         panel.setBounds(330,50,700,700);
         
         
         JLabel etiqueta = new JLabel("B) No Deterministas");
         panel.add(etiqueta);
         etiqueta.setFont(new Font("arial black",Font.PLAIN,15));
         etiqueta.setBounds(10,40,300,30);
         
         JLabel etiqueta2 = new JLabel("A diferencia de los deterministas, estos admiten bifurcaciones en el autómata");
         panel.add(etiqueta2);
         etiqueta2.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta2.setBounds(10,80,500,30);
         
         JLabel etiqueta3 = new JLabel("además de transiciones indefinidas. Es decir, acepta una palabra si existe algún");
         panel.add(etiqueta3);
         etiqueta3.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta3.setBounds(10,100,500,30);
         
         JLabel etiqueta4 = new JLabel("camino posible que permite leer esa palabra y llegar a un estado de aceptación.");
         panel.add(etiqueta4);
         etiqueta4.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta4.setBounds(10,120,500,30);
         
         JLabel etiqueta5 = new JLabel("Por lo que, para estos autómatas ya no sera función la transición de estados pues");
         panel.add(etiqueta5);
         etiqueta5.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta5.setBounds(10,140,500,30);
         
         JLabel etiqueta6 = new JLabel("desde un estado es posible pasar a más de un estado o a ninguno.");
         panel.add(etiqueta6);
         etiqueta6.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta6.setBounds(10,160,500,30);
         
         JLabel etiqueta7 = new JLabel("Es decir, como la transición de estados denotada así:");
         panel.add(etiqueta7);
         etiqueta7.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta7.setBounds(90,180,500,30);
         
         ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/2.PNG")); // Transicion
         JLabel I1 = new JLabel();
         I1.setBounds(160,220,150,25);
         I1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(I1.getWidth(),I1.getHeight(),Image.SCALE_SMOOTH)));
         panel.add(I1);
         
         ImageIcon imagen0 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/6.PNG")); // Funcion
         JLabel I2 = new JLabel();
         I2.setBounds(160,280,150,25);
         I2.setIcon(new ImageIcon(imagen0.getImage().getScaledInstance(I2.getWidth(),I2.getHeight(),Image.SCALE_SMOOTH)));
         panel.add(I2);
         
         JLabel etiqueta8 = new JLabel("Ahora se convertirá en la siguiente función");
         panel.add(etiqueta8);
         etiqueta8.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta8.setBounds(110,250,500,30);
         
         JLabel etiqueta9 = new JLabel("Siendo P(Q) las partes de Q, es decir un subconjunto de Q");
         panel.add(etiqueta9);
         etiqueta9.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta9.setBounds(10,320,500,30);
         
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
        Ejercicios1 a = new Ejercicios1();
        a.setVisible(true); 
        dispose();
        }
         
     };
     boton.addActionListener(oyenteDeAccion);
     
     ActionListener oyenteDeAccion0 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        Definicion b = new Definicion();
        b.setVisible(true); 
        dispose();
        }
         
     };
     boton0.addActionListener(oyenteDeAccion0);
     }
    
}
