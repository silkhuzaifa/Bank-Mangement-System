import java.util.Scanner;

public abstract class Saving extends Registration
{
    abstract void profit();
    abstract void total_Amount();

    @Override
    void information()
    {
        super.information();
    }
}
class Sav_Acc extends Saving
{
    Scanner input=new Scanner(System.in);
    float amount,min_Amo=400000;
    @Override
    void total_Amount()
    {
        System.out.println("Enter your total amount");
        amount=input.nextFloat();
        if (amount<min_Amo)
        {
            System.out.println("You are not applicable for saving Account");

        }

    }

    @Override
    void profit()
    {
        System.out.println("Total amount devided by 12");
        amount=input.nextFloat();
        float profit=amount/12;
        System.out.println("Monthly profit on total amount is: "+ profit);
    }
}
