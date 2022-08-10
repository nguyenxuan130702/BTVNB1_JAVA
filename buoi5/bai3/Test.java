/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author NGUYENTHIXUAN
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        int a; 
        long b; 
        float c; 
        double d;
        Scanner sn = new Scanner(System.in); 
        Prime prime = new Prime(); 
        System.out.println("Nhap a: ");
        a = sn.nextInt(); 
        System.out.println("Nhap b: ");
        b = sn.nextLong(); 
        System.out.println("Nhap c: ");
        c = sn.nextFloat(); 
        System.out.println("Nhap d: ");
        d = sn.nextDouble(); 
        System.out.println("So a la so nguyen to: " + prime.isPrime(a));
        System.out.println("So b la so nguyen to: " + prime.isPrime(b));
        System.out.println("So c la so nguyen to: " + prime.isPrime(c));
        System.out.println("So d la so nguyen to: " + prime.isPrime(d));
    }
}
