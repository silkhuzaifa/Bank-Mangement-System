import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
        char ch;
        System.out.println("------Welcome to Summit Bank------");
        System.out.print("=> Press A to create Account: ");
        Scanner input = new Scanner(System.in);
        ch=input.next().charAt(0);
        if(ch=='A'||ch=='a')
        {
            System.out.print("=> Press C for current Account");
            System.out.println("=> Press S for Saving Account");
            ch=input.next().charAt(0);
            if (ch=='c'||ch=='C')
            {
                CurrAcc c= new CurrAcc();

                c.information();

                c.ser_Charges();

                System.out.println("Your Account number is :"+ c.num);

                System.out.println("Make your pin");

                int pin=input.nextInt();

                c.setPin(pin);

                System.out.println("Your Pin is: "+ c.getPin());

                System.out.println("Congratulations! Your Account is Activated (-_-)");

                System.out.println("-------------------------------------------------");

                System.out.println("Login your account");//Login process
                System.out.println("------------------");
                System.out.println("Enter your Account Number");
                System.out.println("------------------");
                c.num=input.nextInt();

                if (c.num!=36897)

                 {

                   System.out.println("Enter your account number ");

                   c.num=input.nextInt();

                 }

                 else if (c.num==36897)

                 {

                   System.out.println("Enter your pin");

                   pin=input.nextInt();

                   if (pin!= c.getPin())

                   {

                    System.out.println("You put wrong pin,Enter pin again");

                    pin=input.nextInt();

                   }
                   c.dep_wit();

                 }

            }



            else if (ch=='s'|| ch=='S')
            {
                Sav_Acc s= new Sav_Acc();
                s.information();
                s.total_Amount();
                s.profit();


            }

        }


    }

}

