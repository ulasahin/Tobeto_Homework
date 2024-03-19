package udemy.users;

public class Certificate {
    private String certificateName;
    private String releaseDate;
    private int periodValidity_Month;

    public Certificate() {
    }

    public Certificate(String certificateName, String releaseDate, int periodValidity_Month) {
        this.certificateName = certificateName;
        this.releaseDate = releaseDate;
        this.periodValidity_Month = periodValidity_Month;
    }

    public String getCertificateName() {return certificateName;}

    public void setCertificateName(String certificateName) {this.certificateName = certificateName;}

    public String getReleaseDate() {return releaseDate;}

    public void setReleaseDate(String releaseDate) {this.releaseDate = releaseDate;}

    public int getPeriodValidity_Month() {return periodValidity_Month;}

    public void setPeriodValidity_Month(int periodValidity_Month) {this.periodValidity_Month = periodValidity_Month;}
}
