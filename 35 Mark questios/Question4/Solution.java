package Question4;
import java.util.*;
public class Solution {
    public static int findAvgBudgetByDirector(Movie[] movies,String director){
        int s=0;
        int c=0;
        for(Movie movie:movies){
            if(movie.getDirector().equalsIgnoreCase(director)){
                s+=movie.getBudget();
                c++;
            }
        }
        if(c!=0)
            return s/c;
        return 0;
    }
    public static Movie getMovieByRatingBudget(Movie[] movies,int rating,int budget){
        for(Movie movie:movies){
            if(budget%rating==0 && movie.getRating()==rating && movie.getBudget()==budget ){
                return movie;
            }
        }
        return null;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Movie[] movies=new Movie[4];
        for(int i=0;i<4;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String director=sc.nextLine();
            int rating=sc.nextInt();
            int budget=sc.nextInt();
            movies[i]=new Movie(id,director,rating,budget);
        }
        sc.nextLine();
        String director=sc.nextLine();
        int rating=sc.nextInt();
        int budget=sc.nextInt();
        int ans=findAvgBudgetByDirector(movies,director);
        if(ans!=0){
            System.out.println(ans);
        }
        else{
            System.out.println("No such director");
        }
        Movie movie=getMovieByRatingBudget(movies,rating,budget);
        if(movie!=null){
            System.out.println(movie.getMovieId());
        }
        else{
            System.out.println("No such movie");
        }
    }
}
