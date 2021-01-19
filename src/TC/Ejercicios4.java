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
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Ejercicios4 extends JFrame{
    
    
    public Ejercicios4(){
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
         this.getContentPane().setBackground(new Color(229,229,229));
         panel.setBackground(new Color(229,229,229));
         panel.setBounds(330,50,700,700);;
         
         
         JLabel etiqueta2 = new JLabel("C)");
         panel.add(etiqueta2);
         etiqueta2.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta2.setBounds(10,40,30,30);
         
         ImageIcon imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/15.PNG")); //Ejercicio3
         JLabel I1 = new JLabel();
         I1.setBounds(10,70,260,130);
         I1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(I1.getWidth(),I1.getHeight(),Image.SCALE_SMOOTH)));
         panel.add(I1);
         
         ImageIcon imagen0 = new ImageIcon(getClass().getClassLoader().getResource("imagenes/16.PNG")); //Ejercicio4
         JLabel I2 = new JLabel();
         I2.setBounds(10,260,300,90);
         I2.setIcon(new ImageIcon(imagen0.getImage().getScaledInstance(I2.getWidth(),I2.getHeight(),Image.SCALE_SMOOTH)));
         panel.add(I2);
         
         JLabel etiqueta3 = new JLabel("D)");
         panel.add(etiqueta3);
         etiqueta3.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta3.setBounds(10,230,30,30);
         
         JRadioButton radioBoton = new JRadioButton("ca+ac",false);
         radioBoton.setBounds(300,70,70,30);
         radioBoton.setBackground(new Color(229,229,229));
         panel.add(radioBoton);
         
         JRadioButton radioBoton0 = new JRadioButton("ca+ac*",false);
         radioBoton0.setBounds(300,100,70,30);
         radioBoton0.setBackground(new Color(229,229,229));
         panel.add(radioBoton0);
         
         JRadioButton radioBoton1 = new JRadioButton("c*a+ac*",false);
         radioBoton1.setBounds(300,130,70,30);
         radioBoton1.setBackground(new Color(229,229,229));
         panel.add(radioBoton1);
         
         ButtonGroup grupoBotones = new ButtonGroup();
         grupoBotones.add(radioBoton);
         grupoBotones.add(radioBoton0);
         grupoBotones.add(radioBoton1);
         
         JRadioButton radioBoton2 = new JRadioButton("(0+1)*+010+(0+1)*",false);
         radioBoton2.setBounds(330,260,130,30);
         radioBoton2.setBackground(new Color(229,229,229));
         panel.add(radioBoton2);
         
         JRadioButton radioBoton3 = new JRadioButton("(0+1)010(0+1)*",false);
         radioBoton3.setBounds(330,290,130,30);
         radioBoton3.setBackground(new Color(229,229,229));
         panel.add(radioBoton3);
         
         JRadioButton radioBoton4 = new JRadioButton("(0+1)*010(0+1)*",false);
         radioBoton4.setBounds(330,320,130,30);
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
         boton.setEnabled(false); 
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
         boton1.setText("Ver Calificacion");
         boton1.setBounds(150,400,150,30);
         panel.add(boton1);
         boton1.setEnabled(true); 
         boton1.setForeground(Color.BLUE); 
         boton1.setFont(new Font("arial",Font.ITALIC,10));
         
         ActionListener oyenteDeAccion3 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        SuperClase.respuesta7 = getSelectedButtonText(grupoBotones);
        if(SuperClase.respuesta7.equals("c*a+ac*")){
            SuperClase.opc7=1;
        }else{
            SuperClase.opc7=0;
        }
        
        SuperClase.respuesta8 = getSelectedButtonText(grupoBotones0);
        if(SuperClase.respuesta8.equals("(0+1)*010(0+1)*")){
            SuperClase.opc8=1;
        }else{
            SuperClase.opc8=0;
        }
        SuperClase.total2=SuperClase.opc5+SuperClase.opc6+SuperClase.opc7+SuperClase.opc8;
        System.out.println(SuperClase.opc7);
        System.out.println(SuperClase.opc8);
        
        switch(SuperClase.total2){
            case 0: JOptionPane.showMessageDialog(null,"Repase nuevamente, obtuvo 0 aciertos de 4");
            break;
            case 1: JOptionPane.showMessageDialog(null,"Es recomendable que repase, obtuvo 1 acierto de 4");
            break;
            case 2: JOptionPane.showMessageDialog(null,"obtuvo 2 aciertos de 4");
            break;
            case 3: JOptionPane.showMessageDialog(null,"Bien, obtuvo 3 aciertos de 4");
            boton.setEnabled(true);
            break;
            case 4: JOptionPane.showMessageDialog(null,"Felicidades, obtuvo todos los ejercicios correctos");
            boton.setEnabled(true);
            break;
            default: JOptionPane.showMessageDialog(null,"");
            break;
        }
        
        }
         
     };
     boton1.addActionListener(oyenteDeAccion3);
     
     
        ActionListener oyenteDeAccion = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        Ejercicios3 b = new Ejercicios3();
        b.setVisible(true); 
        dispose();
        }
         
     };
     boton0.addActionListener(oyenteDeAccion);
     
    //Ventana siguiente 
    ActionListener sig = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Conv c = new Conv();
                dispose();
            }
    };
    
     boton.addActionListener(sig);
    }
    /*
    public static void main(String[] args){
    Ejercicios4 v1 = new Ejercicios4();
    v1.setVisible(true);

    }
*/

    
}
