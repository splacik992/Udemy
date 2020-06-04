package sedction11.Scope;

import java.util.Scanner;

public class X {

    private int x;

    public X(Scanner x) {
        System.out.println("Enter number : ");
        this.x = x.nextInt();
    }


    public void x(){

        for (int i = 1; i <13 ; i++) {
            System.out.println("Number " + i + " times " + this.x + " equals " + (i*this.x)) ;
        }
    }

}
