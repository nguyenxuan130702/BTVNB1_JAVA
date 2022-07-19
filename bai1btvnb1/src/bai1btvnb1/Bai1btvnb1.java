/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1btvnb1;

/**
 *
 * @author NGUYENTHIXUAN
 */
import java.util.Scanner; 
public class Bai1btvnb1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ngay, thang, nam; 
        Scanner sn = new Scanner(System.in); 
        System.out.print("Nhap ngay sinh: ");
        ngay = sn.nextInt(); 
        System.out.print("Nhap thang sinh: ");
        thang = sn.nextInt(); 
        System.out.print("Nhap nam sinh: ");
        nam = sn.nextInt(); 
        if(thang ==1 || thang ==2)
        {
            if(thang==1 && ngay>=20){
                System.out.println("cung bao binh");
            }
            else if(thang ==1 && ngay<=19)
            {
                System.out.println("cung ma ket");
            }
            else if(thang==2 && ngay<=18){
                System.out.println("cung bao binh");
            }
            else {
                System.out.println("cung song ngu");
            }
        }
        else if(thang==3 || thang==4)
        {
            if(thang==3 && ngay<=20){
                System.out.println("cung song ngu");
            }
            else if(thang==3 && ngay>=21){
                System.out.println("cung bach duong");
            }
            else if(thang==4 && ngay<=20){
                System.out.println("cung bach duong");
            }
            else {
                System.out.println("cung kim nguu");
            }
        }
        else if(thang==5 ||thang==6)
        {
            if(thang==5 && ngay<=20){
                System.out.println("cung kim nguu");
            }
            else if(thang==5 && ngay>=21){
                System.out.println("cung song tu");
            }
            else if(thang==6 && ngay<=21){
                System.out.println("cung song tu");
            }
            else {
                System.out.println("cung cu giai");
            }
        }
        else if(thang==7 || thang==8){
            if(thang==7 && ngay<=22){
                System.out.println("cung cu giai");
            }
            else if(thang==7 && ngay>=23){
                System.out.println("cung su tu");
            }
            else if(thang==8 && ngay<=22){
                System.out.println("cung su tu");
            }
            else {
                System.out.println("cung xu nu");
            }
        }
        else if(thang==9 || thang==10){
            if(thang==9 && ngay<=22){
                System.out.println("cung xu nu");
            }
            else if(thang==9 && ngay>=23){
                System.out.println("cung thien binh");
            }
            else if(thang==10 && ngay<=23){
                System.out.println("cung thien binh");
            }
            else {
                System.out.println("cung bo cap");
            }
        }
        else {
            if(thang==11 && ngay<=22){
                System.out.println("cung bo cap");
            }
            else if(thang==11 && ngay>=23){
                System.out.println("cung nhan ma");
            }
            else if(thang==12 && ngay<=21){
                System.out.println("cung nhan ma");
            }
            else {
                System.out.println("cung ma ket");
            }
        }
    }
    
}
