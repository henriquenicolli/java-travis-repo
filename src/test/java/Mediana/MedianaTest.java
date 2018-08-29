package Mediana;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class MedianaTest {
    
    @Test
    public void MedianaTeste() throws Exception {
        double[] array = {1,2,3,4};
        Mediana m = new Mediana();
        
        double res = m.getMediana(array);
        
        assertEquals(2.5, res, 2.5);
   
    }
    
    @Test
    public void MedianaTeste2() throws Exception {
        double[] array = {1,2,3,4};
        Mediana m = new Mediana();
        
        double res = m.getMediana(array);
        
        assertEquals(2.5, res, 2.5);
   
    }
    
    @Test
    public void MedianaTeste3() throws Exception {
        double[] array = {1,2,3,4,5,6};
        Mediana m = new Mediana();
        
        double res = m.getMediana(array);
        
        assertEquals(3.5, res, 2.5);
   
    }
    
    @Test(expected = Exception.class)
    public void testaArrayNulo() throws Exception{
        double[] array = null;
        
        Mediana m = new Mediana();
        
        double res = m.getMediana(array);
        
       
    }
    
    @Test(expected = Exception.class)
    public void testaArrayVazio() throws Exception{
        double[] array = {};
        
        Mediana m = new Mediana();
        
        double res = m.getMediana(array);
        
       
    }
    
}
