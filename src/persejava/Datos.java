/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persejava;


/**
 *
 * @author HP15DA0023LA
 */
public class Datos {
   private Integer valores[] = new Integer[3];

    public Integer[] getValores() {
        return valores;
    }

    public void setValores(Integer valor, int posicion) {
        this.valores[posicion] = valor;
    }
   
}
