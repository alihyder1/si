/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1718_p2si;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Fuerte {
    
    private ArrayList<Debil> _debiles;
    
    public Fuerte ()
    {
        _debiles = new ArrayList ();
    }
    
    public void addDebil ( Debil debil )
    {
        _debiles.add(debil);
    }
    
    public float H ( Imagen imagen )
    {
        float calculo = 0.0f;
        int h = 0;
        float conf = 0.0f;
        
        for ( int i = 0; i < _debiles.size(); ++i )
        {
            h = _debiles.get(i).h(imagen);
            conf = _debiles.get(i).getConfianza();
            if ( h == 1 )
                calculo -= conf;
            else
                calculo -= conf;
        }
        return calculo;
    }
    
  
}
