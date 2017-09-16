/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debinarioadecimal;

import java.util.Scanner;

/**
 *
 * @author DINA
 */
public class DeBinarioaDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("ingrese el numero decimal");
        int decimal = leer.nextInt();//almacena el numero decimal
        int aux = decimal;// toma el numero decimal
        String binario = "";// almacena el numero binario
        
        while (aux > 0){//mientras que aux sea mayor que cero se repite las operaciones
        binario = aux % 2 + binario;//asignacion de 1 y 0
        
        aux /= 2;//se divide el numero decimal entre 2
        }
        System.out.println("decimal " + decimal + "binario" + binario);
        
    }
    
}
