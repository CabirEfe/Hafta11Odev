/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class KareToplamıMetot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Kaça Kadar Toplanacağını Giriniz: ");
        int kare = input.nextInt();
        
        karetoplam(kare);
    }
    public static void karetoplam(int a){
     int toplam = 0;
        for (int i = 1; i < a; i++) 
        {
         toplam += i * i;    
        }
        System.out.println("Sonuç: " + toplam);
    }
}
