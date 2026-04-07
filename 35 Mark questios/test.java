import java.util.*;
class Player{
  private int playerId;
  private String playerName;
  private int runs;
  private String playerType;
  private String matchType;
  Player(int playerId,String playerName,int runs,String playerType,String matchType){
    this.playerId=playerId;
    this.playerName=playerName;
    this.runs=runs;
    this.playerType=playerType;
    this.matchType=matchType;
  }
  public int getPlayerId()
  {
    return playerId;
  }
  public String getplayerName()
  {
    return playerName;
  }
  public int getRuns(){
    return runs;
  }
  public String getPlayerType(){
    return playerType;
  }
  public String getMatchType(){
    return matchType;
  }
} 

class test{
  
  public static int findPlayerWithLowestRuns(Player[] players,String playerType){
    int min=Integer.MAX_VALUE;
    for(Player player:players){
        if(player.getPlayerType().equalsIgnoreCase(playerType) && player.getRuns()<min){
            min=player.getRuns();
        }   
    }
    if(min!=Integer.MAX_VALUE)
      return min;
    return 0;
  }

  
  public static Player[] findPlayerByMatchType(Player[] players,String matchType){
    ArrayList<Player> ans=new ArrayList<>();
    for(Player player:players)
    {
      if(player.getMatchType().equalsIgnoreCase(matchType)){
         ans.add(player);
         }
    }
    if(ans.size()!=0)
    {
      Player[] res=new Player[ans.size()];
      int i=0;
      for(Player player:ans)
      {
        res[i]=ans.get(i);
        i++;
      }
      Arrays.sort(res,(a,b)->b.getPlayerId()-a.getPlayerId());
      return res;
    }
    return null;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Player[] players=new Player[4];
    for(int i=0;i<4;i++)
    {
      int id=sc.nextInt();
      String name=sc.next();
      int runs=sc.nextInt();
      String pt=sc.next();
      String mt=sc.next();
      players[i]=new Player(id,name,runs,pt,mt);
    }
    String playerType=sc.next();
    String matchType=sc.next();
    int run=findPlayerWithLowestRuns(players,playerType);
    if(run!=0)
    {
      System.out.println(run);
    }
    else
    {
    System.out.println("No such player");
    }
    
    Player[] ans=findPlayerByMatchType(players,matchType);
    if(ans!=null)
    {
      for(Player player:ans)
      {
        System.out.println(player.getPlayerId());
      }
    }
    else
    {
    System.out.println("No Player with given matchType");
    }
    
  }
  
}