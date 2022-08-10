package bai1;

import java.util.Scanner;

public class May {
    public Scanner sn = new Scanner(System.in);
    private String maMay;
    private String kieuMay;
    private String tinhTrang;
    public void nhap(){
        System.out.print("Nhap ma may: ");
        maMay = sn.nextLine();
        System.out.print("Nhap kieu may: ");
        kieuMay = sn.nextLine();
        System.out.print("Nhap tinh trang: ");
        tinhTrang = sn.nextLine();
    }
    public void xuat(){
        System.out.println("Ma may: " + maMay);
        System.out.println("Kieu may: " + kieuMay);
        System.out.println("Tinh trang: " + tinhTrang);
    }
}
