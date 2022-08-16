package bai1;

import java.util.Scanner;
import java.util.ArrayList;

public class QLCB {

    static Scanner sn = new Scanner(System.in);
    static ArrayList<CanBo> listCanBo = new ArrayList<CanBo>();

    public static void ThemCanBo() {
        int n;
        System.out.println("Nhap so can bo: ");
        n = sn.nextInt();
        int i = 0;
        while (i != n) {
            CanBo a = new CanBo();
            System.out.println("Nhap thong tin can bo " + (i + 1));
            a.nhap();
            listCanBo.add(a);
            i++;
        }
    }

    public static void HienThi() {
        System.out.printf("%-10s%-30s%-10s%-10s%-20s", "ID", "Ho va ten", "Nam sinh", "Gioi tinh", "Dia chi");
        System.out.println("");
        for (int i = 0; i < listCanBo.size(); i++) {
            listCanBo.get(i).hienThi();
            System.out.println("");
        }
    }

    public static void Xoa() {
        int id;
        System.out.print("Nhap id can xoa: ");
        id = sn.nextInt();
        for (int i = 0; i < listCanBo.size(); i++) {
            if (listCanBo.get(i).getId() == id) {
                listCanBo.remove(i);
            }
        }
    }

    public static void TimKiem() {
        int id;
        int dem=0; 
        System.out.print("Nhap id can tim: ");
        id = sn.nextInt();
        for (int i = 0; i < listCanBo.size(); i++) {
            if (listCanBo.get(i).getId() == id) {
                dem++; 
                listCanBo.get(i).hienThi();
                System.out.println("");
            }
        }
        if(dem>0){
            System.out.println("Khong ton tai can bo co id " + id);
        }
    }

    public static void main(String[] args) {
        int chon;
        do {
            Scanner sn = new Scanner(System.in);
            System.out.println("------------------------------------------");
            System.out.println("1.Add 1 cán bộ vào List tương ứng. ");
            System.out.println("2.Hiển thị danh sách các cán bộ. ");
            System.out.println("3.Xóa 1 cán bộ theo id. ");
            System.out.println("4.Tìm kiếm 1 cán bộ theo id. ");
            System.out.println("5.Dừng chương trình. ");
            System.out.println("------------------------------------------");
            System.out.print("Moi ban nhap lua chon: ");
            chon = sn.nextInt();
            switch (chon) {
                case 1:
                    ThemCanBo();
                    break;
                case 2:
                    HienThi();
                    break;
                case 3:
                    Xoa();
                    break;
                case 4:
                    TimKiem();
                    break;
                case 5:
                    System.out.println("Dung chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (chon != 5);
    }
}
