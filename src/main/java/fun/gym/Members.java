package fun.gym;

import java.util.ArrayList;

public class Members {

    private String name;
    private double age;
    private ArrayList<Exercises> exercises;
    private ArrayList<Members> members;

    public Members(String name, double age, String male) {
        this.name = name;
        this.age = age;
        this.exercises = new ArrayList<Exercises>();
        this.members = new ArrayList<Members>();
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public ArrayList<Exercises> getExercises() {
        return exercises;
    }

    private boolean addMember(String name) {
        if (findMember(name) == null) {
            System.out.println("Member is not on the list");
            return false;
        } else {
            return true;
        }
    }

    public Members findMember(String name) {
        for (Members member : this.members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public boolean addExercise(String nameOfExercise, double priceofExercise) {
        if (findExercise(nameOfExercise) == null) {
            this.exercises.add(new Exercises(nameOfExercise, priceofExercise));
            return true;
        }
        return false;
    }

    public Exercises findExercise(String nameOfExercise) {
        for (Exercises exercises : this.exercises) {
            if (exercises.getNameOfExercise().equals(nameOfExercise)) {
                return exercises;
            }
        }
        return null;
    }


}
