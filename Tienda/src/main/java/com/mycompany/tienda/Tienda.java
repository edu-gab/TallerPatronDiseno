/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tienda;
import factory.Factory;
import interfaces.Tarjeta;
/**
 *
 * @author edu-g
 */
public class Tienda {

    public static void main(String[] args) {
       
        Factory fabrica = new Factory();
        
        Cliente cliente1 = new Cliente("Eduardo", 21, "Metropolis", 500);
        
        Tarjeta tarjeta = fabrica.crearTarjeta(cliente1);
        tarjeta.consultarCredito();
        tarjeta.pagar();
    }
    
}
