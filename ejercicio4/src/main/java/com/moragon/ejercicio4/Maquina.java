package com.moragon.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maquina {
    private static List<Integer> votos = new ArrayList<>();
    public void procesarVoto(){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i < 4) {
            System.out.println("Elija entre:\n" +
                    "\n" +
                    "        1 - Emilia TERREROS\n" +
                    "\n" +
                    "        2 - Gerardo ESCODAR\n" +
                    "\n" +
                    "        3 - María AGUAVIVA\n" +
                    "\n" +
                    "        4 - Nadia LETUX");
            String voto = sc.next();
            switch (voto) {
                case "1":
                    votos.add(1);
                    i++;
                    break;
                case "2":
                    votos.add(2);
                    i++;
                    break;
                case "3":
                    votos.add(3);
                    i++;
                    break;
                case "4":
                    votos.add(4);
                    i++;
                    break;
                default:
                    System.out.println("Introduce un número del 1 al 4");
            }
        }
    }

    public void getResultados() {
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;
        for (int i = 0; i <votos.size(); i++) {
            if(votos.get(i)==1) {
                votos1++;
            }else if(votos.get(i)==2){
                votos2++;
            }else if(votos.get(i)==3){
                votos3++;
            }else if(votos.get(i)==4){
                votos4++;
            }
        }
        String mensaje = "Resultados:\n"
                + "Emilia TERREROS: " + (100*votos1)/4 + " %"
                + "Gerardo ESCODAR: " + (100*votos2)/4 + " %"
                + "María AGUAVIVA: " + (100*votos3)/4 + " %"
                + "Nadia LETUX: " + (100*votos4)/4 + " %";
        System.out.println(mensaje);

    }
}
/*Resultados:

Emilia TERREROS: 14,29 %

Gerardo ESCODAR: 0,00 %

María AGUAVIVA: 28,57 %

Nadia LETUX: 57,14 %
*/
