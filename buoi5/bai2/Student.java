/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author NGUYENTHIXUAN
 */
import java.util.Scanner; 
public class Student {
    public Scanner sn = new Scanner(System.in);
    private int id;
    private String name;
    private int age;
    Address address;
    public void input(){
        System.out.print("\tinput id: ");
        id = sn.nextInt();
        sn.nextLine();
        System.out.print("\tinput name: ");
        name = sn.nextLine();
        System.out.print("\tinput age: ");
        age = sn.nextInt();
        System.out.print("\tinput address");
        address = new Address();
        address.input();
    }
    public void output(){
        System.out.printf("%-15d%-30s%-15d",id,name,age);
        address.output();
        System.out.println();
    }
    public int getId() {
        return id;
    }
}
