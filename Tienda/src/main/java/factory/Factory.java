/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import com.mycompany.tienda.Cliente;
import interfaces.Tarjeta;
import tarjetas.TarjetaBasica;
import tarjetas.TarjetaPremium;
import tarjetas.TarjetaVIP;

/**
 *
 * @author edu-g
 */
public class Factory {
    
    public Tarjeta crearTarjeta(Cliente cliente){
        
        if(cliente.getSueldo() <= 100){
            return new TarjetaBasica();
        }
        else if(cliente.getSueldo() <= 300){          
            return new TarjetaPremium();
        }
        else if(cliente.getSueldo() > 300 ){
            return new TarjetaVIP();
        }
        else{
            return null;
        }
    } 
}
