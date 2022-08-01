package bai1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        HinhChuNhat a = new HinhChuNhat();
        HinhChuNhat b = new HinhChuNhat();
        System.out.println("NHAP THONG TIN HCN A: ");
        a.nhap();
        Scanner sn = new Scanner(System.in);
        System.out.println("NHAP THONG TIN HCN B: ");
        System.out.print("Nhap chieu dai: ");
        b.setChieuDai(sn.nextFloat());
        System.out.print("Nhap chieu rong: ");
        b.setChieuRong(sn.nextFloat());
        System.out.println("Thong tin hcn a: ");
        a.hienThi();
        System.out.println("Thong tin hcn b: ");
        System.out.println("Chieu dai hcn: " + b.getChieuDai());
        System.out.println("Chieu rong hcn: " + b.getChieuRong());
        System.out.println("Chu vi hcn: " + b.chuVi());
        System.out.println("Dien tich hcn: " + b.dienTich());
        if(a.dienTich() > b.dienTich()){
            System.out.println("Dien tich cua hinh a lơn hon hinh b: " + a.dienTich());
        }
        else {
            System.out.println("Dien tich cua hinh b lon hon hinh a: " + b.dienTich());
        }
    }
}
