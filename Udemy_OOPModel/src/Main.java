import udemy.*;
import udemy.users.PaymentMethod;
import udemy.content.Category;
import udemy.content.Education;
import udemy.users.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Education education = new Education("Java & Angular Eğitimi",true,0
                ,new ImageIcon("educationImage.png")
                ,"Bu eğitimde Java & Angular eğitimi verilecektir.",100
                ,"www.udemy.com/video-java-1");

        System.out.println(education.getName());
        System.out.println(education.getPrice());
        System.out.println(education.isFree());
        System.out.println(education.getEducationImage());
        System.out.println(education.getFullProgress());
        System.out.println(education.getVideoURL());

        User user = new User(1,"Canfer Ulaş Şahin","ulsahn","ulas1234"
                ,"ulsahn@gmail.com",23,"05312366216"
                ,"İstanbul",new String[]{"Python", "JavaScript"},new String[]{"HTML5","CSS"}
                ,new ImageIcon("profileImage.png"),50,""
                ,"Java dersiniz saat 13:00'da başlayacaktır.");

        System.out.println(user.getId());
        System.out.println(user.getFullName());
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        System.out.println(user.getEmail());
        System.out.println(user.getAge());
        System.out.println(user.getProfileImage());
        System.out.println(user.getPhoneNumber());
        System.out.println(user.getProgress());

        for (String contentCart : user.getContentCart()){
            System.out.println(contentCart);
        }
        for (String wishList : user.getWishList()){
            System.out.println(wishList);
        }

        Teacher teacher = new Teacher(2,"Engin Demiroğ","engndemrog"
                ,"engin123","engindemirog@gmail.com",32,"05322161115","İstanbul"
                ,new String[]{"",""},new String[]{"",""},new ImageIcon("profileImage2.png"),100
                ,"","",new String[]{"Java",".NET"},true);

        System.out.println(teacher.getId());
        System.out.println(teacher.getFullName());
        System.out.println(teacher.getUserName());
        System.out.println(teacher.getPassword());
        System.out.println(teacher.getEmail());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getProfileImage());
        System.out.println(teacher.getPhoneNumber());
        System.out.println(teacher.getProgress());
        for (String contentCart : teacher.getContentCart()){
            System.out.println(contentCart);
        }
        for (String wishList : teacher.getWishList()){
            System.out.println(wishList);
        }
        for (String eduContent : teacher.getEducationalContent()){
            System.out.println(eduContent);
        }

        Category category = new Category(102,"Yazılım Geliştirme");
        System.out.println(category.getId());
        System.out.println(category.getName());

        Admin admin = new Admin(true);
        System.out.println(admin.isAdmin());

        Certificate certificate = new Certificate("Java Eğitimi Katılım Sertifikası "
                ,"19.03.2024",12);
        System.out.println(certificate.getCertificateName());
        System.out.println(certificate.getReleaseDate());
        System.out.println(certificate.getPeriodValidity_Month());

        PaymentMethod paymentMethod = new PaymentMethod("Birincil Ödeme Yöntemi"
                ,"Kredi Kartı");
        System.out.println(paymentMethod.getPaymentName());
        System.out.println(paymentMethod.getPaymentType());

        ViewingHistory viewingHistory = new ViewingHistory("Java OOP","19.04.2024");
        System.out.println(viewingHistory.getVideoName());
        System.out.println(viewingHistory.getViewDateTime());

        Comment comment = new Comment("ulsahn",10
                ,"Bu eğitim 'Java OOP' mantığını çözmemde yardımcı oldu.");

        System.out.println(comment.getCommentUser());
        System.out.println(comment.getCommentScore());
        System.out.println(comment.getComment());

        SearchArea searchArea = new SearchArea("Java OOP");
        System.out.println(searchArea.getSearchContent());

        SocialMedia socialMedia = new SocialMedia("www.twitter.com","www.linkedn.com"
                ,"www.facebook.com");
        System.out.println(socialMedia.getFacebookURL());
        System.out.println(socialMedia.getLinkednURL());
        System.out.println(socialMedia.getTwitterURL());

        Feedback feedback = new Feedback("ulsahn","Videolarda donmalar oluyor.");
        System.out.println(feedback.getFeedbackUser());
        System.out.println(feedback.getFeedback());

        Setting setting = new Setting("Türkçe","Dark",true);
        System.out.println(setting.getLanguage());
        System.out.println(setting.getTheme());
        System.out.println(setting.isEmailNotifications());

        HelpCenter helpCenter = new HelpCenter(new String[]{"SSS"},true);
        System.out.println(helpCenter.isSupportRequest());
        for (String SSS : helpCenter.getSSS()){
            System.out.println(SSS);
        }
    }
}