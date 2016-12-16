/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsprite;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Michael
 */
public class FirstSprite extends JFrame{

    public FirstSprite() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Display());
        
        setSize(640, 480);
        setResizable(false);
        
        setTitle("Basic Display");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // TODO code application logic here
         EventQueue.invokeLater(() -> {
             FirstSprite ex = new FirstSprite();
             ex.setVisible(true);
         });
    }
    
}
