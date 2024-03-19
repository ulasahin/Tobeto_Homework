package udemy.users;

import javax.swing.*;

public class Admin extends User{
    private boolean admin;

    public Admin() {
        super();
    }

    public Admin(boolean admin) {
        this.admin = admin;
    }

    public Admin(int id, String fullName, String userName, String password, String email, int age, String phoneNumber
            , String address, String[] contentCart, String[] wishList, ImageIcon profileImage, int progress
            , String studentNotifications, String teacherNotifications, boolean admin) {
        super(id, fullName, userName, password, email, age, phoneNumber, address, contentCart, wishList, profileImage
                , progress, studentNotifications, teacherNotifications);
        this.admin = admin;
    }
    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
