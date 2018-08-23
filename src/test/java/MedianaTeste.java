/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.atividade06.Mediana;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class MedianaTeste {
    
    @Test
    public void MedianaTeste() {
        double[] array = {1,2,3,4};
        Mediana m = new Mediana();
        
        double res = m.getMediana(array);
        
        assertEquals(2.5, res, 2.5);
   
    }
    
}
