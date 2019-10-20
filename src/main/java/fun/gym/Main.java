package fun.gym;

import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        int action = scanner.nextInt();

        boolean quit = false;

        while (!quit) {
            switch (action) {

                case 1 :
                    showGymExercisesAndMembers();
                    break;

                case 2:
                    addNewMember();
                    break;

                case 3:
                    removeMember();
                    break;
                case 4:
                    changeMemberExercise();
                    break;
                case 5:

                    break;

                case 0:
                    quit = true;
                    break;
            }
        }


    }


    private static void showGymExercisesAndMembers() {
        System.out.println("All of the exercises and members :");
    }
}
