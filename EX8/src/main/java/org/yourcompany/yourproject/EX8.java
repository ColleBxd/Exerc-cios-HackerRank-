/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author colle
 */
import java.util.Scanner;

public class EX8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int lineNumber = 1; 

        while (sc.hasNextLine()) { 
            String line = sc.nextLine(); 
            System.out.println(lineNumber + " " + line); 
            lineNumber++; 
        }

        sc.close(); 
    }
}