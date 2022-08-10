/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

/**
 *
 * @author NGUYENTHIXUAN
 */
import java.util.Scanner; 
public class Address {
    public Scanner sn = new Scanner(System.in);
    private String id;
    private String district;
    String province;
    public void input(){
        System.out.print("\t\tinput id: ");
        id = sn.nextLine();
        System.out.print("\t\tinput district: ");
        district = sn.nextLine();
        System.out.print("\t\tinput province: ");
        province = sn.nextLine();
    }
    public void output(){
        System.out.printf("%-15s%-15s%-15s",id,district,province);
    }
}
