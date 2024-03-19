package udemy;

public class HelpCenter {
    private String[] SSS;
    private boolean supportRequest;

    public HelpCenter() {
    }

    public HelpCenter(String[] SSS, boolean supportRequest) {
        this.SSS = SSS;
        this.supportRequest = supportRequest;
    }

    public String[] getSSS() {return SSS;}

    public void setSSS(String[] SSS) {this.SSS = SSS;}

    public boolean isSupportRequest() {return supportRequest;}

    public void setSupportRequest(boolean supportRequest) {this.supportRequest = supportRequest;}
}
