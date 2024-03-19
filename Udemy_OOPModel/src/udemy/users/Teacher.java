package udemy.users;

import javax.swing.*;

public class Teacher extends User {
    private String[] educationalContent;
    private boolean teacher;

    public Teacher() {
        super();
    }

    public Teacher(String[] educationalContent, boolean teacher) {
        this.educationalContent = educationalContent;
        this.teacher = teacher;
    }

    public Teacher(int id, String fullName, String userName, String password, String email, int age, String phoneNumber
            , String address, String[] contentCart, String[] wishList, ImageIcon profileImage, int progress
            , String studentNotifications, String teacherNotifications, String[] educationalContent, boolean teacher) {
        super(id, fullName, userName, password, email, age, phoneNumber, address, contentCart, wishList, profileImage
                , progress, studentNotifications, teacherNotifications);
        this.educationalContent = educationalContent;
        this.teacher = teacher;
    }

    public String[] getEducationalContent() {
        return educationalContent;
    }

    public void setEducationalContent(String[] educationalContent) {
        this.educationalContent = educationalContent;
    }

    public boolean isTeacher() {
        return teacher;
    }

    public void setTeacher(boolean teacher) {
        this.teacher = teacher;
    }
}
