import javax.print.DocFlavor.STRING;

class Hotel implements Comparable<Hotel>{
  
  private int id;
  private String name;
  private String cabfacility;
  private int rating;
  private int fees;
 
  Hotel(int id,String name,String cabfacility,int rating,int fees)
  {
    this.id=id;
    this.name=name;
    this.cabfacility=cabfacility;
    this.rating=rating;
    this.fees=fees;
  }
  public int getRating()
  {
    return rating;
  }
  @Override
  public int compareTo(Hotel b) {
   
    return b.rating-this.rating;
  }
  
  public String toString(){
    return id+" "+name+" "+rating+" "+cabfacility+" "+fees;
  }



}