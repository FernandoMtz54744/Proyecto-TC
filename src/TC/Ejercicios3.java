package TC;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Ejercicios3 extends JFrame{
    
    public Ejercicios3(){
        setSize(1000,600);
        init();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Proyecto Final");
        setLocationRelativeTo(null);
        setLayout(null);
    }
    
        public String getSelectedButtonText(ButtonGroup buttonGroup) { 
  for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) { 
   AbstractButton button = buttons.nextElement(); 

   if (button.isSelected()) { 
    return button.getText(); 
   } 
  } 

  return null; 
 }
    
     private void init(){
        JPanel panel = new JPanel(); //Inicializa un panel
         panel.setLayout(null);
         HamburguerMenu v = new HamburguerMenu(getContentPane());
         v.lang.setBackground(new Color(93,222,244));
         this.getContentPane().add(panel); //Agregar panel a la ventana
         panel.setBackground(new Color(255,152,214));
         
         
         JLabel etiqueta = new JLabel("Ejercicios: Para cada inciso, seleccione el lenguaje aceptado por los");
         panel.add(etiqueta);
         etiqueta.setFont(new Font("arial black",Font.PLAIN,10));
         this.getContentPane().setBackground(new Color(229,229,229));
         panel.setBackground(new Color(229,229,229));
         panel.setBounds(330,50,700,700);
         
         JLabel etiqueta0 = new JLabel("autómatas finitos correspondientes.");
         panel.add(etiqueta0);
         etiqueta0.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta0.setBounds(10,60,500,30);
         
         JLabel etiqueta2 = new JLabel("A)");
         panel.add(etiqueta2);
         etiqueta2.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta2.setBounds(10,80,30,30);
         
         ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/13.PNG")); //Ejercicio1
         JLabel I1 = new JLabel();
         I1.setBounds(10,110,230,90);
         I1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(I1.getWidth(),I1.getHeight(),Image.SCALE_SMOOTH)));
         panel.add(I1);
         
         ImageIcon imagen0 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/14.PNG")); //Ejercicio2
         JLabel I2 = new JLabel();
         I2.setBounds(10,270,230,90);
         I2.setIcon(new ImageIcon(imagen0.getImage().getScaledInstance(I2.getWidth(),I2.getHeight(),Image.SCALE_SMOOTH)));
         panel.add(I2);
         
         JLabel etiqueta3 = new JLabel("B)");
         panel.add(etiqueta3);
         etiqueta3.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta3.setBounds(10,240,30,30);
         
         JRadioButton radioBoton = new JRadioButton("a*b",false);
         radioBoton.setBounds(260,110,50,30);
         radioBoton.setBackground(new Color(229,229,229));
         panel.add(radioBoton);
         
         JRadioButton radioBoton0 = new JRadioButton("a*b*",false);
         radioBoton0.setBounds(260,140,50,30);
         radioBoton0.setBackground(new Color(229,229,229));
         panel.add(radioBoton0);
         
         JRadioButton radioBoton1 = new JRadioButton("ab*",false);
         radioBoton1.setBounds(260,170,50,30);
         radioBoton1.setBackground(new Color(229,229,229));
         panel.add(radioBoton1);
         
         ButtonGroup grupoBotones = new ButtonGroup();
         grupoBotones.add(radioBoton);
         grupoBotones.add(radioBoton0);
         grupoBotones.add(radioBoton1);
         
         JRadioButton radioBoton2 = new JRadioButton("abc*",false);
         radioBoton2.setBounds(260,270,70,30);
         radioBoton2.setBackground(new Color(229,229,229));
         panel.add(radioBoton2);
         
         JRadioButton radioBoton3 = new JRadioButton("abc",false);
         radioBoton3.setBounds(260,300,70,30);
         radioBoton3.setBackground(new Color(229,229,229));
         panel.add(radioBoton3);
         
         JRadioButton radioBoton4 = new JRadioButton("ab+c*",false);
         radioBoton4.setBounds(260,330,70,30);
         radioBoton4.setBackground(new Color(229,229,229));
         panel.add(radioBoton4);
         
         ButtonGroup grupoBotones0 = new ButtonGroup();
         grupoBotones0.add(radioBoton2);
         grupoBotones0.add(radioBoton3);
         grupoBotones0.add(radioBoton4);
         
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
         
         JButton boton1 = new JButton();
         boton1.setText("Guardar Respuestas");
         boton1.setBounds(150,400,150,30);
         panel.add(boton1);
         boton1.setEnabled(true); 
         boton1.setForeground(Color.BLUE); 
         boton1.setFont(new Font("arial",Font.ITALIC,10));
         
         
     
     ActionListener oyenteDeAccion = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        Ejercicios4 a = new Ejercicios4();
        a.setVisible(true); 
        dispose();
        }
         
     };
     boton.addActionListener(oyenteDeAccion);
     
        ActionListener oyenteDeAccion2 = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        Ejemplos2 b = new Ejemplos2();
        b.setVisible(true); 
        dispose();
        }
         
     };
     boton0.addActionListener(oyenteDeAccion2);
     
     ActionListener oyenteDeAccion3 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        SuperClase.respuesta5 = getSelectedButtonText(grupoBotones);
        if(SuperClase.respuesta5.equals("a*b*")){
            SuperClase.opc5=1;
        }else{
            SuperClase.opc5=0;
        }
        
        SuperClase.respuesta6 = getSelectedButtonText(grupoBotones0);
        if(SuperClase.respuesta6.equals("abc*")){
            SuperClase.opc6=1;
        }else{
            SuperClase.opc6=0;
        }
        System.out.println(SuperClase.opc5);
        System.out.println(SuperClase.opc6);
        
        JOptionPane.showMessageDialog(null,"Respuestas Guardadas");
        }
         
     };
     boton1.addActionListener(oyenteDeAccion3);
     }


    /*
    public static void main(String[] args){
    Ejercicios3 v1 = new Ejercicios3();
    v1.setVisible(true);

    }
*/
}
