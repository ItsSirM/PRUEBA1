/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRUEBA1;

import java.time.LocalDate;

public class MovieItem extends BlockBusterItem {

    private String ESTADO;

    public MovieItem(String ESTADO, int codigo, String nombre, double precio) {
        super(codigo, nombre, precio);
        this.ESTADO = ESTADO;
    }
    
    @Override
    public double pagoRenta(int dias) {
        if (ESTADO.equals("ESTRENO") && dias > 2) {
            return getPrecio() + (dias - 2) * 50;
        } else if (ESTADO.equals("NORMAL") && dias > 5) {
            return getPrecio() + (dias - 5) * 30;
        } else {
            return getPrecio ();
        }
    }

    public void evaluarEstado() {
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.minusMonths(5).isAfter(fechaActual)) {
            ESTADO = "NORMAL";
        }
    }
}