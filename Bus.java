import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Bus {
    String Bus_name;
    String bus_num;
    String source;
    String destination;
    int total_seat;
    int available_seat;
    int cost_per_ticket;

    Bus( String Bus_name, String bus_num, String source, String destination, int total_seat, int available_seat,int cost_per_ticket){
        this.Bus_name=Bus_name;
        this.bus_num=bus_num;
        this.source=source;
        this.destination=destination;
        this.total_seat=total_seat;
        this.available_seat=available_seat;
        this.cost_per_ticket=cost_per_ticket;
    }

    public void Details(){
        System.out.println("======================================================");
        System.out.println("Bus Name       :-"+Bus_name);
        System.out.println("Bus Number     :-"+bus_num);
        System.out.println("From location  :-"+source);
        System.out.println("To destination :-"+destination);
        System.out.println("Total seats    :-"+total_seat);
        System.out.println("Available_seat :-"+available_seat);
        System.out.println("Cost           :-"+cost_per_ticket);
    }
}
class User{
    String user_id;
    String user_name;
    String password;
    String gender;
    String location;
    int age;  

    User(String user_id,String user_name,String password,String gender,String location,int age){
        this.user_id=user_id;
        this.user_name=user_name;
        this.password=password;
        this.gender=gender;
        this.location=location;
        this.age=age;
    }

    public void user_info(){
        System.out.println("user_id   :-"+user_id);
        System.out.println("user_name :- "+user_name);
        System.out.println("password  :-"+password);
        System.out.println("gender    :-"+gender);
        System.out.println("location  :-"+location);
        System.out.println("Age       :-"+age);
    }

}
    

class Booking{
    
    String user_id;
    String bus_name;
    String bus_num;
    int cost_per_ticket;
    Date date;
    double total_cost;
    String source;
    String destination;
    int num_of_tickets;
    Booking( String user_id,String bus_name,String bus_num,int cost,Date date,String source,String destination,int num_of_tickets,double total_cost){
        
        this.user_id=user_id;
        this.bus_name=bus_name;
        this.bus_num=bus_num;
        this.cost_per_ticket=cost;
        this.date=date;
        this.source=source;
        this.destination=destination;
        this.num_of_tickets=num_of_tickets;
        this.total_cost=total_cost;
    }
    public void Veiw_ticket(){
        System.out.println("=========TICKET=========");
       
        System.out.println("User_id        :-"+user_id);
        System.out.println("Bus Name       :-"+bus_name);
        System.out.println("Bus Num        :-"+bus_num);
        System.out.println("source         :-"+source);
        System.out.println("destination    :-"+destination);
        System.out.println("Total seat     :-"+num_of_tickets);
        System.out.println("Total cost     :-"+total_cost);

    }

}
class Bus_Management{
    public static void main(String[] args) {
        ArrayList<Bus> bus=new ArrayList<>();
        bus.add(new Bus("Aps Rtc", "1234", "Anatapur", "Kadiri", 52, 52,120));
        bus.add(new Bus("Indra", "5555", "Hydrabad", "Banglore", 60, 60,500));
        bus.add(new Bus("Triveni", "1245", "Anatapur", "banglore", 60,60,300));
        bus.add(new Bus("Triveni", "8985", "Anatapur", "banglore", 60,60,250));
        bus.add(new Bus("Aps Rtc", "6565", "Anatapur", "tirupati", 52, 52,250));
        bus.add(new Bus("Aps Rtc", "6543", "Anatapur", "Kadiri", 52, 52,120));
        bus.add(new Bus("Indra", "0989", "Anatapur", "Banglore", 60, 60,300));
        bus.add(new Bus("Indra", "0075", "Hydrabad", "Banglore", 60, 60,450));
        bus.add(new Bus("Indra", "1565", "Hydrabad", "Banglore", 60, 60,450));
        bus.add(new Bus("TS Rtc", "9850", "Hydrabad", "KarimNagar", 60, 60,450));
        bus.add(new Bus("TS Rtc", "6534", "Hydrabad", "Anatapur", 60, 60,450));
        bus.add(new Bus("TS Rtc", "7634", "Secindrabad", "Vishakapatnam", 60, 60,450));
        Scanner sc=new Scanner(System.in);

        ArrayList<User> user=new ArrayList<>();
        user.add(new User("manish_mopuri", "manish", "manish@12345", "male", "Anantapur", 19));
        user.add(new User("Yedhoti_Akash", "Akash", "Akash@12345", "male", "Kataripalli", 19));
        user.add(new User("Charan_cherry", "Charan", "charan@12345", "male", "tirupathi", 19));
        user.add(new User("Chandhu_jagan", "Chadhu", "jagan@ysr", "male", "tirupathi", 19));
        user.add(new User("Pavan_pro", "Pavan Yadhav", "pavan@12345", "male", "Kurnool", 19));
        user.add(new User("Yashwanth_fonk", "Yashwanth", "yash@12345", "male", "Anantapur", 19));
        user.add(new User("Sreeram_123", "Sreeram", "sreeram@12345", "male", " Kurnool",19));
        user.add(new User("Manoj_J", "Janyanthi Manoj", "manoj@12345", "male", "Kurnool", 19));
        user.add(new User("Ram_Mohan", "RamMohan", "ram@12345", "male", "Aanatapur", 19));
        user.add(new User("Harish_H", "Harish", "harish@12345", "male", "Vijayawada", 19));
        
        ArrayList<Booking> book=new ArrayList<>();

        Date date=new Date();

        boolean login_success=false;
        
        
        System.out.println("======login======");
        System.out.println("UserId");
        String user_id=sc.nextLine();        
        System.out.println("password");
        String pass=sc.nextLine();
        
        for(User u:user){
            if(u.user_id.equals(user_id.trim()) && u.password.equals(pass.trim())){
                login_success=true;
                System.out.println("you have logged sucessfully......");
                break;
            }
        }

        if(login_success==false){
            System.out.println("Invalid credenstial's");
            //System.exit(0);
            sc.close();
            return;
        }
                
    
       
        System.out.println("Enter souce location:-");
        String soc=sc.nextLine();
        System.out.println("Enter destination location");
        String des=sc.nextLine();
        
        for(Bus b:bus){
            if(b.source.equalsIgnoreCase(soc) && b.destination.equalsIgnoreCase(des)){
                b.Details();
            }
        }

        System.out.println("Enter the Bus number for booking:- ");
        String bus_n=sc.nextLine();
        boolean bus_found=false;
        
        for (Bus b : bus) {
            if(b.bus_num.equalsIgnoreCase(bus_n)){
                bus_found=true;
                System.out.println("Enter the no.of tickets");
                int num_of_tickets=sc.nextInt();
                sc.nextLine();
                if(b.available_seat>=num_of_tickets){
                double cost=b.cost_per_ticket;
                double total_cost=cost*num_of_tickets;
                System.out.println("cost "+total_cost);
                System.out.println("Are you ready for the payment?(Yes/No)");
                String choice=sc.nextLine();
                if(choice.equalsIgnoreCase("yes")){

                    book.add(new Booking(user_id, b.Bus_name,b.bus_num,b.cost_per_ticket, date, b.source, b.destination, num_of_tickets,total_cost));
                    b.available_seat-=num_of_tickets;
                    System.out.println(b.available_seat);
                }
                
            }
            else{
                System.out.println("Seats are unavailable");
            }
            }
        }
        if(bus_found==false){
            System.out.println("no bus found");
        }
        for (Booking booking : book) {
            booking.Veiw_ticket();
        }
        
     sc.close();                                                                 
    }
}