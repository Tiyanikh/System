package BookingSystem;

import java.util.Scanner;


public class EventHandler {
      public int computeprice(int numberofguest)
    {  int priceperguest=50;
      int totalprice = numberofguest * priceperguest;
       System.out.println("Total Price: R" + totalprice);
       return totalprice;

   }


    public int getdiscount(int numberofguest)
{
  if (numberofguest>40)
  {

      int totalprice= computeprice(numberofguest);
      int discountprice= totalprice* 10/100;
      int afterdprice= totalprice-discountprice;
      System.out.println("Discount calculated");
      System.out.println("Total Price: R"+afterdprice);
      return afterdprice;
  }
  else
  {
    System.out.println("Dont qualify for Discount");
    System.out.println("Total Price: R"+computeprice(numberofguest));
    return computeprice(numberofguest);

  } 

}

public String  getpercentage(int numberofguest)
{
    EventHandler hh = new EventHandler();
    int totalprice =hh.computeprice(numberofguest);

   int halfprice=totalprice*50/100;
  if ( totalprice-halfprice==halfprice)
  {
   String line="Booking Confirmed";

    System.out.println(line);

    return line;
  }
  else
  {
    String line="Booking Not confirmed";
    System.out.println(line);
    return line;

  }
}

    public void setguests(int numberofguest) 
    {
        computeprice(numberofguest);
    }


    public int Gettingnoofadults() {
        Scanner scan=null;
        try   
        {
        scan = new Scanner(System.in);
        int noofadults;
        System.out.println("Please Enter the Number of Adults attending the event: ");
        noofadults =Integer.parseInt(scan.nextLine());
        System.out.println("Number of adults: " + noofadults);
        return noofadults;
        }
        finally
    {
        if (scan!=null)
        {
            scan.close();        
        }
    }

    }

    public int Gettingnoofkids() 
{  Scanner scan=null;
    try   
    {

            scan= new Scanner(System.in);
            int noofkids;
            System.out.println("Please Enter the Number of Adults attending the event: ");
            noofkids =Integer.parseInt(scan.nextLine());
           System.out.println("Number of kids: "+ noofkids);
        return noofkids;
    }
    finally
    {
        if (scan!=null)
        {
            scan.close();        
        }
    }



}
public String GettingEventtype()
{Scanner scan=null;
    try   
    {
     scan = new Scanner (System.in);

    System.out.println("Please Enter your event Type From the given options;");
    System.out.print("\n1.Bapitism  \n2.Wedding \n3. Year end function \n4 Baby shower \n5 Birthday \n6 Other ");
    int option=scan.nextInt();

    switch (option)
     {
        case 1:

            String line  = "We palnning an Bapitism ";
             System.out.println(line);
             return line;

             // add methods of decorations 
             //add methods of event details 
             //add methods of payment;

         case 2:

             String line1 ="Congratulation on the wedding ";
            System.out.println(line1);

             // add methods of decorations 
             //add methods of event details 
             //add methods of payment;
             return line1;


         case 3:

            String line2 ="We palnning a year end party";
             System.out.println(line2);

             // add methods of decorations 
             //add methods of event details 
             //add methods of payment;
             return line2;

        case 4:

               String line3 ="New member in the family ,we are palnning a baby shower";
             System.out.println(line3);

             // add methods of decorations 
             //add methods of event details 
             //add methods of payment;
             return line3;

        case 5:
  String line4="It is a birthday party";

             System.out.println(line4);

              //add methods of event details 
             //add methods of payment;
             return line4;

        case 6:
            // Scanner scannner = new Scanner (System.in);
              String typeofevent;
              System.out.println("Please enter the type of event");
              typeofevent=scan.nextLine();
              System.out.println("We planning an:" + typeofevent);
              Gettingnoofadults();
             return typeofevent;
        default:
        String line5 ="ERROR!!! Please enter the type of event ";
        System.out.println(line5);
            return line5;
     }
    }
    finally
    {
        if (scan!=null)
        {
            scan.close();        
        }
    }

}
}






