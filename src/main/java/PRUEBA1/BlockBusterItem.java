/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRUEBA1;

import java.util.Calendar;

/**
 *
 * @author AdminColeexz
 */
public abstract class BlockBusterItem {
    int codigo;
    String nombre;
    double precio;
    int fecha;

    public BlockBusterItem(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        fecha = Integer.valueOf(Calendar.DATE);
    }
    
    public String toString(){
        return "codigo: "+codigo+" nombre: "+nombre+ " fecha: "+fecha;
    }
    
    abstract double pagoRenta(int dias);

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
}