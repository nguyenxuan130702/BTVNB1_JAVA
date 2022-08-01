package bai1;
import java.util.Scanner;
public class HinhChuNhat {
    private float chieuDai;
    private float chieuRong;
    public void nhap(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        chieuDai = sn.nextFloat();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        chieuRong = sn.nextFloat();
    }

    public float dienTich(){
        return chieuDai*chieuRong;
    }

    public float chuVi(){
        return 2*(chieuDai+chieuRong);
    }

    public void hienThi(){
        System.out.println("Chieu dai HCN: " + chieuDai);
        System.out.println("Chieu rong HCN: " + chieuRong);
        System.out.println("Chu vi HCN: " + chuVi());
        System.out.println("Dien tich HCN: " + dienTich());
    }
    public void setChieuDai(float chieuDai){
        this.chieuDai = chieuDai;
    }
    public void setChieuRong(float chieuRong){
        this.chieuRong = chieuRong;
    }
    public float getChieuDai(){
        return chieuDai;
    }
    public float getChieuRong(){
        return chieuRong;
    }

}
