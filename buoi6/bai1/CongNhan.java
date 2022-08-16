package bai1;

public class CongNhan extends CanBo {

    private int bac;

    public CongNhan() {

    }

    public CongNhan(int bac) {
        super();
        this.bac = bac;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap bac: ");
        bac = sn.nextInt();
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("%-10d", bac);
        System.out.println("");
    }

    @Override
    public String toString() {
        return super.toString() + "Bac: " + bac + "/n";
    }
}
