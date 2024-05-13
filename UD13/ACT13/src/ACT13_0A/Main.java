package ACT13_0A;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alumnat
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame miJFrame = new JFrame("Prueba");
        miJFrame.setSize(1080, 720);
        miJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(1080, 720);
        miJPanel.setLayout(null);
        
        JLabel miJLabel = new JLabel("Hola, esto es una prueba amigo");
        miJLabel.setBounds(30, 30, 200, 20);
        JButton miJButtonAceptar = new JButton("Aceptar");
        miJButtonAceptar.setBounds(30, 650, 100, 20);
        JButton miJButtonCancelar = new JButton("Cancelar");
        miJButtonCancelar.setBounds(950, 650, 100, 20);
        
        miJPanel.add(miJLabel);
        miJPanel.add(miJButtonAceptar);
        miJPanel.add(miJButtonCancelar);
        
        miJFrame.add(miJPanel);
        
        miJFrame.setVisible(true);
    }
}