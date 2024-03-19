package udemy.content;

import javax.swing.*;

public class Education {
    private String name;
    private boolean free;
    private int price;
    private ImageIcon educationImage;
    private String description;
    private int fullProgress;
    private String videoURL;

    public Education() {
    }
    public Education(String name, boolean free, int price, ImageIcon educationImage,String description
            ,int fullProgress,String videoURL) {
        this.name = name;
        this.free = free;
        this.price = price;
        this.educationImage = educationImage;
        this.description = description;
        this.fullProgress = fullProgress;
        this.videoURL = videoURL;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ImageIcon getEducationImage() {
        return educationImage;
    }

    public void setEducationImage(ImageIcon educationImage) {
        this.educationImage = educationImage;
    }

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public int getFullProgress() {return fullProgress;}

    public void setFullProgress(int fullProgress) {this.fullProgress = fullProgress;}

    public String getVideoURL() {return videoURL;}

    public void setVideoURL(String videoURL) {this.videoURL = videoURL;}
}
