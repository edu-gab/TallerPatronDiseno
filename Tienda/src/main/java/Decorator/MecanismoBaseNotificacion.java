/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author joelorrala
 */
public class MecanismoBaseNotificacion implements Notificacion{
    
    private String mecanismo;

    public MecanismoBaseNotificacion(String mecanismo) {
        this.mecanismo = mecanismo;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Notificación Base");
    }
    
}
