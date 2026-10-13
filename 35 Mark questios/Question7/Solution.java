package Question7;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        NevelVessel[] vessels=new NevelVessel[4];
        for(int i=0;i<4;i++)
        {
            vessels[i]=new NevelVessel();
            vessels[i].vesselId=sc.nextInt();
            sc.nextLine();
            vessels[i].vesselName=sc.nextLine();
            vessels[i].noOfVoyagesPlanned=sc.nextInt();
            vessels[i].noOfVoyagesCompleted=sc.nextInt();
            sc.nextLine();
            vessels[i].purpose=sc.nextLine();
        }

        int percentage=sc.nextInt();
        
        int avgVoyages=findAvgVoyagesByPct(vessels,percentage);
        System.out.println(avgVoyages);
    }
    public static int findAvgVoyagesByPct(NevelVessel[] vessels,int percentage)
    {
        int totalVoyages=0;
        int count=0;
        for(NevelVessel vessel:vessels)
        {
            int percentvoyage=(vessel.noOfVoyagesCompleted*100)/vessel.noOfVoyagesPlanned;
            if(percentvoyage>=percentage)
            {
                totalVoyages+=vessel.noOfVoyagesCompleted;
                count++;
            }

        }
        if(count>0)
        {
            return totalVoyages/count;
        }
        return 0;
    }
    
    
}
