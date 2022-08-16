package bai2;

import java.util.Scanner;

public class Test {

    static int n;
    static PhuongTien[] a = new PhuongTien[100];
    static Scanner sn = new Scanner(System.in);

    public static void nhap() {
        System.out.print("Nhap so luong phuong tien: ");
        n = sn.nextInt();
        a = new PhuongTien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new PhuongTien();
            System.out.println("Nhap thong tin phuong tien " + (i + 1));
            a[i].nhap();
        }
    }

    public static void xuat() {
        System.out.printf("%-30s%-15s%-10s%-10s%-10s", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue");
        System.out.println("");
        for (int i = 0; i < n; i++) {
            a[i].hienThi();
        }
    }

    public static void xuatGiam() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].thue() < a[j].thue()) {
                    PhuongTien tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
        xuat();
    }

    public static void xuatTang() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].thue() > a[j].thue()) {
                    PhuongTien tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
        xuat();
    }

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("------------------------------------------------");
            System.out.println("1.Nhập thông tin và tạo danh sách các xe");
            System.out.println("2.Xuất bảng kê khai tiền thuế trước bạ của các xe.");
            System.out.println("3.Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần");
            System.out.println("4.Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần");
            System.out.println("5.Thoát.");
            System.out.println("------------------------------------------------");
            System.out.print("Moi ban nhap lua chon: ");
            chon = sn.nextInt();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatGiam();
                    break;
                case 4:
                    xuatTang();
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
