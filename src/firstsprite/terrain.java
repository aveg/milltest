/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsprite;

/**
 *
 * @author GERHARDY
 */
public class terrain {
    
    public terrain()
    {
        initTerrain();
        
    }
    
    private void initTerrain() {
        
    }

    public int getFieldInfo(int x, int y)
    {
        if( (x< 20) || (x > 580) || (y > 430) || (y < 20))
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
