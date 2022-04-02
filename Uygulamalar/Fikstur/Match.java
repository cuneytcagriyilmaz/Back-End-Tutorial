package Applications.Fikstur;

public class Match {
    private String homeTeam;
    private String guestTeam;

    public Match(String homeTeam, String guestTeam){
        this.guestTeam=guestTeam;
        this.homeTeam=homeTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(String guestTeam) {
        this.guestTeam = guestTeam;
    }
}
