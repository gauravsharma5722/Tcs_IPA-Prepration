package Question4;

public class Movie {

    private int movieId;
    private String director;
    private int rating;
    private int budget;

    Movie(int movieId, String director,int rating,int budget){
        this.movieId=movieId;
        this.director=director;
        this.rating=rating;
        this.budget=budget;
    }
    public int getMovieId(){
        return movieId;
    }
    public String getDirector(){
        return director;
    }
    public int getRating(){
        return rating;
    }
    public int getBudget(){
        return budget;
    }
}
