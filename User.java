package BookingSystem;



import BusinessLogicLayer.Address;
import BusinessLogicLayer.person;
import BusinessLogicLayer.Deco;
import BusinessLogicLayer.EventDetails;
import BusinessLogicLayer.Food;
import BusinessLogicLayer.PaymentDetails;
import BusinessLogicLayer.EventInfo;
import DataAccessLayer.DataHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DataAccessLayer.DataHandler;

public class User {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.printAppHeader();
        user.printUserTypeMenu();
        Scanner scan = new Scanner(System.in);


        int option = scan.nextInt();

        switch (option) {
            case 1:
                {
                    user.printClientVerMenu();
                    int opt1 = scan.nextInt();
                    switch (opt1) {
                        case 1:
                            {
                                DataHandler dh = new DataHandler();
                                dh.VerifyClientLogin();
                                user.viewandinsert();
                            }
                                break;
                        case 2: 
                            {
                                DataHandler dh = new DataHandler();
                                dh.AddClient();
                                user.viewandinsert();

                            }

                        default:
                            break;
                    }
                }
                break;
            case 2:
                {
                    user.printEmpVerMenu();
                    user.viewandinsert();
                }
                    break;
            case 3: {
                    System.exit(0);
                }
                    break;
            default: {
                    System.out.println("Invalid selection");
                }
            }
            scan.close();
    }
    //Methods
    public void printAppHeader(){
        System.out.println("|---------------------------------|");
        System.out.println("[  Welcome, Taste with T  ]");
        System.out.println("|---------------------------------|");
    }
    public void printUserTypeMenu(){

        System.out.println("What type of user are you?");
        System.out.println("1. people\n2. Employees\n0. Exit");
    }
    public void printClientVerMenu(){
        System.out.println("Do you want to Login as existing client or Register as new client?");
        System.out.println("1. Login\n2. Register\n0. Exit");
    }
    public void printEmpVerMenu(){
        System.out.println("Do you want to Login as existing employee or Register as new employee?");
        System.out.println("1. Login\n2. Register\n0. Exit");
    }
    public void viewandinsert()  throws IOException{
        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();
        System.out.println("1.View Details  \n2.Insert Details ");
       // System.out.println("1.View Payment \n2.View Event Details  \n3. Insert Payment \n4 Insert eventDeatils  \n0. Exit");

        switch (opt) {
            case 1:
                {
                    System.out.println("1.View Payment Information \n2.View Event Details \n3. View Decoration Details \n4.View Food Selection Deatils \n5 Address Details \n6.Exit ");
                    int option1 = scan.nextInt();
                    switch (option1) 
                    {
                        case 1:
                            {
                                DataHandler dh = new DataHandler();
                                dh.Getpaymentinfo(); 
                            }
                                break;
                        case 2: 
                            {
                                DataHandler dd = new DataHandler();
                                 dd.Geteventdetails();

                            }
                            case 3:
                            {
                                DataHandler kk = new DataHandler();
                                kk.GetDecorations();
                            }
                            case 4:
                            {
                                DataHandler ss = new DataHandler();
                                ss.GetFoodSelection();
                            }
                            case 5:
                            {
                                DataHandler mm = new DataHandler();
                                mm.GetAddress();

                            }
                            case 6:
                            {
                                System.exit(0);

                            }
                            break;

                        default:
                        System.out.println("Invalid option");
                            break;
                    }
                }

         case 2:
                {
                    System.out.println("1.Insert Payment Information \n2.Insert Event Details \n3. Insert Decoration Details \n4.Insert Food Selection Deatils \n5.Insert Address Details \n6.Exit ");
                    int opt1 = scan.nextInt();
                    switch (opt1) 
                    {
                        case 1:
                            {
                                paymentDetails ss = new paymentDetails();
                                System.out.print(" Please enter the number of guest attending ? => ");
                                int guestno = scan.nextInt();  
                                //PaymentInfo ss = new PaymentInfo();
                                System.out.print(" Please enter the booking number ? => ");
                                int bookingnr  = scan.nextInt(); 
                                EventInfo dd = new EventInfo();

                                DataHandler dh = new DataHandler();
                                int countline=0; 
                                EventInf oo = new EventInf();
                                List<paymentDetails> payinfor = new ArrayList<paymentDetails>();
                                List<EventDetails> evendetails = new ArrayList<EventDetails>();


                                for (EventDetails eventDetails : evendetails) {
                                for (PaymentInfo paymentInfo : payinfor) {
                                  if (paymentInfo.Getbookingnr(bookingnr) == eventDetails.getbookingnr()) 
                                  {
                                      ss.setbooking(oo.getbookingnr());
                                  }
                                }
                             }

                                dd.getpercentage(guestno);
                                while (scan.hasNextLine())
                                {
                                    countline++;
                                    dh.WritePayementinfor(ss.setpayid(countline + 11), ss.setbooking(bookingnr),
                                            dd.computeprice(guestno), ss.setguests(guestno), dd.getdiscount(guestno));
                                }    
                            }
                                break;
                        case 2: 
                            {
                                EventInf dd = new EventInf();
                                 EventInfo ed= new EventInfo();
                                 DataHandler dh = new DataHandler();
                                  int countline=0; 
                                 person cc = new person();
                                 Address aa = new Address();
                                 Food snn = new Food();
                                 Deco ee = new Deco();

                                while (scan.hasNextLine())
                                {
                                  countline++;
                                  dh.Writereventdetails(ed.setbookingnr(countline+122), cc.getClientID(), dd.GettingEventtype(),aa.getAddressID(), dd.Gettingnoofadults(), dd.Gettingnoofkids(), snn.getCourses(), ee.getDecorDescriptions());
                //dh.WritePayementinfor( ss.getPayid(countline + 11),ss.setbooking(bookingnr),dd.computeprice(guestno)  ,ss.setguests(guestno),  dd.getdiscount(guestno));
                                  }   


                              }
                            break;
                            case 3:
                            {

                                DataHandler dh = new DataHandler();
                                dh.AddDecorations();

                            }
                            case 4:
                            {
                                DataHandler dh = new DataHandler();
                                dh.AddFoodSelection();
                            }
                            case 5:
                            {
                                DataHandler ff = new DataHandler();
                                ff.AddAddress();

                            }
                            case 6:
                            {
                                System.exit(0);

                            }
                            break;


                        default:
                        System.out.println("Invalid option");
                            break;
                    }

                }
            }  

        }

}












