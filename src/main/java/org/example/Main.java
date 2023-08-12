package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        Integer contadorBueno=0;
        Integer contadorMalo=0;
        String contraseña;
        Integer numeroContraseñas;
        Integer contadorIntentos=0;

        System.out.print("digita el numeor de contraseñas que vas a ingresar: ");
        numeroContraseñas=teclado.nextInt();

        do {
            contadorIntentos=contadorIntentos+1;
            System.out.println("digita la contraseña");
            contraseña=teclado.next();
            Integer contadorLetras=contraseña.length();

            if (contadorLetras>=8){
                contadorBueno=contadorBueno+1;

            }else{
                contadorMalo=contadorMalo+1;
            }



        }while (contadorIntentos<numeroContraseñas);

        System.out.println("el numero de buenos fue: "+contadorBueno);
        System.out.println("el numero de malos fue: "+contadorMalo);





    }
}