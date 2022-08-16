package bai1;

public class KySu extends CanBo {

    private String nganh;

    public KySu() {

    }

    public KySu(String nganh) {
        super();
        this.nganh = nganh;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap nganh: ");
        nganh = sn.nextLine();
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("%-15s", nganh);
        System.out.println("");
    }

    @Override
    public String toString() {
        return super.toString() + "Nganh: " + nganh + "/n";
    }
}
