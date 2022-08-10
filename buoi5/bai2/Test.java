/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author NGUYENTHIXUAN
 */
import java.util.Scanner; 
public class Test {
    static Scanner sn = new Scanner(System.in);
    static int n=0;
    static Student []a = new Student[100];
    public static boolean kiemtra(){
        if (n == 0){
            System.out.println("Mang khong ton tai, moi nhap lua chon 1.");
            return true;
        }
        return false;
    }
    public static void nhap(){
        System.out.println("Nhap so luong sinh vien: ");
        n = sn.nextInt();
        a = new Student[n]; 
        for(int i=0;i<n;i++){
            a[i] = new Student();
            System.out.println("Nhap thong tin sinh vien " + (i+1));
            a[i].input();
        }
    }
    public static void hienThi(){
        if(!kiemtra()){
            System.out.printf("%-15s%-30s%-15s%-15s%-15s%-15s","ID STUDENT","Name","Age","ID ADDRESS","District","Province");
            System.out.println();
            for(int i=0;i<n;i++){
            a[i].output();
            }
        }
    }
    public static void timkiem(){
        if(!kiemtra()){
            int id;
            System.out.print("Nhap id can tim kiem: ");
            id = sn.nextInt();
            System.out.printf("%-15s%-30s%-15s%-15s%-15s%-15s","ID STUDENT","Name","Age","ID ADDRESS","District","Province");
            System.out.println();
            for(int i=0;i<n;i++){
                if(a[i].getId()==id){
                   a[i].output();
                }
            }
        }
    }
    public static void sua(){
        if(!kiemtra()){
               for(int i=0;i<n;i++){
               if(a[i].address.province.compareTo("Thanh Hoa")==0){
                    a[i].address.province = "Hai Phong";
                }
            }
        }
    }
    public static void xoa(){
        if(!kiemtra()){
            int id;
            System.out.print("Nhap id can xoa: ");
            id = sn.nextInt();
            for(int i=0;i<n;i++){
                if(a[i].getId()==id){
                    for(int j=i+1;j<n;j++){
                        a[j-1] = a[j];
                    }
                    n--;
                    i--;
                }
            }
        }
    }
    public static void main(String[] args){
        int chon;
        do {
            System.out.println("----------------------Menu----------------------");
            System.out.println("1.Nhap mot mang n sinh vien");
            System.out.println("2.Hien thi thong tin cac sinh vien ra man hinh");
            System.out.println("3.Tim kiem sinh vien theo id va hien thi ra man hinh");
            System.out.println("4.Sua cac sinh vien co province la 'Thanh Hoa' thanh 'Hai Phong'");
            System.out.println("5.Xoa sinh vien theo Id");
            System.out.println("6.Thoát.");
            System.out.println("-------------------------------------------------");
            System.out.print("Nhap lua chon cua ban: ");
            chon = sn.nextInt();
            switch(chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    hienThi();
                    break;
                case 3:
                    timkiem();
                    break;
                case 4:
                    sua();
                    break;
                case 5:
                    xoa();
                    break;
                case 6:
                    System.out.println("Chuong trinh ket thuc");
                    break;
                default:
                    System.out.println("Lua chon cua ban khong hop le");
            }
        } while(chon!=6);
    }
}
