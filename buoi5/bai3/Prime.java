/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author NGUYENTHIXUAN
 */
public class Prime {
    public boolean isPrime(int n){
        if(n<2){
            return false; 
        }
        else if(n==2){
            return true; 
        }
        else {
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    return false; 
                }
            }
            return true; 
        }
    }
    public boolean isPrime(long n){
        if(n<=3){
            return n > 1; 
        }
        else if(n%2==0 && n%3==0){
            return false; 
        }
        int i = 5; 
        while(i*i<=n){
            if(n%i==0 || n%(i+1)==0){
                return false; 
            }
            i = i+6; 
        }
        return true; 
    }
    public boolean isPrime(float n){
        if(n == (int)n){
            return isPrime(n); 
        }
        else {
            return false; 
        }
    }
    public boolean isPrime(double n){
        if(n==(long)n){
            return isPrime(n); 
        }
        else {
            return false; 
        }
    }
}
