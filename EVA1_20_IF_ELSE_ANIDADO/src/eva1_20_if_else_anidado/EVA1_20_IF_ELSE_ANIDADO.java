package eva1_20_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class EVA1_20_IF_ELSE_ANIDADO {

    public static void main(String[] args) {
        int dia;
        
        Scanner captu=new Scanner(System.in);
        
        System.out.println("Ingresa el dia de la semana (1 - 7)");
        dia=captu.nextInt();
        captu.nextLine();
        
        if(dia==1){
            System.out.println("Lunes");
        }else if (dia==2){
            System.out.println("Martes");
        }else if (dia==3){
            System.out.println("Miercoles");
        }else if (dia==4){
            System.out.println("Jueves");
        }else if (dia==5){
            System.out.println("Viernes");
        }else if (dia==6){
            System.out.println("Sabado");
        }else if (dia==7){
            System.out.println("Domingo");
        }else{
            System.out.println("Dia no valido");
        }
    }
    
    
}
