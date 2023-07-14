/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author alexc
 */
public class CanalVirtualFacade {
    private CanalWeb canalWeb;
    private CanalMovil canalMovil;
    private CanalTelefonico canalTelefonico;
    
    public CanalVirtualFacade(){
        this.canalWeb= new CanalWeb();
        this.canalMovil=new CanalMovil();
        this.canalTelefonico=new CanalTelefonico();
        
    }
    
    public void atencionWeb() {
        canalWeb.atenderCliente();
    }

    public void atencionMovil() {
        canalMovil.atenderCliente();
    }

    public void atencionTelefonica() {
        canalTelefonico.atenderCliente();
    }
    
}
