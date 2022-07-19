/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3btvnb1;
import java.util.Scanner; 
/**
 *
 * @author NGUYENTHIXUAN
 */
public class Bai3btvnb1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n; 
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        n = sn.nextInt(); 
        int S=0; 
        for(int i=1; i<=n;i++){
            if(n%i==0)
            {
                S += i; 
            }
        }
        System.out.println("tong cac uoc cua n la: " + S);
    }
    
}
