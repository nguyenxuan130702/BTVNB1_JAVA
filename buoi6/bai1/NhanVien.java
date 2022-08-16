package bai1;

public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien() {

    }

    public NhanVien(String congViec) {
        super();
        this.congViec = congViec;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap cong viec: ");
        congViec = sn.nextLine();
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("%-20s", congViec);
        System.out.println("");
    }

    @Override
    public String toString() {
        return super.toString() + "Cong viec: " + congViec + "/n";
    }
}
