//import java.util.Scanner;

public class vendingMachine extends product
{
    //int stock;
    //Stock of items
    //product itemsStocked[] = new product[5];

        product DrPepper = new product(2.00, 10);
        product Up7 = new product(1.50, 10);
        product Pepsi = new product(1.00, 10);
        product Coke = new product(2.00, 10);
        product Water = new product(0.99, 10);
    

    //Sold items tracker
    int drS = 0;
    int upS = 0;
    int pepS = 0;
    int colS = 0;
    int watS = 0;
    int totalsales = 0;
    
    int MAX_CAP = 15; // max capacity that can be stocked

    double drPrice = 2.00;
    double upPrice = 1.50;
    double pepPrice = 1.00;
    double colPrice = 2.00;
    double watPrice = 0.99;
    double totalPrice = 0.00;

    void clientDisplay()
        {
            System.out.println("\nWelcome to the vending machine screen");
            System.out.println("-------------------------------------");
            if(DrPepper.instock != 0)
            {
            System.out.println("1.) Dr Pepper [" + DrPepper.instock + "]");
            } else {
                System.out.println("1.) [ OUT OF STOCK ]");
            }
            
            if(Up7.instock != 0)
            {
            System.out.println("2.) 7up       [" + Up7.instock + "]");
            } else {
                System.out.println("2.) [ OUT OF STOCK ]");
            }
            if(Pepsi.instock != 0)
            {
            System.out.println("3.) Pepsi     [" + Pepsi.instock + "]");
            } else {
                System.out.println("3.) [ OUT OF STOCK ]");
            }
            if(Coke.instock != 0)
            {
            System.out.println("4.) Coca Cola [" + Coke.instock + "]");
            } else {
                System.out.println("4.) [ OUT OF STOCK ]");
            }
            if(Water.instock != 0)
            {
            System.out.println("5.) Water     [" + Water.instock + "]");
            } else {
                System.out.println("5.) [ OUT OF STOCK ]");
            }
            System.out.println("6.) Exit \n");
            System.out.println("Select the number of the drink you want to buy");
        }
    
    void restockDisplay()
        {
            System.out.println("\nCurrent vending machine stocks");
            System.out.println("-------------------------------------");
            
            if(DrPepper.instock != 0)
            {
            System.out.println("1.) Dr Pepper stock: [" + DrPepper.instock + "]");
            } else {
                System.out.println("1.) Dr Pepper stock [ OUT OF STOCK ]");
            }
            
            if(Up7.instock != 0)
            {
            System.out.println("2.) 7up:             [" + Up7.instock + "]");
            } else {
                System.out.println("2.) 7up             [ OUT OF STOCK ]");
            }

            if(Pepsi.instock != 0)
            {
            System.out.println("3.) Pepsi:           [" + Pepsi.instock + "]");
            } else {
                System.out.println("3.) Pepsi           [ OUT OF STOCK ]");
            }

            if(Coke.instock != 0)
            {
            System.out.println("4.) Coca Cola:       [" + Coke.instock + "]");
            } else {
                System.out.println("4.) Coca Cola [ OUT OF STOCK ]");
            }

            if(Water.instock != 0)
            {
            System.out.println("5.) Water:           [" + Water.instock + "]");
            } else {
                System.out.println("5.) Water            [ OUT OF STOCK ]");
            }

            System.out.println("6.) Exit \n");
            
            System.out.println("Select the drink you are going to restock");
        }

    void adminDisplay()
        {
            System.out.println("\nWelcome to the Vending Machine Screen");
            System.out.println("-------------------------------------");
            System.out.println("1.) Look up past sales");
            System.out.println("2.) Change price of product" );
            System.out.println("3.) Exit" ); 
        }
    
    void sales()
    {
    totalPrice = drPrice * drS + upPrice * upS + pepPrice * pepS + colPrice * colS + watPrice * watS;
    System.out.println("\nAmount of Dr Pepper cans sold:  " + drS +"     Money made: $"  + String.format("%.2f",drPrice * drS));
    System.out.println("Amount of 7up cans sold:        " + upS + "     Money made: $"  + String.format("%.2f",upPrice * upS));
    System.out.println("Amount of Pepsi cans sold:      " + pepS + "     Money made: $" + String.format("%.2f",pepPrice * pepS));
    System.out.println("Amount of Coca Cola cans sold:  " + colS + "     Money made: $" + String.format("%.2f",colPrice * colS));
    System.out.println("Amount of Water cans sold:      " + watS + "     Money made: $" + String.format("%.2f",watPrice * watS));
    System.out.println("Total products sold:     " + totalsales + "      Total Money made: $" + String.format("%.2f",totalPrice) + "\n");
    }
    
    void purchase(int drinknum)
    {
        switch (drinknum)
        {
            case 1: 
            {
                DrPepper.instock -= 1;
                totalsales += 1;
                drS += 1;
                break;
            }

            case 2: 
            {
                Up7.instock -= 1;
                totalsales += 1;
                upS += 1;
                break;
            }

            case 3: 
            {
                Pepsi.instock -= 1;
                totalsales += 1;
                pepS += 1;
                break;
            }

            case 4: 
            {
                Coke.instock -= 1;
                totalsales += 1;
                colS += 1;
                break;
            }

            case 5: 
            {
                Water.instock -= 1;
                totalsales += 1;
                watS += 1;
                break;
            }
        }
    }

    void restock(int drinknum)
    {
        int value = 0;
        switch (drinknum)
        {
            case 1: 
            {
                value = MAX_CAP - DrPepper.instock;
                DrPepper.instock += value;
                break;
            }

            case 2: 
            {
                value = MAX_CAP - Up7.instock;
                Up7.instock += value;
                break;
            }

            case 3: 
            {
                value = MAX_CAP - Pepsi.instock;
                Pepsi.instock += value;
                break;
            }

            case 4: 
            {
                value = MAX_CAP - Coke.instock;
                Coke.instock += value;
                break;
            }

            case 5: 
            {
                value = MAX_CAP - Water.instock;
                Water.instock += value;
                break;
            }
        }
    }

}




