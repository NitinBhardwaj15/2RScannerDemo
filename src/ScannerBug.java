import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;
import java.util.Scanner;

//to demonstrate problem of reading string after numeric value
public class ScannerBug {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter rol number");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");
        String name= sc.nextLine();
        System.out.println("Enter section");
        String section = sc.next();
        System.out.println("output starts");
        sc.close();
        System.out.println("roll"+"\n"+roll);
        System.out.println("NAme"+"\n"+name);
        System.out.println("Section"+"\n" + section);
    }

}
