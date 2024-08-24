package aerolineas;

import java.util.Scanner;

public class Aerolineas {

    public static void main(String[] args) {
                int matriz [][] = new int[6][3];
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        int asientoCant = 0;
        String bandera = "";
        
        //carga de asientos
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingrese la cantidad de asientos para el destino " + i + " horario " + j );
                matriz[i][j]= teclado.nextInt();
            }
        }
        
        //ciclo de compra de boletos
        while(!bandera.equalsIgnoreCase("finish")){
            System.out.println("Ingrese su destino");
            System.out.println("0 - Rio de janeiro");
            System.out.println("1 - Cancun");
            System.out.println("2 - Madrid");
            System.out.println("3 - Roma");
            System.out.println("4 - Milan");
            System.out.println("5 - Iguazu");
            int des = teclado.nextInt();
            
            if(des >= 0 && des <= 5){
            System.out.println("Ingrese horario de vuelo");
            System.out.println("0 - Dia");
            System.out.println("1 - Tarde");
            System.out.println("2 - Noche");
            int vuelo = teclado.nextInt();
                if(vuelo >= 0 && vuelo <= 2){
                    System.out.println("Disponible hay " + matriz[des][vuelo]);
                    System.out.println("Escriba la cantidad de asientos que necesita: ");
                    asientoCant = teclado.nextInt();
                    if(matriz[des][vuelo] >= asientoCant){
                    matriz[des][vuelo] -= asientoCant;
                    }else{
                        System.out.println("Lo sentimos, no quedan asientos disponibles para este vuelo.");
                    }
                    
                }else{
                    System.out.println("Por favor, escriba un valor correcto.");
                }
            }else{
                System.out.println("El dato ingresado es incorrecto, vuelva a colocarlo.");
            }
            System.out.println("¿Desea terminar el proceso? , si es asi, Escriba la palabra finish");
            bandera = teclado2.next();
        }
    }
    
}
