package com.upchiapas.examen;

import java.util.Scanner;
import java.util.Stack;

public class Condicion {

    Scanner teclado = new Scanner(System.in);
    String auxiliarpila1="";
    String auxiliarpila2="";

    public void CapturaDatos(){
        System.out.println("Ingrese la expresion: ");
        String expresion = teclado.next();

        Stack <Character> pila1 = new Stack<Character>();
        Stack <Character> pila2 = new Stack<Character>();

        for ( int i=0; i<expresion.length();i++){
            if(expresion.charAt(i) == '+' || expresion.charAt(i) == '-' || expresion.charAt(i) == '/' || expresion.charAt(i) == '*' ){
                pila1.push(expresion.charAt(i));

            }else {
                pila2.push(expresion.charAt(i));
            }

        }
        while (!pila1.isEmpty()){
            auxiliarpila1 = auxiliarpila1 + pila1.pop();
        }

        while (!pila2.isEmpty()){
            auxiliarpila2 = auxiliarpila2 + pila2.pop();
        }
        System.out.println(" ");
        System.out.println("El orden de la pila es: "+auxiliarpila1+auxiliarpila2);
    }

}
