import java.util.Scanner;

public class ScannerQue {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter space seperated value");
        int roll = sc.nextInt();
        String name= sc.next();
        String section = sc.next();
        sc.close();
        System.out.println(roll+" "+name+" "+section);

    }
}
