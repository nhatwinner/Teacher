
package teacher3;

import java.util.Scanner;


public class Teacher3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot gia tri: ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("Day la mot so nguyen: " + number);
        } else {
            System.out.println("Day khong phai la so nguyen.");
        }

        scanner.close();
        // TODO code application logic here
    }
    
}
