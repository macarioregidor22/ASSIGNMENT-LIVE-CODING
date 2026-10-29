/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

/**
 *
 * @author REGIDOR_CPE113
 */
public class ASSIGNMENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    int rio = oddoreven(20);
        System.out.println(rio);
    }
    static int oddoreven(int rio){
        int status;
        if (rio % 2 == 0){
            status = 1;
        }else{
            status = 0;
        }
        return status;
    }
    
}
    

