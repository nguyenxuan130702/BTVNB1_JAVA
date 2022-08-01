package bai2;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        int n;
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap so nhan vien: ");
        n = sn.nextInt();
        NhanVIen []a = new NhanVIen[n];
        for(int i=0;i<n;i++){
            a[i] = new NhanVIen();
            System.out.println("Nhap thong tin nhan vien " + (i+1));
            a[i].nhap();
        }
        System.out.printf("%50s","THONG TIN NHAN VIEN VUA NHAP");
        System.out.println();
        System.out.printf("%-5s%-30s%-10s%-20s%-20s","MaNV","Tennv","Tuoi","DiaChi","BoPhan");
        System.out.println();
        for(int i=0;i<n;i++){
            a[i].hienThi();
            System.out.println();
        }
    }
}
