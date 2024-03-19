package udemy;

public class Comment {
    private String commentUser;
    private int commentScore;
    private String comment;

    public Comment() {
    }

    public Comment(String commentUser, int commentScore, String comment) {
        this.commentUser = commentUser;
        this.commentScore = commentScore;
        this.comment = comment;
    }

    public String getCommentUser() {return commentUser;}

    public void setCommentUser(String commentUser) {this.commentUser = commentUser;}

    public int getCommentScore() {return commentScore;}

    public void setCommentScore(int commentScore) {this.commentScore = commentScore;}

    public String getComment() {return comment;}

    public void setComment(String comment) {this.comment = comment;}
}
