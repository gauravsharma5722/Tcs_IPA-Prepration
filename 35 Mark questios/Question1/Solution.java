package Question1;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static Cricketer getCricketerWithMinimumMatchesPlayed(Cricketer[] cricketers){
        int minMatchesPlayed = Integer.MAX_VALUE;
        Cricketer cricketerWithMinMatchesPlayed = null;

        for (Cricketer cricketer : cricketers) {
            if (cricketer.getMatchesPlayed() < minMatchesPlayed) {
                minMatchesPlayed = cricketer.getMatchesPlayed();
                cricketerWithMinMatchesPlayed = cricketer;
            }
        }

        return cricketerWithMinMatchesPlayed;
    }

    public static Cricketer searchCricketerByld(Cricketer[] cricketers, int cricketerId){
        for (Cricketer cricketer : cricketers) {
            if (cricketer.getCricketerId() == cricketerId) {
                return cricketer;
            }
        }
        return null; // Return null if no cricketer with the given ID is found
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Cricketer[] cricketers=new Cricketer[n];
        for(int i=0;i<n;i++)
        {
            int id=sc.nextInt();
            int mp=sc.nextInt();
            int tr=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String team=sc.nextLine();
            cricketers[i]=new Cricketer(id,mp,tr,name,team);
        }
        int searchId=sc.nextInt();
        Cricketer cricketerWithMinMatchesPlayed = getCricketerWithMinimumMatchesPlayed(cricketers);

        Cricketer searchedCricketer = searchCricketerByld(cricketers, searchId);
        System.out.println(cricketerWithMinMatchesPlayed.getCricketerId());
        if (searchedCricketer != null) {
            System.out.println(searchedCricketer.getCricketerId());
            System.out.println(searchedCricketer.getCricketerName());
        } else {
            System.out.println("No such Cricketer");
        }
    }
}
