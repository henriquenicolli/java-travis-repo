/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediana;

import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class Mediana {
    
   // private double array[];
    
    
     public double getMediana(double[] array) throws Exception {
            if(array == null)
                throw new Exception("vetor nao pode ser nulo");
            
             if(array.length == 0)
                throw new Exception("vetor nao pode ser vazio");
             
             if(array.length == 1)
                throw new Exception("vetor nao pode ser vazio");
         
            Arrays.sort(array);         
            int tipo = array.length % 2;

            if (tipo == 1) {
                  return array[((array.length + 1) / 2) - 1];

            } else {
                  int m = array.length / 2;
                  return (array[m - 1] + array[m]) / 2;

            }

      }
     
   
}
