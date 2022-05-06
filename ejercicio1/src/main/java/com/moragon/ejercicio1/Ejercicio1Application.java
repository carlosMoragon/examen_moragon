package com.moragon.ejercicio1;


import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Ejercicio1Application {

    public static void main(String[] args) {
        /*Una tabla y funciones
        Escriba una función que cree una tabla que tenga una dimensión de diez números enteros e inicialice aleatoriamente los valores de esta tabla, con valores entre un límite mínimo y un límite máximo, que se pasan como argumentos.
        Cree una función que devuelva el mayor valor de una tabla (esta tabla no tiene necesariamente diez celdas, etc.).
                Escriba un algoritmo que llame a estas dos funciones.*/
        System.out.println(mayorNumero(devolverTabla()));

    }

    private static int @NotNull [][] devolverTabla(){
        int[][] tabla = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for(int j=0; j<10;j++) {
                tabla[i][j] = (int) (Math.random() * 10);
                //System.out.println(tabla[i]);
            }
        }
        return tabla;
    }
    @Contract(pure = true)
    private static int mayorNumero(int @NotNull [][] tabla){
        int mayor = 0;
        for (int i = 0; i < 10; i++) {
            for(int j=0; j<10;j++) {
                if(tabla[i][j] > mayor){
                    mayor =tabla[i][j];
                }
            }
        }
        return mayor;
    }
}


