package sedction11.theatreexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Amon", 10, 20);
//        theatre.getSeats();
        List<Theatre.Seat> seatscopy = new ArrayList<>(theatre.seats);
        printList(seatscopy);

        seatscopy.get(0).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("Seat reserved . Please pay");
        }else {
            System.out.println("Seat a already reserved");
        }

        Theatre.Seat minSeat = Collections.min(seatscopy);
        Theatre.Seat maxSeat = Collections.max(seatscopy);
        System.out.println("Min seat number is : " + minSeat.getSeatNumber());
        System.out.println("Max seat number is : " + maxSeat.getSeatNumber());


        Collections.shuffle(seatscopy);
        System.out.println("Printing shuffle seat copy");
        printList(seatscopy);

        sortList(seatscopy);
        System.out.println("Printing sorted seat copy");;
        printList(seatscopy);

    }

    public static void printList(List<Theatre.Seat> list ){

        for(Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber());
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");

    }

    public static void sortList(List<? extends Theatre.Seat> list){
        for (int i = 0; i <list.size() ; i++) {
            for (int j = i+1; j <list.size() ; j++) {
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }
}
