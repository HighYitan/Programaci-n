package ACT13_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alumnat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame miJFrame = new JFrame("Suma y Resta");
        miJFrame.setSize(1080, 720);
        miJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(1080, 720);
        miJPanel.setLayout(null);
        
        JTextField text1 = new JTextField("0", 20);
        text1.setBounds(10, 10, 120, 20);
        JTextField text2 = new JTextField("0", 20);
        text2.setBounds(140, 10, 120, 20);
        
        JButton miJButtonSuma = new JButton("Sumar");
        miJButtonSuma.setBounds(10, 100, 120, 20);
        JButton miJButtonResta = new JButton("Restar");
        miJButtonResta.setBounds(140, 100, 120, 20);
        
        JLabel miJLabel = new JLabel("");
        miJLabel.setBounds(10, 200, 250, 20);
        miJButtonSuma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int resultado = Integer.parseInt(text1.getText()) + Integer.parseInt(text2.getText());
                miJLabel.setText("El resultado de la operación es: " + resultado);
                //miJPanel.revalidate();
                miJPanel.repaint();
            }
        });
        miJButtonResta.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
                int resultado = Integer.parseInt(text1.getText()) - Integer.parseInt(text2.getText());
                miJLabel.setText("El resultado de la operación es: " + resultado);
                //miJPanel.revalidate();
                miJPanel.repaint();
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        
        miJPanel.add(text1);
        miJPanel.add(text2);
        miJPanel.add(miJButtonSuma);
        miJPanel.add(miJButtonResta);
        miJPanel.add(miJLabel);
        
        miJFrame.add(miJPanel);
        
        miJFrame.setVisible(true);
    }   
}