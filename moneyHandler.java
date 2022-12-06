import java.util.Scanner;

class moneyHandler
{
    double money;

    void scanner(Scanner sc)
    {       
        money = sc.nextDouble();
                   
    }

    Boolean confirmPrice(double itemprice)
    {
        if(money > itemprice)
        {
            dispenseChange(money,itemprice);
            return true;
        }

        if(money == itemprice)
        {
            return true;
        }
              
        System.out.println("\n\n===================== NOT ENOUGH MONEY===================== \n\n\n" + "===================== CHANGE DISPENSED ===================== ");
        return false;
        
    }

    void dispenseChange(double money, double price)
    {
        System.out.println("Change of: " + String.format("%.2f",(money - price)) + " dispensed");
    }
} 