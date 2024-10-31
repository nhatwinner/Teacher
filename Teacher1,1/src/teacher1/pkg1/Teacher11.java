
package teacher1.pkg1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Teacher11 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Nhap ten: ");
            String name = scanner.nextLine();
            
            System.out.print("Nhap tuoi: ");
            String age = scanner.nextLine();
        
            System.out.print("Nhap nam sinh (dd/MM/yyyy): ");
            String birthDateStr = scanner.nextLine();
            Date birthDate = dateFormat.parse(birthDateStr);

            System.out.print("Nhap gioi tinh: ");
            String gender = scanner.nextLine();

            System.out.print("Nhap chuyen nganh: ");
            String major = scanner.nextLine();

            System.out.print("Nhap GPA: ");
            String gpa = scanner.nextLine();

            System.out.print("Nhap que quan: ");
            String hometown = scanner.nextLine();

            System.out.println("\n===== Thong Tin Sinh Vien: ");
            System.out.println("Ten: " + name);
            System.out.println("Tuoi: " + age);
            System.out.println("Nam sinh: " + dateFormat.format(birthDate)); 
            System.out.println("Gioi tinh: " + gender);
            System.out.println("Chuyen nganh: " + major);
            System.out.println("GPA: " + gpa);
            System.out.println("Que quen: " + hometown);
            
        } catch (ParseException e) {
            System.out.println("Ngay sinh khong hop le. Vui long nhap theo đanh dang dd/MM/yyyy.");
        } finally {
            scanner.close();
        }
        // TODO code application logic here
    }
    
}
