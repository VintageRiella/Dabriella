/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nigerianflag;

/**
 *
 * @author USER
 */
public class NigerianFlag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Single Loop Nigerian Flag:");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) System.out.println("GREEN  GREEN");
            else System.out.println("WHITE  WHITE");
        }
        System.out.println("\nNested Loop Nigerian Flag:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) System.out.print("WHITE  WHITE  ");
                else System.out.print("GREEN  GREEN  ");
            }
            System.out.println();
        }
    }
}
    
    
    

