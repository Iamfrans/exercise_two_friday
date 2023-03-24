/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_two_friday;
import java.util.Scanner; 
/**
 *
 * @author Alumno
 */
public class Exercise_two_friday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner (System.in);
         System.out.println("Ingrese el primer valor");
         int n1 = dato.nextInt();
         System.out.println("Ingrese el segundo valor");
         int n2 = dato.nextInt();
         if (n1!=n2){
             System.out.println(n1 +"!=" +n2 );
             }
         if (n1>n2){
             System.out.println(n1 +">" +n2 );
             }
         if(n1<n2){
             System.out.println(n1 +"<" +n2 );
             }
         if(n1==n2){
             System.out.println(n1 +"=" +n2 );
             }
    }
    
}
