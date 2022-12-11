/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.yazmuhoryantodevi6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class YazMuhOryantOdevi6 {

    public static void main(String[] args){	
     Scanner in = new Scanner(System.in);
     System.out.print("\nInput a word: ");
	 String word = in.nextLine();
	 word = word.trim();
	 String result = ""; 
     char[] ch=word.toCharArray();  
	 for (int i = ch.length - 1; i >= 0; i--) {
			 result += ch[i];
		 }
	 System.out.println("Reverse word: "+result.trim()); 
	 }			
}