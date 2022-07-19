/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2btvnb1;
import java.util.Scanner; 
/**
 *
 * @author NGUYENTHIXUAN
 */
public class Bai2btvnb1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c; 
        Scanner sn = new Scanner(System.in); 
        System.out.print("Nhap canh thu 1: ");
        a = sn.nextInt(); 
        System.out.print("Nhap canh thu 2: ");
        b = sn.nextInt(); 
        System.out.print("Nhap canh thu 3: ");
        c = sn.nextInt(); 
        if(a+b > c || a+c>b || b+c>a)
        {
            if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
            {
                if(a==b || b==c || c==a)
                {
                    System.out.println("3 canh tao thanh 1 tam giac vuong can");
                }
                else 
                {
                    System.out.println("3 canh tao thanh 1 tam giac vuong");
                }
            }
            else if(a==b && b==c)
            {
                System.out.println("3 canh tao thanh 1 tam giac deu");
            }
            else if(a==b && b!=c || a==c && b!=c || b==c && a!=b)
            {
                System.out.println("3 canh tao thanh 1 tam giac can");
            }
            else 
            {
                System.out.println("3 canh tao thanh 1 tam giac thuong");
            }
        }
        else 
        {
            System.out.println("3 canh khong tao thanh 1 tam giac");
        }
    }
    
}
