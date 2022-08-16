package bai1;

import java.util.Scanner;

public class CanBo {

    protected int id;
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;
    public Scanner sn = new Scanner(System.in);

    public CanBo() {

    }

    public CanBo(int id, String hoTen, int namSinh, String gioiTinh, String diaChi) {
        this.id = id;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    
    public int getId(){
        return id; 
    }
    
    public void nhap() {
        System.out.print("Nhap id: ");
        id = sn.nextInt();
        sn.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sn.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = sn.nextInt();
        sn.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sn.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sn.nextLine();
    }

    public void hienThi() {
        System.out.printf("%-10d%-30s%-10d%-10s%-20s", id, hoTen, namSinh, gioiTinh, diaChi);
    }

    public String toString() {
        return "ID: " + id + "/t" + "HoTen: " + hoTen + "/t" + "Nam sinh: " + namSinh + "/t" + "Gioi tinh: " + gioiTinh + "/t" + "Dia chi: " + diaChi + "/t";
    }
}
