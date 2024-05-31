import java.util.Scanner;

public class Registration
{
    String name,nic,sex,address;
    int age;

    void information()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: " );
        name=input.nextLine();


        System.out.print("Enter your address: " );
        address=input.nextLine();

        System.out.print("Enter your NIC: " );
        nic=input.nextLine();

        System.out.print("Enter your Sex: " );
        sex=input.nextLine();

        System.out.print("Enter your age: " );
        age=input.nextInt();
    }
}
