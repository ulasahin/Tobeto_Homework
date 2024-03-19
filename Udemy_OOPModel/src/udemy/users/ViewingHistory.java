package udemy.users;

public class ViewingHistory {
    private String videoName;
    private String viewDateTime;

    public ViewingHistory() {
    }
    public ViewingHistory(String videoName, String viewDateTime) {
        this.videoName = videoName;
        this.viewDateTime = viewDateTime;
    }
    public String getVideoName() {return videoName;}

    public void setVideoName(String videoName) {this.videoName = videoName;}

    public String getViewDateTime() {return viewDateTime;}

    public void setViewDateTime(String viewDateTime) {this.viewDateTime = viewDateTime;}
}
