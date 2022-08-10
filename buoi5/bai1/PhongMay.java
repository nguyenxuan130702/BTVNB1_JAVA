package bai1;

import java.util.Scanner;

public class PhongMay {
    public Scanner sn = new Scanner(System.in);
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    QuanLy quanLy;
    May may;
    public void nhap(){
        System.out.print("nhap ma phong: ");
        maPhong = sn.nextLine();
        System.out.print("Nhap ten phong: ");
        tenPhong = sn.nextLine();
        System.out.print("Nhap dien tich: ");
        dienTich = sn.nextFloat();
        quanLy = new QuanLy();
        quanLy.nhap();
        may = new May();
        may.nhap();
    }
    public void xuat(){
        System.out.println("Ma phong: " + maPhong);
        System.out.println("Ten phong: " + tenPhong);
        System.out.println("Dien tich: " + dienTich);
        quanLy.xuat();
        may.xuat();
    }
}
