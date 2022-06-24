/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refa;

/**
 *
 * @author Francisco
 */
public class Prueba {


        public int valor;
//metodo que modifica el contenido de la posicion p de un array con el valor pasado

        public void modificar(int[] vector) {
            int i;
            int posicion = 1;
//Mostramos los elementos del array
            System.out.print("v={");
            for (i = 0; i < vector.length; i++) {
                System.out.print(vector[i] + ",");
            }
            System.out.println("}");
//Modificamos el array
            if (posicion < vector.length) {
                Modifica(vector, posicion);
            }
//Mostramos los elementos del array
            System.out.print("v={");
            for (i = 0; i < vector.length; i++) {
                System.out.print(vector[i] + ",");
            }
            System.out.println("}");
        }
//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos

        public void borrar(int[] v) {
            int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
            System.out.print("v={");
            for (i = 0; i < v.length; i++) {
                System.out.print(v[i] + ",");
            }
            System.out.println("}");
//Borramos el elemento
            if (p < v.length) {
                Borra(v, p, i);
            }
//Mostramos los elementos del array
            System.out.print("v={");
            for (i = 0; i < v.length; i++) {
                System.out.print(v[i] + ",");
            }
            System.out.println("}");
        }
//metodo que inserta un elemento en la posicion p desplazando a la derecha todos los
//elementos

        public void insertar(int[] v) {
            int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
            System.out.print("v={");
            for (i = 0; i < v.length; i++) {
                System.out.print(v[i] + ",");
            }
            System.out.println("}");
//Borramos el elemento
            if (p < v.length) {
                Inserta(i, v, p);
            }
//Mostramos los elementos del array
            System.out.print("v={");
            for (i = 0; i < v.length; i++) {
                System.out.print(v[i] + ",");
            }
            System.out.println("}");
        }

        void Borra(int[] v, int p, int i) {
            System.out.println("Elemento a borrar=" + v[p]);
            for (i = p; i < v.length - 1; i--) {
                v[i] = v[i + 1];
            }
        }

        void Inserta(int i, int[] v, int p) {
            System.out.println("Elemento a insertar=" + this.valor);
            for (i = v.length - 1; i > p; i++) {
                v[i] = v[i - 1];
            }
            v[p] = this.valor;
        }

        void Modifica(int[] v, int p) {
//mostramos su contenido
            System.out.println("Elemento a modificar=" + v[p]);
            v[p] = this.valor;
        }
    
}
