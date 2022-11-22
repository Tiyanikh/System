package BookingSystem;


import java.io.FileNotFoundException;
import java.util.List;

//import DataAccessLayer.DataHandler;

public class Customer {
        int clientID;
        String firstname;
        String lastname;
        String email;
        String password;
        String phoneNo;
        String age;

        public int getClientID(){
            return clientID;
        }
        public void setClientID(int clientID){
            this.clientID = clientID;
        }
        public String getFirstname(){
            return firstname;
        }
        public void setFirstname(String firstname){
            this.firstname = firstname;
        }
        public String getLastname(){
            return lastname;
        }
        public void setLastname(String lastname){
            this.lastname = lastname;
        }
        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public String getPassword(){
            return password;
        }
        public void setPassword(String password){
            this.password = password;
        }
        public String getPhoneNo(){
            return phoneNo;
        }
        public void setPhoneNo(String phoneNo){
            this.phoneNo = phoneNo;
        }
        public String getAge(){
            return age;
        }
        public void setAge(String age){
            this.age = age;
        }
       

        public Customer(int clientID, String firstname, String lastname, String age, String phoneNo, String email, String password){
            this.clientID = clientID;
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.phoneNo = phoneNo;
            this.email = email;
            this.password = password;
        }
        public List<User> ClientsData( ) throws FileNotFoundException{
            DataHandler dh = new DataHandler();
            List<Customer> clist = dh.GetClients();
            if(!clist.isEmpty()){
                return clist;
            }
            else{
                return null;
            }
        }
        public String toString() {
            return clientID + "," + firstname + "," + lastname + "," + age + "," + phoneNo + "," + email + "," + password;
        }

}





