package Question5;
// hotelId - int
// hotelName - String
// dateOfBooking - String(in the formate dd-mm-yyyy)
// noOfRoomsBooked - String
// wifiFacility -  String
// totalBill - double
public class Hotel {
    int hotelId;
    String hotelName;
    String dateOfBooking;
    String noOfRoomsBooked;
    String wifiFacility;
    double totalBill;
    Hotel(int hotelId,String hotelName,String dateOfBooking,String noOfRoomsBooked, String wifiFacility,Double totalBill)
    {
        this.hotelId=hotelId;
        this.hotelName=hotelName;
        this.dateOfBooking=dateOfBooking;
        this.noOfRoomsBooked=noOfRoomsBooked;
        this.wifiFacility=wifiFacility;
        this.totalBill=totalBill;
    }
   
}
