/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase02;

/**
 *
 * @author LAB-USR-LCENTRO
 */
public class EjemploMaximo {
    public static void main(String[] args) {
        int[] numeros = {8,3,5,1,9};
        int mayor = numeros[0];
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
    }
}
