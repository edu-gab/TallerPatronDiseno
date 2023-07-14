/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author joelorrala
 */
public class CorreoNotificacion extends NotificacionDecorator{

    public CorreoNotificacion(Notificacion notificacion) {
        super(notificacion);
    }
    
    @Override
    public void enviarNotificacion() {
        System.out.println("Notificación a correo");
    }
}
