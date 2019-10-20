package fun.gym;

import java.util.ArrayList;

public class Exercises {

    private String nameOfExercise;
    private double price;


    public Exercises(String nameOfExercise, double price) {
        this.nameOfExercise = nameOfExercise;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public String getNameOfExercise() {
        return nameOfExercise;
    }

    public void setNameOfExercise(String nameOfExercise) {
        this.nameOfExercise = nameOfExercise;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
