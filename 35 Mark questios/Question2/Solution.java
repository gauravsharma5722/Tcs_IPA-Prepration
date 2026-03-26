import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static Hotel hotelByHighestRating(Hotel[] hotels,String cab)
    { 
        Arrays.sort(hotels);
        for(Hotel hotel:hotels)
        {
            if(hotel.getRating()>5 && hotel.toString().contains(cab))
            {
                return hotel;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hotel[] hotels=new Hotel[4];
        for(int i=0;i<4;i++)
        {
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String cabfacility=sc.nextLine();
            int rating=sc.nextInt();
            int fees=sc.nextInt();
            hotels[i]=new Hotel(id,name,cabfacility,rating,fees);
        }
        sc.nextLine();
        String cab=sc.nextLine();
        Hotel hotel=hotelByHighestRating(hotels,cab);
        if(hotel!=null)
        {
            System.out.println(hotel.getRating());
        }
        else
        {
            System.out.println("NO HOTEL WITH GIVEN FACILITY");
        }
    }
}
