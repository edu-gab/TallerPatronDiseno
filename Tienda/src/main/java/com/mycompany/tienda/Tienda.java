/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tienda;
import Decorator.CorreoNotificacion;
import Decorator.MecanismoBaseNotificacion;
import Decorator.Notificacion;
import Decorator.SMSNotificacion;
import Facade.CanalVirtualFacade;
import factory.Factory;
import interfaces.Tarjeta;
import java.util.Scanner;
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
        
        CanalVirtualFacade canal=new CanalVirtualFacade();
        System.out.println("Seleccione el canal de atención:");
        System.out.println("1. Web");
        System.out.println("2. Móvil");
        System.out.println("3. Telefónico");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        sc.nextLine();
        if (opcion==1){
            canal.atencionMovil();
        }else if (opcion == 2) {
            canal.atencionTelefonica();
        } else if (opcion == 3) {
            canal.atencionWeb();
        } else {
            System.out.println("Opción no válida");
        }
        
        Notificacion newNoti = new MecanismoBaseNotificacion("notifica");
        newNoti.enviarNotificacion();
        
        newNoti = new CorreoNotificacion(newNoti);
        newNoti.enviarNotificacion();
        
        newNoti = new SMSNotificacion(newNoti);
        newNoti.enviarNotificacion();
    }
    
}
