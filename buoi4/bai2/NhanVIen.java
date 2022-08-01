package bai2;
import java.util.Scanner;

public class NhanVIen {
    static int maNV=1;
    private String tenNV;
    private int tuoi;
    private String diaChi;
    private String boPhan;
    public void nhap(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien: ");
        tenNV = sn.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sn.nextInt();
        System.out.println("Nhap dia chi: ");
        sn.nextLine();
        diaChi = sn.nextLine();
        System.out.println("Nhap bo phan: ");
        boPhan = sn.nextLine();
    }
    public int maNhanVien(){
        return maNV++;
    }
    public void hienThi(){
        System.out.printf("%-5d%-30s%-10d%-20s%-20s",maNhanVien(),tenNV,tuoi,diaChi,boPhan);
    }
}
