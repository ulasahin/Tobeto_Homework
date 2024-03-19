package udemy;

public class Setting {
    private String language;
    private String theme;
    private boolean emailNotifications;

    public Setting() {
    }
    public Setting(String language, String theme, boolean emailNotifications) {
        this.language = language;
        this.theme = theme;
        this.emailNotifications = emailNotifications;
    }
    public String getLanguage() {return language;}

    public void setLanguage(String language) {this.language = language;}

    public String getTheme() {return theme;}

    public void setTheme(String theme) {this.theme = theme;}

    public boolean isEmailNotifications() {return emailNotifications;}

    public void setEmailNotifications(boolean emailNotifications) {this.emailNotifications = emailNotifications;}
}
