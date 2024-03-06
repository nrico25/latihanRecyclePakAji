package com.rico.latihanrecyclepakaji;

public class modelMakanan {
    String nameFood;
    String desFood;
    String imageUrl;

    public modelMakanan( String nameFood, String desFood, String imageUrl) {
        this.nameFood = nameFood;
        this.desFood = desFood;
        this.imageUrl = imageUrl;
    }



    public String getNameFood() {
        return nameFood;
    }

    public String getDesFood() {
        return desFood;
    }

    public String getImageUrl() {
        return imageUrl;
    }




}
