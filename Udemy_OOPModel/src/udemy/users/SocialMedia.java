package udemy.users;

public class SocialMedia {
    private String twitterURL;
    private String linkednURL;
    private String facebookURL;

    public SocialMedia() {
    }

    public SocialMedia(String twitterURL, String linkednURL, String facebookURL) {
        this.twitterURL = twitterURL;
        this.linkednURL = linkednURL;
        this.facebookURL = facebookURL;
    }

    public String getTwitterURL() {return twitterURL;}

    public void setTwitterURL(String twitterURL) {this.twitterURL = twitterURL;}

    public String getLinkednURL() {return linkednURL;}

    public void setLinkednURL(String linkednURL) {this.linkednURL = linkednURL;}

    public String getFacebookURL() {return facebookURL;}

    public void setFacebookURL(String facebookURL) {this.facebookURL = facebookURL;}
}
