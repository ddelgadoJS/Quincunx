import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controller {
    public static void validateData(String tempRows){
        if (tempRows.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: ingrese las filas (2-20).");
        }
        else{            
            if(tempRows.matches("[a-zA-Z]+")) JOptionPane.showMessageDialog(null, "Error: ingrese sólo números.");
            else{            
                Main.finalRows = Integer.parseInt(tempRows);
                if ((Main.finalRows >= 2) && (Main.finalRows <= 20)){
                    QuincunxJFrame quincunx = new QuincunxJFrame();
                    quincunx.setVisible(true);
                    quincunx.setResizable(false); // Window can't be resized.
                    quincunx.setLocationRelativeTo(null); // Window appear in the center.
                    quincunx.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error: las filas deben estar entre 2 y 20.");
                }
            }
        }
    }    
}
