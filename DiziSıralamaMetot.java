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
public class DiziSıralamaMetot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Dizinin Uzunluğunu Giriniz: ");
        int uzunluk = input.nextInt();
        
        int[] sayiler = new int[uzunluk];
        
        for (int i = 0; i < sayiler.length; i++) {
            System.out.println("Lütfen " + (i + 1) + ". Elemanı Giriniz.");
            sayiler[i] = input.nextInt();
        }
    }
    public static int[] dizi(int[] sıralama){
     int sıra = sıralama[0];
        for (int i = 0; i < 10; i++) {
            
        }
        return sıralama;
    }
}
