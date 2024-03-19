package udemy.users;

import javax.swing.*;

public class User {
    private int id;
    private String fullName;
    private String userName;
    private String password;
    private String email;
    private int age;
    private String phoneNumber;
    private String address;
    private String[] contentCart;
    private String[] wishList;
    private ImageIcon profileImage;
    private int progress;
    private String studentNotifications;
    private String teacherNotifications;

    public User() {
    }

    public User(int id, String fullName, String userName, String password, String email, int age
            , String phoneNumber, String address, String[] contentCart, String[] wishList
            , ImageIcon profileImage,int progress,String studentNotifications,String teacherNotifications) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.contentCart = contentCart;
        this.wishList = wishList;
        this.profileImage = profileImage;
        this.progress = progress;
        this.studentNotifications = studentNotifications;
        this.teacherNotifications = teacherNotifications;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getContentCart() {
        return contentCart;
    }

    public void setContentCart(String[] contentCart) {
        this.contentCart = contentCart;
    }

    public String[] getWishList() {
        return wishList;
    }

    public void setWishList(String[] wishList) {
        this.wishList = wishList;
    }

    public ImageIcon getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(ImageIcon prifleImage) {
        this.profileImage = prifleImage;
    }

    public int getProgress() {return progress;}

    public void setProgress(int progress) {this.progress = progress;}

    public String getStudentNotifications() {return studentNotifications;}

    public void setStudentNotifications(String studentNotifications) {this.studentNotifications = studentNotifications;}

    public String getTeacherNotifications() {return teacherNotifications;}

    public void setTeacherNotifications(String teacherNotifications) {this.teacherNotifications = teacherNotifications;}
}
