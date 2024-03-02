package com.rico.latihanrecyclepakaji;

public class modelMakanan {
    int imageFood;
    String nameFood;

    String desFood;

    public modelMakanan(int imageFood, String nameFood, String desFood) {
        this.imageFood = imageFood;
        this.nameFood = nameFood;
        this.desFood = desFood;
    }

    public int getImageFood() {
        return imageFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public String getDesFood() {
        return desFood;
    }
}
