import java.util.*;
public class Buisness {
    public Chair findMostExpensiveChair(List<Chair> chairs,String brand){
        Chair expensive=null;
        for(Chair chair:chairs)
        {
            if(chair.brand.brandName.equalsIgnoreCase(brand)&& (expensive==null || chair.price>expensive.price))
            {
                expensive=chair;
            }
        }

        return expensive;
    }
    public List<Chair> calculateDiscountPrice(List<Chair> chairs,String brand,int discount)
    {
        List<Chair> ans=new ArrayList<>();
        for(Chair chair:chairs)
        {
            if(chair.brand.brandName.equalsIgnoreCase(brand))
            {
                chair.price=chair.price-(chair.price*discount/100);
                ans.add(chair);
            }
        }
        if(ans.size()>0)
        {
            return ans;
        }
        return null;
    }
}
