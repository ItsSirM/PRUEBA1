/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRUEBA1;

public class VideoGameItem extends BlockBusterItem{
    String nombreconsola;
    
    public static final String ps="playstation",xbox="XBOX",wii="WII";

    public VideoGameItem(String nombreconsola, int codigo, String nombre, double precio) {
        super(codigo, nombre, precio);
        precio=30;
        this.nombreconsola=nombreconsola;
    }
    
   public String toString(){
       super.toString();
       return "consola: "+nombreconsola+" game";
   }
    
    public double pagoRenta(int dias){
        return fecha*precio;
    }
    
}