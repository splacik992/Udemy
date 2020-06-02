package fun.abstrakcje;

public class Kwadrat extends Figura {
    @Override
    public void rysuj() {
        System.out.println("Rysuje kwadrat");
    }


    public int bok(int a){
        return a;
    }

    @Override
    public void obliczPole() {
        System.out.println("Obliczam pole kwadratu");

    }
}
