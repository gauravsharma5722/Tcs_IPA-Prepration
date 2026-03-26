package Question3;

import java.util.*;

public class Solution {
    public static int findAgencyWithPackagePrice(TravelAgencies[] agencies){
        int max=Integer.MIN_VALUE;
        for(TravelAgencies agency:agencies)
        {
            if(agency.getPrice()>max)
            {
                max=agency.getPrice();
            }
        }
        return max;
    }
    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] agencies,int regNo,String packageType)
    {
        for(TravelAgencies agency:agencies)
        {
            if(agency.isFlightFacility() &&agency.getRegNo()==regNo && agency.getPackageType().equalsIgnoreCase(packageType))
            {
                return agency;
            }
        }
        return null;
    }
    public static void main(String[] args) {

        TravelAgencies[] agencies=new TravelAgencies[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            int regNo=sc.nextInt();
            sc.nextLine();
            String agencyName=sc.nextLine();
            String packageType=sc.nextLine();
            int price=sc.nextInt();
            boolean flightFacility=sc.nextBoolean();
            agencies[i]=new TravelAgencies(regNo,agencyName,packageType,price,flightFacility);
        }

        int regNo=sc.nextInt();
        sc.nextLine();
        String packageType=sc.nextLine();
        int maxPrice=findAgencyWithPackagePrice(agencies);
        if(maxPrice!=Integer.MIN_VALUE)
        {
            System.out.println(maxPrice);
        }
        else
        {
            System.out.println("No agency found with the given package price");
        }
        TravelAgencies agency=agencyDetailsForGivenIdAndType(agencies,regNo,packageType);
        if(agency!=null)
        {
            System.out.println(agency.getAgencyName()+" "+agency.getPrice());
        }
        else
        {
            System.out.println("No agency found with the given id and package type");
        }

        
    }
}
