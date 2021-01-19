package TC;

import java.awt.*;
import javax.swing.*;

public class HamburguerMenu {
    GraphicsEnvironment ge;
    JLabel title, mainTitle, bar, def, diag, lang, conv;
    public HamburguerMenu(Container c){
        title = new JLabel("Temario", SwingConstants.CENTER);
        title.setBounds(0, 0, 150, 50);
        title.setFont(getFont());
        c.add(title,0);
        
        mainTitle = new JLabel("Automatas Finitos",SwingConstants.CENTER);
        mainTitle.setBounds(120, 0, 1000-50, 50);
        mainTitle.setOpaque(true);
        mainTitle.setBackground(new Color(0, 172, 193));
        mainTitle.setFont(getFont());
        c.add(mainTitle);
        
        bar = new JLabel("");
        bar.setBounds(0, 0, 150, 600);
        bar.setOpaque(true);
        bar.setBackground(new Color(0, 188, 212));
        c.add(bar, 1);
        
        Font barFont = getFont().deriveFont(14f);
        
        def = new JLabel("<html>Defincion de automatas <br>"
                + "<li type=\"disc\">Deterministas<br/> "
                + "<li type=\"disc\">No Deterministas</html>", SwingConstants.CENTER);
        def.setBounds(0, 80, 150, 100);
        def.setFont(barFont);
        def.setOpaque(true);
        def.setBackground(new Color(0, 188, 212));
        c.add(def,0);
        
        diag = new JLabel("<html>Diagramas<br>"
                + "<li type=\"disc\">Thompson<br/> "
                + "<li type=\"disc\">Tabla de transiciones</html>", SwingConstants.CENTER);
        diag.setBounds(0, 180, 150, 100);
        diag.setFont(barFont);
        diag.setOpaque(true);
        diag.setBackground(new Color(0, 188, 212));
        c.add(diag,0);
        
        lang = new JLabel("<html>Lenguajes que acepta<br></html>", SwingConstants.CENTER);
        lang.setBounds(0, 280, 150, 100);
        lang.setFont(barFont);
        lang.setOpaque(true);
        lang.setBackground(new Color(0, 188, 212));
        c.add(lang,0);
        
        conv = new JLabel("<html>Conversion de AFN a AFD<br></html>", SwingConstants.CENTER);
        conv.setBounds(0, 380, 150, 100);
        conv.setFont(barFont);
        conv.setOpaque(true);
        conv.setBackground(new Color(0, 188, 212));
        c.add(conv,0);
    }
    
    public Font getFont(){
        Font fo = new Font("Arial Rounded MT Bold", Font.PLAIN,16);
        return fo;
    }
}
