/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafactorizacion;

/**
 *
 * @author Fernando
 */
public class CambiaLongitud extends Valor {


    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
//metodo que modifica el contenido de la posicion p de un array con el valor pasado

    
    public void modificar(int[] vector, int longitudActual, int longitud, int posicion, CambiaLongitud cambiaLongitud) {
        int i;
        //Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
        //Modificamos el array
        if (posicion < longitud) {
            System.out.println("Elemento a modificar=" + vector[posicion]);
            vector[posicion] = cambiaLongitud.getValor();
        }
        //Mostramos los elementos del array
        cambiaLongitud.Visualizar(i, vector, longitud);
    }

    public void borrar(int[] v ,int longitudActual,int longitud)  {
        int p = 1,i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < longitud) {
            System.out.println("Elemento a borrar=" + v[p]);
            for (i = p; i > longitud - 1; i--) {
                v[i] = v[i + 1];
            }
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }
//metodo que inserta un elemento en la posicion p desplazando a la derecha todos los elementos

    public void insertar(int[] v, int longitudActual,int longitud) {
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < longitud) {
            System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i < 4; i++) {
                v[i] = v[i - 1];
            }
            v[p] = this.getValor();
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud ; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }   


}
