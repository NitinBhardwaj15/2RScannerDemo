import java.util.Scanner;
public class DemoScanner {
    public static void main(String []args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your full name");
        //declaring a string object to store name of user
        String name= object.nextLine();
        System.out.println("Enter your age");
        //byte can store values ranging from -128 to 127
        byte age = object.nextByte();
        System.out.println("Enter four digit score code");
        short code = object.nextShort();
        System.out.println("Enter your CPI");
        double cpi = object.nextDouble();
        System.out.println("Enter your mobile number");
        long mob = object.nextLong();
        System.out.println("Enter your exam status as true for pass or false for fail");
        boolean pass= object.nextBoolean();
        object.close();

        //output
        System.out.println("Name : " +name);
        System.out.println("Age: " +age);
        System.out.println("Code : " +code);
        System.out.println("CPI: " + cpi);
        System.out.println("Mobile number : " +mob);
        System.out.println("Passed: " +pass);

    }

}
