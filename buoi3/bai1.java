package buoi3;
import java.util.Scanner;
public class bai1 {
    public static float tbc(int a[],int n) {
        int T = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0 && i%2==0) {
                T += a[i];
                dem++;
            }
        }
        return (float) T / dem;
    }
    public static int timsnn(int a[],int n){
        int minn = a[0];
        for(int i=0;i<n;i++){
            if(a[i] < minn){
                minn = a[i];
            }
        }
        return minn;
    }
    public static void timkiem(int a[],int n){
        for(int i=0;i<n;i++){
            if(a[i] == timsnn(a,n)){
                System.out.print((i+1) + " ");
            }
        }
    }
    public static int kiemtrachinhphuong(int n){
        if(Math.sqrt(n)==(int)Math.sqrt(n)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void sochinhphuong(int a[],int n){
        int dem = 0;
        int b[] = new int[n];
        int i=0,j=0;
        while(i!=n){
            if(Math.sqrt(a[i])==(int)Math.sqrt(a[i])) {
                b[j] = a[i];
                j++;
            }
            i++;
        }
        if(j!=0){
            System.out.print("Cac so chinh phuong trong mang: ");
            for(int k=0;k<j;k++){
                int l=0;
                for(int h=0;h<=k;h++){
                    if(b[h]==b[k]){
                        l++;
                    }
                }
                if(l==1){
                    System.out.print(b[k]+" ");
                }
            }
        }
        else {
            System.out.println("Mang khong co so chinh phuong");
        }
    }
    public static int kiemtrasnt(int n){
        if(n<2){
            return 0;
        }
        else {
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return 0;
                }
            }
            return 1;
        }
    }
    public static void hienthisnt(int a[],int n){
        int dem =0;
        for(int i=0;i<n;i++){
            if(kiemtrasnt(a[i])==1){
                System.out.print(a[i] + " ");
                dem++;
            }
        }
        if(dem==0){
            System.out.println("Mang khong co so nguyen to");
        }
    }
    public static void sapxep(int a[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
    }
    public static void main(String[] args){
        int n;
        int a[];
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap so phan tu cau mang: ");
        n = sn.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Nhap a[" + (i+1) + "]= ");
            a[i] = sn.nextInt();
        }
        float TB = tbc(a,n);
        System.out.println("Trung binh cac so le o vi tri chan: " + TB);
        System.out.print("Vi tri cac so nho nhat trong mang: ");
        timkiem(a,n);
        System.out.println();
        sochinhphuong(a,n);
        System.out.println();
        System.out.print("Cac so nguyen to trong mang: ");
        hienthisnt(a,n);
        System.out.println();
        System.out.print("Mang sau khi sap xep tang: ");
        sapxep(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
