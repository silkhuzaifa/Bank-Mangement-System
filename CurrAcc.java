import java.util.Scanner;

public class CurrAcc extends Registration {
    float money, bal;
    int num=36897;
   private int pin;

    @Override
    void information()
    {
        super.information();
        System.out.println("Your application is complete");

    }
    void ser_Charges()
    {
        Scanner input = new Scanner(System.in);
        char ch;
        int charges = 0;
        System.out.println("------------------------------------------------");
        System.out.println("=> service charges for creating Account is 3000.");
        System.out.println("------------------------------------------------");
        System.out.println("=> Press Y to pay charges: ");
        System.out.println("-------------------------");
        ch = input.next().charAt(0);
        if (ch == 'Y' || ch == 'y')
        {
            System.out.println("--------------------");
            System.out.println("=> Pay service charges: ");
            System.out.println("--------------------");
          charges = input.nextInt();
          while (true)
          {
           if (charges != 3000)
           {
             System.out.print("=> Pay service charges: ");
             charges = input.nextInt();
           }
            else
              {
                  break;
              }
          }

        }
    }
    public void setPin(int pin)
    {
        this.pin=pin;

    }

    public int getPin()
    {
        return pin;
    }


    void dep_wit()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Enter your deposited amount: ");
        System.out.println("-----------------------------");
        money=input.nextFloat();
        System.out.println("----------------------");
        System.out.println("You Deposited: " +money);
        System.out.println("----------------------");
        bal=money+bal;
        System.out.println("------------------------------------");
        System.out.println("=> Your available balance is: " +bal);
        System.out.println("------------------------------------");
        System.out.println("How much amount you want to withdraw");
        System.out.println("------------------------------------");
        money=input.nextFloat();
        if(money>bal)
        {
            System.out.println("You can't do this transaction,enter valid amount");
            money=input.nextFloat();
        }
        float with=bal-money;
        System.out.println("=> Your available balance is: " +with);
        System.out.println("------------------------------------");
    }





}

