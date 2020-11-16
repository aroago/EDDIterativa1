/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.edditerativa1;

import java.util.Scanner;

/**
 *it contains a interative code.
 * @author aroago
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
	
	int n;
	System.out.print("Intoduce un numero del 1 al 5 : ");
	n=teclado.nextInt();
	
	while (n<=0 || n>5){
		System.out.print("Error en la entrada");
		System.out.print("Introduzca numero del 1 al 5: ");
		n=teclado.nextInt();
	}
	
	for (int i=1; i <= n;i++ ){
		System.out.println("Hola mundo");
	}
    }
    
}
