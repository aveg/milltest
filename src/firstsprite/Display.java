/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsprite;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author GERHARDY
 */
public class Display extends JPanel implements ActionListener{
 
    private Timer timer;
    private Creature creature;
    private final int DELAY = 10;
    
    public Display() {

        initDisplay();
    }
    
    private void initDisplay() {
        
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);

        creature = new Creature();

        timer = new Timer(DELAY, this);
        timer.start();        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(creature.getImage(), creature.getX(), creature.getY(), this);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(checkPosition() == true)
        {
        creature.move();
        }
        repaint();  
    }
    
    private boolean checkPosition()
    {
        int actXpos;
        int actYpos;
        
        actXpos = creature.getX();
        actYpos = creature.getY();
        
        
        return true;
    }
    
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            creature.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            creature.keyPressed(e);
        }
    }
}
