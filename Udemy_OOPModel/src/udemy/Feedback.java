package udemy;

public class Feedback {
    private String feedbackUser;
    private String feedback;

    public Feedback() {
    }

    public Feedback(String feedbackUser, String feedback) {
        this.feedbackUser = feedbackUser;
        this.feedback = feedback;
    }

    public String getFeedbackUser() {return feedbackUser;}

    public void setFeedbackUser(String feedbackUser) {this.feedbackUser = feedbackUser;}

    public String getFeedback() {return feedback;}

    public void setFeedback(String feedback) {this.feedback = feedback;}
}
