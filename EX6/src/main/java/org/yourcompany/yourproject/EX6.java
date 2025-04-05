/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author colle
 */
import java.util.Scanner;

class EX6{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a; 
            for(int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b; 
                System.out.print(sum + " "); 
            }
            System.out.println(); 
        }
            in.close();
        }
        
    
    }
