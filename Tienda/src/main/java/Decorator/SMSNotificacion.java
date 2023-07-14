/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author joelorrala
 */
public class SMSNotificacion extends NotificacionDecorator{

    public SMSNotificacion(Notificacion notificacion) {
        super(notificacion);
    }
    
    @Override
    public void enviarNotificacion() {
        System.out.println("Notificación SMS");
    }
}
