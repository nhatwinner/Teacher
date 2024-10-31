/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teacher1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Teacher1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin
  System.out.print("Nhap ten: ");
        String name = scanner.nextLine();

        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine()); // Tranh loi newline

        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();

        System.out.print("Nhap chuyen nganh: ");
        String major = scanner.nextLine();

        System.out.print("Nhap GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap que quan: ");
        String hometown = scanner.nextLine();

        // Hiển thị thông tin
        System.out.println("\n--- Thong tin ---");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Chuyen nganh: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Que quan: " + hometown);
        
        scanner.close();
        // TODO code application logic here
    }
    
}
