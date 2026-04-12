import java.util.*;
public class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Chair> chairs=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int bid=sc.nextInt();
            sc.nextLine();
            String bname=sc.nextLine();
            double brating=sc.nextDouble();
            Brand b=new Brand(bid,bname,brating);
            int cid=sc.nextInt();
            sc.nextLine();
            String ctype=sc.nextLine();
            double cprice=sc.nextDouble();
            chairs.add(new Chair(cid, ctype, cprice, b));
        }
        sc.nextLine();
        String param1=sc.nextLine();
        String param2=sc.nextLine();
        int discount=sc.nextInt();
        Buisness b=new Buisness(); 
        Chair res1=b.findMostExpensiveChair(chairs, param1);
        List<Chair> res2=b.calculateDiscountPrice(chairs, param2, discount);
        if(res1!=null)
        {
            System.out.println("Most Expensive Chair: "+res1.type+"(Rs. "+res1.price+") by Brand: "+param1);
        }
        else{
            System.out.println("Matching brand is not available in the list");
        }
        System.out.println();
        if(res2!=null)
        {
            System.out.println("Discounted"+param2+"Chairs:");
            int c=0;
            for(Chair chair:res2)
            {
                c++;
                if(c==res2.size())
                System.out.print("BrandName: "+param2+", Type: "+chair.type+", Updated Price: "+chair.price);
                else{
                    System.out.println("BrandName: "+param2+", Type: "+chair.type+", Updated Price: "+chair.price);
                }

            }
        }
        else{
            System.out.print("Discounted chairs are unavailable in the given brand.");
        }
    }
}
