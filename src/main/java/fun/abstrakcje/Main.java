package fun.abstrakcje;

public class Main {

    public static void main(String[] args) {
        Figura tt= new Trojkat();
        tt.rysuj();


        Trojkat t = new Trojkat();
        t.rysuj();
        t.komunikat("komunikat-trojkat");

        Kwadrat k = new Kwadrat();
        k.rysuj();
        k.obliczPole();
        System.out.println(k.komunikat("komunikat-kwadrat"));
        k.komunikat("komunikat-kwadrat");
    }

}
