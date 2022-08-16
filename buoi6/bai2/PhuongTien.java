package bai2;

import java.util.Scanner;

public class PhuongTien {

    private String tenChuXe;
    private String loaiXe;
    private float dungTich;
    private float triGia;
    public Scanner sn = new Scanner(System.in);

    public PhuongTien() {

    }

    public PhuongTien(String tenChuXe, String loaiXe, float dungTich, float triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public void nhap() {
        System.out.print("\tNhap ten chu xe: ");
        tenChuXe = sn.nextLine();
        System.out.print("\tNhap loai xe: ");
        loaiXe = sn.nextLine();
        System.out.print("\tNhap dung tich: ");
        dungTich = sn.nextFloat();
        System.out.print("\tNhap tri gia: ");
        triGia = sn.nextFloat();
    }

    public float thue() {
        if (dungTich < 100) {
            return 0.02f * triGia;
        } else if (dungTich >= 100 && dungTich <= 200) {
            return 0.06f * triGia;
        } else {
            return 0.1f * triGia;
        }
    }

    public void hienThi() {
        System.out.printf("%-30s%-15s%-10.2f%-10.2f%-10.2f", tenChuXe, loaiXe, dungTich, triGia, thue());
        System.out.println("");
    }
}
