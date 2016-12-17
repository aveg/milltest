/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsprite;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author GERHARDY
 */
public class Creature {
    
    private int x = 300;
    private int y = 240;
    private int dx;
    private int dy;
    
    private Image image;
    
    public terrain myTerrain;
    
    public Creature()
    {
        initCreature();
    }

    private void initCreature() {
        ImageIcon ii = new ImageIcon("/Users/Michael/Jobs/firstSprite/src/firstsprite/resources/mill.png");
        image = ii.getImage();
        
        myTerrain = new terrain();
    }
    
    public Image getImage() {
        return image;
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
     public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            
            if(myTerrain.getFieldInfo((x-5), y) == 1)
            {
                dx = -1;
            }
            else
            {
                dx = 0;
            }
            
        }

        if (key == KeyEvent.VK_RIGHT) {
            
            if(myTerrain.getFieldInfo((x+5), y) == 1)
            {
                dx = 1;
            }
            else
            {
                dx = 0;
            }
        }

        if (key == KeyEvent.VK_UP) {
            
            if(myTerrain.getFieldInfo(x, (y-5)) == 1)
            {
                dy = -1;
            }
            else
            {
                dy = 0;
            }
        }

        if (key == KeyEvent.VK_DOWN) {
            
            if(myTerrain.getFieldInfo(x, (5+y)) == 1)
            {
                dy = 1;
            }
            else
            {
                dy = 0;
            }
            
        }
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
