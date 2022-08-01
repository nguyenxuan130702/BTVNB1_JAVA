package bai4;
import javax.swing.*;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){
        Employee c = new Employee("NV03","Nguyen Van A", 32,24);
        Employee a = new Employee();
        Employee b = new Employee();
        System.out.println("Enter employee information a: ");
        a.input();
        System.out.println("Enter employee information b: ");
        Scanner sn = new Scanner(System.in);
        System.out.print("input id: ");
        b.setId(sn.nextLine());
        System.out.print("input name: ");
        b.setName(sn.nextLine());
        System.out.print("input age: ");
        b.setAge(sn.nextInt());
        System.out.print("input working day: ");
        b.setWorkingDays(sn.nextInt());
        System.out.println("INFORMATION EMPLOYEES");
        System.out.println("INFORMATION A");
        a.output();
        System.out.println("INFORMATION B");
        b.output();
        System.out.println("INFORMATION C");
        c.output();
    }
}
