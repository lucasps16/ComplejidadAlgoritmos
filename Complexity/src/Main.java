/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    
    
    //O(1) -- Constante
    public static void function1(){
        System.out.println("Hola");
    }
    
    
    //O(n) -- Linear
    public static void function2(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Hola");
        }
    }
    
    //O(log n) -- Logaritmica
    public static void function3(int n){
        for (int i = 0; i < n; i*=i) {
            System.out.println("Hola");
        }
    }
    
    
    //O(n^2) -- Cuadratica
    public static void function4(int n){
        for (int i = 0; i < n; i+=1) {//Se ejecuta n veces
            for (int j = 0; j < n; j+=1) {  //Se ejecuta n veces
                System.out.println("Hola"); //Se ejecuta n*n veces
            }
            
        }
    }
    
    
    // T(n) = 2^n -- Exponencial
    public static void hanoi(int n, int origen, int destino, int aux){
        if(n == 1){
            System.out.println("Mover disco de " + origen +" a " + destino);
        } else {
            hanoi(n-1, origen,destino,aux);
            System.out.println("Mover disco de " + origen + " a " + destino);
            hanoi(n-1,origen, destino, aux);
        }
    }
    
    //k=1  f(n)= f(n/2) + 2
    //k=2  f(n)= f(n/4) + 2 + 2
    //k=3  f(n)= f(n/8) + 2 + 2 + 2
    //---
    //k=i  f(n)= f(n/2^i) + 2i
    //
    //Caso Base
    // f(1)= 1
    // O(log_2(n)) -- Logaritmica
    public static void functionLog(int n){
        if(n <= 1){
            System.out.println("Caso base");
        }
        functionLog(n/2);
    }
    
   
            
        
}
