package bai4;
import java.util.Scanner;
public class Employee {
    int price = 50;
    private String id;
    private String name;
    private int age;
    private int workingDays;
    private double salary;
    public Employee(){
        id = "";
        name = "";
        age = 0;
        workingDays = 0;
    }

    public Employee(String id, String name, int age, int workingDays){
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }
    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setWorkingDays(int workingDays){
        this.workingDays = workingDays;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getWorkingDays(){
        return workingDays;
    }

    public double Salary(){
        return workingDays*price;
    }

    public void input(){
        Scanner sn = new Scanner(System.in);
        System.out.print("input id: ");
        id = sn.nextLine();
        System.out.print("input name: ");
        name = sn.nextLine();
        System.out.print("input age: ");
        age = sn.nextInt();
        System.out.print("input working days: ");
        workingDays = sn.nextInt();
    }

    public void output(){
        System.out.println("ID: " + id);
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
        System.out.println("WORKING DAY: " + workingDays);
        System.out.println("SALARY: " + Salary());
    }
}

