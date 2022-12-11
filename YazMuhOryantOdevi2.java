/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.yazmuhoryantodevi2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class YazMuhOryantOdevi2 {
	public static void main(String[] args) {
		System.out.println("Input the value of n: ");
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                while (n != 1) {
                    if (n % 2 == 0) {
                        n = n / 2;
                    }
                    else {
                        n = (3 * n + 1) / 2;
                    }
                }
                System.out.println("\nValue of n = "+n);
            }
	}
}
