package bai1;

import java.util.Scanner;

public class QuanLy {
    public Scanner sn = new Scanner(System.in);
    private String maQL;
    private String hoTen;
    public void nhap(){
        System.out.print("Nhap ma quan ly: ");
        maQL = sn.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sn.nextLine();
    }
    public void xuat(){
        System.out.println("Ma quan ly: " + maQL);
        System.out.println("Ho Ten: " + hoTen);
    }
}
