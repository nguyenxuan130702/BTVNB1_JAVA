package bai3;
import java.util.Scanner;
public class PTBac2 {
    private float a;
    private float b;
    private float c;
    public void nhap(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sn.nextFloat();
        System.out.print("Nhap b: ");
        b = sn.nextFloat();
        System.out.print("Nhap c: ");
        c = sn.nextFloat();
    }

    public void hienThi(){
        System.out.print(a + "x^2 + " + b + "x +" + c + "=0");
    }

    public void bienLuan(){
        if(a==0){
            System.out.println("Phuong trinh co nghiem: " + (-c/b));
        }
        else if(a==0 && b==0){
            if(c==0){
                System.out.println("Phuong trinh co vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
            float denta = b*b - 4*a*c;
            if(denta==0){
                System.out.println("Phuong trinh co nghiem kep: " + (-b/2*a));
            }
            else if(denta<0){
                System.out.println("Phuong trinh vo nghiem");
            }
            else {
                System.out.println("Nghiem thu nhat: " + ((-b+Math.sqrt(denta))/(2*a)));
                System.out.println("Nghiem thu 2: " + ((-b-Math.sqrt(denta))/(2*a)));
            }
        }
    }
}
