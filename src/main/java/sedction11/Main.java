package sedction11;

public class Main {

    public static void main(String[] args) {

        StaticTest firstInstance = new StaticTest("1stInstance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());


        StaticTest secondInstance = new StaticTest("2ndInstance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());


    }
}
