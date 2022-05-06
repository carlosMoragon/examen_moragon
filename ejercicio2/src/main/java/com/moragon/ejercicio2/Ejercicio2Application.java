package com.moragon.ejercicio2;

public class Ejercicio2Application {

    public static void main(String[] args) {
        /*PREGUNTA 2

El juego del rebaño de ovejas
El objetivo de este juego es cruzar dos rebaños de ovejas. Inicialmente, las ovejas están en la siguiente configuración:

l objetivo de este juego es cruzar dos rebaños de ovejas. Inicialmente, las ovejas están en la siguiente configuración:

🐏🐏🐏 🔩 🐑🐑🐑



El objetivo es llegar al final a la siguiente configuración:



  🐑 🐑 🐑 🔩 🐏🐏🐏

Para lograrlo, debes respetar las siguientes reglas:

Una oveja puede avanzar un paso, siempre que el espacio frente a ella esté libre.
Una oveja puede saltar sobre otra oveja yendo en la dirección opuesta, si el siguiente espacio está libre.
No hay otros movimientos disponibles.
Los datos están representados por una tabla como esta:



A continuación, se muestra un ejemplo de las visualizaciones y entradas esperadas:



A continuación, se muestra el plan de acción que se le propone realizar:

Intentar practicar (con lápiz y papel), para comprender el mecanismo del juego, dominar los diferentes movimientos posibles, así como las situaciones de bloqueo.
Buscar los subalgoritmos necesarios y determinar si son procedimientos o funciones.
Escribe el algoritmo principal, asumiendo que tiene a su disposición las funciones y procedimientos definidos previamente.
Escribir las funciones y procedimientos.*/
        String[] inicial = inicializar(new String[7]);
        for (int i = 0; i < 7; i++){
            System.out.print(inicial[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < 7; i++){
            System.out.print(moverOvejas(inicial)[i]);
        }


    }

    private static String[] inicializar(String[] vacio){
        for(int i=0; i<7; i++){
            //🐏🐏🐏 🔩 🐑🐑🐑
            if(i < 3){
                vacio[i] = "🐏";
            }else if(i > 3){
                vacio[i] = "🐑";
            }
            vacio[3]= "🔩";
        }
        return vacio;

    }
    private static String[] moverOvejas(String[] orden){
        for(int i=0; i<6; i++){
            if(orden[i].equals("🔩")&& orden[i+1].equals("🐑")){
                orden[i] = "🐑";
                orden[i+1] = "🔩";
                return moverOvejas(orden);
            }
        }
        return orden;

    }

}
