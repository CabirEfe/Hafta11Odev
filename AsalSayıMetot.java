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
public class AsalSayıMetot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz: ");
        int sayi = input.nextInt();
        asalsayı(sayi);
    }
    public static void asalsayı(int a){
     int kontrol = 0;
        for (int i = 2;  i < a; i++) 
        {
         if(a % i == 0){
          kontrol++;
         }    
        }
        if(kontrol == 0){
          System.out.println("Girdiğiniz Sayı Bir Asal Sayıdır.");
        }
        else{
          System.out.println("Girdiğiniz Sayı Bir Asal Sayı Değildir.");
        }
    }
}
