package com.moragon.ejercicio4;

import java.util.Scanner;

public class Ejercicio4Application {

    public static void main(String[] args) {
        /*Máquina de votar
        Cree un algoritmo que pida a los usuarios que voten (los usuarios se turnarán para usar su máquina de votación).

        Se proponen varios candidatos. Al final del día, el presidente de la mesa de votación introduce un código especial para finalizar la votación (68753421) y se muestran los resultados. Eso sí, este ejercicio es teórico, ya que la seguridad no está garantizada y un usuario puede votar varias veces...

        Ejemplo de ejecución del algoritmo:

        Elija entre:

        1 - Emilia TERREROS

        2 - Gerardo ESCODAR

        3 - María AGUAVIVA

        4 - Nadia LETUX*/
        //codigo para acceder a resultados: 68753421
        Scanner sc = new Scanner(System.in);
        Maquina iniciar = new Maquina();
        iniciar.procesarVoto();
        boolean repetir = true;
        while (repetir){
            System.out.println("Introduce la contraseña para acceder a los resultados:");
            String codigo = sc.next();
            if(codigo.equals("68753421")){
                System.out.println("Correcto\n");
                iniciar.getResultados();
                repetir = false;
            }else{
                System.out.println("Codigo incorrecto, ¿volver a probar?");
                String repeat = sc.next();
                    if(repeat.equalsIgnoreCase("n")){
                        repetir = false;
                    }else if(repeat.equalsIgnoreCase("y")) {
                        System.out.println("suerte");
                    }else {
                        System.out.println("no te he entendido, adios");
                        repetir = false;
                    }
            }
        }
    }

}
