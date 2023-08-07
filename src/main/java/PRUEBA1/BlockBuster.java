/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRUEBA1;

import java.util.ArrayList;


public class BlockBuster {
    
    public ArrayList <BlockBusterItem> arr = new ArrayList();

    public BlockBusterItem buscarItem(int codigo, String tipo){
        for (BlockBusterItem a: arr){
           if (a.codigo==codigo&&tipo.equals("MOVIE")||tipo.equals("GAME"))
               return a;
           return null;
        }  
        return null;
    }
    

      
    public void agregarItem(int codigo, String nombre, String tipoItem){
        if(buscarItem(codigo,tipoItem)!=null){
            if(tipoItem.equals("MOVIE")){
                MovieItem mi = new MovieItem("",codigo,nombre,30.0);
                arr.add(mi);
            } else if(tipoItem.equals("GAME")){
              VideoGameItem vgi = new VideoGameItem("",codigo,nombre,30.0);
            }
        }
    }     
 
    public String rentar(int codigo, String tipoItem, int dias){
        for(BlockBusterItem bbi: arr){
            if(buscarItem(codigo,tipoItem)!=null){
                return bbi.toString();
            }
        }
        return "Item no existe";
    }

    public StringBuilder auditarMovieEstados(String tipoItem){
        return auditarMovieEstados(tipoItem,0);
    }
    
    private StringBuilder auditarMovieEstados(String tipoItem,int index){
        StringBuilder sb = new StringBuilder();;
        for(BlockBusterItem bbi: arr){
            if(bbi instanceof MovieItem)
                sb.append(bbi);
        }    
        return sb;
    }
    

}