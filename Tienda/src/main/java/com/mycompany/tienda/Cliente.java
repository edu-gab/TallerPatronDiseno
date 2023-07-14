/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

import interfaces.Tarjeta;

/**
 *
 * @author edu-g
 */
public class Cliente {
    
    private String name;
    private int edad;
    private String direccion;
    private int sueldo;
    private String numeroTelefono;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Cliente(String name, int edad, String direccion, int sueldo) {
        this.name = name;
        this.edad = edad;
        this.direccion = direccion;
        this.sueldo = sueldo;
    }

    
    
    
    
}
