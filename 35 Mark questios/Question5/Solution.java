package Question5;
import java.util.*;
public class Solution {
    public static int noOfRoomsBookedInGivenMonth(Hotel[] hotels,String month)
    {
        int c=0;
        for(Hotel hotel:hotels)
        {
            if(hotel.dateOfBooking.substring(3,6).equalsIgnoreCase(month))
            {
                c=c+Integer.parseInt(hotel.noOfRoomsBooked);
            }
        }
        return c;
    }
    public static Hotel searchHotelByWifiOption(Hotel[] hotels,String wifiOption)
    {

        ArrayList<Hotel> res=new ArrayList<>();
        for(Hotel hotel:hotels)
        {
            if(hotel.wifiFacility.equalsIgnoreCase(wifiOption))
            {
                res.add(hotel);
            }
        }
        Collections.sort(res,(a,b)->(int)(b.totalBill-a.totalBill));
        if(res.size()>0)
        {
            return res.get(1);
        }
        return null;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Hotel[] hotels=new Hotel[4];
        for(int i=0;i<4;i++)
        {
         
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String dateOfBooking=sc.nextLine();
            String noOfRoomsBooked=sc.nextLine();
            String wifiFacility=sc.nextLine();
            double totalBill=sc.nextDouble();
            hotels[i]=new Hotel(id, name, dateOfBooking, noOfRoomsBooked, wifiFacility, totalBill);
        }
        sc.nextLine();
        String param1=sc.nextLine();
        String param2=sc.nextLine();
        int res1=noOfRoomsBookedInGivenMonth(hotels, param1);
        Hotel res2=searchHotelByWifiOption(hotels, param2);
        if(res1!=0)
        {
            System.out.println(res1);
        }
        else{
            System.out.println("No room booked for the given month");
        }
        if(res2!=null)
        {
            System.out.println(res2.hotelId);
        }
        else{
            System.out.println("No Hotel");
        }
    }
}
