package TC;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.util.Enumeration; 
import javax.swing.AbstractButton; 

public class Ejercicios1 extends JFrame {
    
    public Ejercicios1(){
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
         
         
         
         JLabel etiqueta = new JLabel("Ejercicios: Responda correctamente los siguientes ejercicios");
         panel.add(etiqueta);
         etiqueta.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta.setBounds(10,40,500,30);
         
         JLabel etiqueta0 = new JLabel("1.-Un autómata finito determinista está definido como un conjunto de estados");
         panel.add(etiqueta0);
         etiqueta0.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta0.setBounds(10,60,500,30);
         
         JLabel etiqueta2 = new JLabel("finitos, una función de transición de estados, un alfabeto de entrada…");
         panel.add(etiqueta2);
         etiqueta2.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta2.setBounds(10,80,500,30);
         
         JRadioButton radioBoton = new JRadioButton("Un estado inicial",false);
         radioBoton.setBounds(10,120,150,30);
         radioBoton.setBackground(new Color(229,229,229));
         panel.add(radioBoton);
         
         JRadioButton radioBoton0 = new JRadioButton("Un subconjunto de estados de aceptacion",false);
         radioBoton0.setBounds(10,150,270,30);
         radioBoton0.setBackground(new Color(229,229,229));
         panel.add(radioBoton0);
         
         JRadioButton radioBoton1 = new JRadioButton("Ambas son correctas",false);
         radioBoton1.setBounds(10,180,150,30);
         radioBoton1.setBackground(new Color(229,229,229));
         panel.add(radioBoton1);
         
         ButtonGroup grupoBotones = new ButtonGroup();
         grupoBotones.add(radioBoton);
         grupoBotones.add(radioBoton0);
         grupoBotones.add(radioBoton1);
         
         JLabel etiqueta3 = new JLabel("2.- ¿Qué se forma al obtener los elementos de la pregunta anterior?");
         panel.add(etiqueta3);
         etiqueta3.setFont(new Font("arial black",Font.PLAIN,10));
         etiqueta3.setBounds(10,220,500,30);
         
         JRadioButton radioBoton2 = new JRadioButton("Una tupla",false);
         radioBoton2.setBounds(10,250,150,30);
         radioBoton2.setBackground(new Color(229,229,229));
         panel.add(radioBoton2);
         
         JRadioButton radioBoton3 = new JRadioButton("Un conjunto de estados",false);
         radioBoton3.setBounds(10,280,200,30);
         radioBoton3.setBackground(new Color(229,229,229));
         panel.add(radioBoton3);
         
         JRadioButton radioBoton4 = new JRadioButton("Un alfabeto de entrada",false);
         radioBoton4.setBounds(10,310,200,30);
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
         
           
     ActionListener oyenteDeAccion3 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        SuperClase.respuesta1 = getSelectedButtonText(grupoBotones);
        if(SuperClase.respuesta1.equals("Ambas son correctas")){
            SuperClase.opc1=1;
        }else{
            SuperClase.opc1=0;
        }
        
        SuperClase.respuesta2 = getSelectedButtonText(grupoBotones0);
        if(SuperClase.respuesta2.equals("Una tupla")){
            SuperClase.opc2=1;
        }else{
            SuperClase.opc2=0;
        }
        System.out.println(SuperClase.opc1);
        System.out.println(SuperClase.opc2);
        
        JOptionPane.showMessageDialog(null,"Respuestas Guardadas");
        }
         
     };
     boton1.addActionListener(oyenteDeAccion3);
        
     
         ActionListener oyenteDeAccion = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        Ejercicios2 a = new Ejercicios2();
        a.setVisible(true); 
        dispose();
        }
         
     };
     boton.addActionListener(oyenteDeAccion);
     
        ActionListener oyenteDeAccion2 = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        DefinicionAFN b = new DefinicionAFN();
        b.setVisible(true); 
        dispose();
        }
         
     };
     boton0.addActionListener(oyenteDeAccion2);
     }
    }
         

    

    
