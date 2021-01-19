package TC;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Ejercicios2 extends JFrame{

    public Ejercicios2(){
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
         v.def.setBackground(new Color(93,222,244));
         this.getContentPane().add(panel); //Agregar panel a la ventana
         this.getContentPane().setBackground(new Color(229,229,229));
         panel.setBackground(new Color(229,229,229));
         panel.setBounds(330,50,700,700);
         
         JLabel etiqueta0 = new JLabel("3.-En un autómata finito no determinista no se admiten bifurcaciones");
         panel.add(etiqueta0);
         etiqueta0.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta0.setBounds(10,60,500,30);
         
         JLabel etiqueta = new JLabel("en el mismo ni transiciones indefinidas.");
         panel.add(etiqueta);
         etiqueta.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta.setBounds(10,80,500,30);
         
         JRadioButton radioBoton = new JRadioButton("Verdadero",false);
         radioBoton.setBounds(10,120,100,30);
         radioBoton.setBackground(new Color(229,229,229));
         panel.add(radioBoton);
         
         JRadioButton radioBoton0 = new JRadioButton("Falso",false);
         radioBoton0.setBounds(10,150,100,30);
         radioBoton0.setBackground(new Color(229,229,229));
         panel.add(radioBoton0);
         
         ButtonGroup grupoBotones = new ButtonGroup();
         grupoBotones.add(radioBoton);
         grupoBotones.add(radioBoton0);
         
         JLabel etiqueta3 = new JLabel("4.- Con base a su respuesta en la pregunta anterior, la función");
         panel.add(etiqueta3);
         etiqueta3.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta3.setBounds(10,220,500,30);
         
         JLabel etiqueta4 = new JLabel("de transición de estados (representada como delta) ¿Sigue siendo una función?");
         panel.add(etiqueta4);
         etiqueta4.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta4.setBounds(10,240,500,30);
         
         JRadioButton radioBoton1 = new JRadioButton("Si",false);
         radioBoton1.setBounds(10,270,50,30);
         radioBoton1.setBackground(new Color(229,229,229));
         panel.add(radioBoton1);
         
         JRadioButton radioBoton2 = new JRadioButton("No",false);
         radioBoton2.setBounds(10,300,50,30);
         radioBoton2.setBackground(new Color(229,229,229));
         panel.add(radioBoton2);
         
         ButtonGroup grupoBotones0 = new ButtonGroup();
         grupoBotones0.add(radioBoton1);
         grupoBotones0.add(radioBoton2);
         
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
         boton1.setText("Ver Calificacion");
         boton1.setBounds(150,400,150,30);
         panel.add(boton1);
         boton1.setEnabled(true); 
         boton1.setForeground(Color.BLUE); 
         boton1.setFont(new Font("arial",Font.ITALIC,10)); 
        
     ActionListener oyenteDeAccion = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            //Siguiente diagrama
            Thompson t = new Thompson();
            dispose();
        }
         
     };
     boton.addActionListener(oyenteDeAccion);
     
        ActionListener oyenteDeAccion2 = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        Ejercicios1 b = new Ejercicios1();
        b.setVisible(true); 
        dispose();
        }
         
     };
     boton0.addActionListener(oyenteDeAccion2);
     
     ActionListener oyenteDeAccion3 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        SuperClase.respuesta3 = getSelectedButtonText(grupoBotones);
        if(SuperClase.respuesta3.equals("Falso")){
            SuperClase.opc3=1;
        }else{
            SuperClase.opc3=0;
        }
        
        SuperClase.respuesta4 = getSelectedButtonText(grupoBotones0);
        if(SuperClase.respuesta4.equals("No")){
            SuperClase.opc4=1;
        }else{
            SuperClase.opc4=0;
        }
        SuperClase.total1=SuperClase.opc1+SuperClase.opc2+SuperClase.opc3+SuperClase.opc4;
        System.out.println(SuperClase.opc3);
        System.out.println(SuperClase.opc4);
        
        switch(SuperClase.total1){
            case 0: JOptionPane.showMessageDialog(null,"Repase nuevamente, obtuvo 0 aciertos de 4");
            break;
            case 1: JOptionPane.showMessageDialog(null,"Es recomendable que repase, obtuvo 1 acierto de 4");
            break;
            case 2: JOptionPane.showMessageDialog(null,"obtuvo 2 aciertos de 4");
            break;
            case 3: JOptionPane.showMessageDialog(null,"Bien, obtuvo 3 aciertos de 4");
            break;
            case 4: JOptionPane.showMessageDialog(null,"Felicidades, obtuvo todos los ejercicios correctos");
            break;
            default: JOptionPane.showMessageDialog(null,"");
            break;
        }
        
        }
         
     };
     boton1.addActionListener(oyenteDeAccion3);
         
     }
}
