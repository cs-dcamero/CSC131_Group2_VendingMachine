import java.util.Scanner;

class vendingdriver
{    
        public static void main(String[] args) throws Exception 
        {
            //Stock of items
            Scanner sc = new Scanner(System.in);

            vendingMachine machine = new vendingMachine();
            moneyHandler cashscan = new moneyHandler();   
            
            boolean chosen = false;
            while(chosen == false)
            {   
                machine.clientDisplay();
                int choice = sc.nextInt();
                switch (choice) 
                {
                    case 1: // purchase 1st drink
                    {
                        if(machine.DrPepper.instock != 0)
                        {
                            System.out.print("That will be $" + String.format("%.2f",machine.drPrice) + ", insert cash \n\n");
                            cashscan.scanner(sc);
                            if(cashscan.confirmPrice(machine.DrPepper.price))
                            {
                                machine.purchase(choice);
                            }                            
                            break;
                        }
                        break;
                    }

                    case 2: // purchase 2nd drink
                    {
                        if(machine.Up7.instock != 0)
                        {
                        System.out.print("That will be $" + String.format("%.2f",machine.upPrice) + ", insert cash\n");
                        
                        machine.purchase(choice);
                        break;
                        }
                        break;
                    }

                    case 3: // purchase 3rd drink
                    {
                        if(machine.Pepsi.instock != 0)
                        {
                        System.out.println("That will be $" + String.format("%.2f",machine.pepPrice) + ", insert cash\n");
                        machine.purchase(choice);
                        break;
                        }
                        break;
                    }

                    case 4: // purchase 4th drink
                    {
                        if(machine.Coke.instock != 0)
                        {
                        System.out.println("That will be $" + String.format("%.2f",machine.colPrice) + ", insert cash\n");
                        machine.purchase(choice);
                        break;
                        }
                        break;
                    }

                    case 5: // purchase 5th drink
                    {
                        if(machine.Water.instock != 0)
                        {
                        System.out.println("That will be $" + String.format("%.2f",machine.watPrice) + ", insert cash\n");
                        machine.purchase(choice);
                        break;
                        }
                        break;
                    }

                    case 6: //exit the system
                    {
                        System.out.println("Have a nice day!\n");
                        chosen = true;
                        break;
                    }
                    
                    case 7: //Admin display
                    {
                        boolean chosen1 = false;
                        while(chosen1 == false)
                        {
                            machine.adminDisplay();
                            choice = sc.nextInt();

                            switch (choice) 
                            {
                                case 1: //past sales
                                {
                                    machine.sales();
                                    break;
                                }
            
                                case 2: //change price
                                {
                                    System.out.print("change price to $$"); 
                                    break;
                                }

                                case 3:  //exit the system
                                {
                                    chosen1 = true;
                                    break;
                                }

                                default: 
                                {
                                    System.out.println("Invalid option");
                                    break;
                                }
                            
                            }
                        }
                    }
                    break;

                    case 8: //restocker display
                    {
                        boolean chosen2 = false;
                        while(chosen2 == false)
                        {
                            machine.restockDisplay();
                            choice = sc.nextInt();

                            switch (choice) 
                            {                           
                                case 1: //restock 1st product
                                {
                                    machine.restock(choice);
                                    break;
                                }
            
                                case 2: //restock 2nd product
                                {
                                    machine.restock(choice);
                                    break;
                                }

                                case 3:  //restock 3rd product
                                {
                                    machine.restock(choice);
                                    break;
                                }

                                case 4:  //restock 4th product
                                {
                                    machine.restock(choice);
                                    break;
                                }

                                case 5:  //restock 5th product
                                {
                                    machine.restock(choice);
                                    break;
                                }

                                case 6:  //exit the system
                                {
                                    chosen2 = true;
                                    break;
                                }

                                default: 
                                {
                                    System.out.println("Invalid option");
                                    break;
                                }
                            
                            }
                        }
                        break;
                    }
                    
                    default: 
                    {
                        System.out.println("Invalid option");
                    }
                }
            }
            sc.close();
    }

}