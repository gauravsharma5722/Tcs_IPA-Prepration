package Question1;
class Cricketer{

    private int cricketerId;
    private int matchesPlayed;
    private int totalRuns;
    private String cricketerName;
    private String team;

    public Cricketer(int cricketerId, int matchesPlayed, int totalRuns, String cricketerName, String team) {
        this.cricketerId = cricketerId;
        this.matchesPlayed = matchesPlayed;
        this.totalRuns = totalRuns;
        this.cricketerName = cricketerName;
        this.team = team;
    }

    public int getCricketerId() {
        return cricketerId;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }
    public int totlRuns(){
        return totalRuns;
    }
    public String getCricketerName() {
        return cricketerName;
    }
    public String getTeam() {
        return team;
    }
    public void setCricketerId(int cricketerId) {
        this.cricketerId = cricketerId;
    }
    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }
    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }
    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }
    public void setTeam(String team) {
        this.team = team;
    }

}