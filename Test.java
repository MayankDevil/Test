import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class Test
{
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(() -> {
        
            JFrame frame = new JFrame("Testing");
            
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            
            JLabel label = new JLabel("Welcome");
            
            JPanel top = new JPanel();
            
            top.setBackground(Color.green);
            
            top.add(label);
            
            JTextField field1 = new JTextField(30);
            
            JTextField field2 = new JTextField(30);
            
            field2.setSize(300,50);
            
            JPanel center = new JPanel();
            
            center.setBackground(Color.red);
            
            center.add(field1);
            
            center.add(field2);
            
            JPanel bottom = new JPanel();
            
            bottom.setBackground(Color.blue);
            
            frame.add(top,BorderLayout.NORTH);
            
            frame.add(center,BorderLayout.CENTER);
            
            frame.add(bottom,BorderLayout.SOUTH);
            
            frame.setSize(500,500);
            
            frame.setVisible(true);
        
        });
    }
}
/*

#155724
#d4edda
#c3e6cb

#721c24
#f8d7da
#f5c6cb

#ffffff
#0069d9
#0062cc

*/
