package BookingSystem;


public class paymentDetails {
   private int payId;
   private int bookingnr;
   public static  double visitorprice=70;
   private int totPrice;
   private int noOfGuest;
   private int discount;

   public paymentDetails(int payId, int bookingid, int totalprice, int percentagepayed, int noofguest, int disount) {
       this.payId = payId;
       this.bookingnr = bookingid;
       this.totPrice = totalprice;
       this.noOfGuest = noofguest;
       this.discount=disount;

   }



//default constructor
public paymentDetails()
{
 noOfGuest=0;
 totPrice=0;

}
//Method to get payid 
public int getPayid()
{
    return payId;
}
public int setpayid(int payid)
{
 this.payId=payid;
   return payid;
}
//Method to get bookingnr 
public int Getbookingnr()
{
    return bookingnr;
}
public int setbooking(int bookingid)
{
this.bookingnr=bookingid;
  return bookingid;
}
//Method to set numberofguest
public int setguests(int numberofguest)
{
    this.noOfGuest=numberofguest;
   return noOfGuest;
    //computeprice(numberofguest);
}


// Method to get number of guest
public int getGuest()
{
    return noOfGuest;
}
//Method to get totalprice
public int gettotalprice()
{
    return totPrice;
}
public void settotalprice( int totalprice)
{
    this.totPrice= totalprice;

}

public int getnoofguest()
{
    return noOfGuest;
}
public int getdiscount()
{
    return discount;
}
public void setdiscount(int discount)
{
   this.discount= discount;

}

public int Getbookingnr(int bookingnr2) {
	return bookingnr;
}
}



