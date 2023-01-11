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
public class BoyutluDiziMetot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Sayır Sayısını Giriniz: ");
        int st = input.nextInt();
        System.out.println("Lütfen Sütun Sayısını Giriniz: ");
        int sü = input.nextInt();
        
        int[][] birinci = new int[st][sü];
        int[][] ikinci = new int[st][sü];
        int[][] üçüncü = new int[st][sü];
        
        for (int i = 0; i < st; i++) {
            for (int j = 0; j < sü; j++) {
             System.out.println("Lütfen 1. Matrisin " + (i + 1) + ". Satırdaki ve " + (j + 1) + ". Sütundaki Elemanı Giriniz. ");
             birinci[i][j] = input.nextInt();
             System.out.println("Lütfen 2. Matrisin " + (i + 1) + ". Satırdaki ve " + (j + 1) + ". Sütundaki Elemanı Giriniz. ");
             ikinci[i][j] = input.nextInt();
            }
            
            toplam(st,sü,birinci,ikinci,üçüncü);
        }
    }
    public static int[][] toplam(int a ,int c,int[][] d,int[][] e ,int[][] topla){
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < c; j++) {
                 topla[i][j] = d[i][j] + e[i][j];
            }
        }
            
        return topla;
    }
}
