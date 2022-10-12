public class Main {

    public static void main(String[] args) {
        
        /**
         * Objects
         */
        Programmer programmer = new Programmer("Bekbolot","Programmer","Peaksoft");
        Dancer dancer = new Dancer("Michael Jackson","Dancer","The king of dancer");
        Singer singer = new Singer("Adil","Singer","Skryptonite");


        /**
         * class Programmer
         */
        System.out.println("'Programmer'");
        System.out.println(programmer);
        System.out.println("\nWhat does a Bekbolot do?");
        programmer.learn();
        programmer.eat();
        programmer.walk();
        programmer.coding();


        /**
         * class Dancer
         */
        System.out.println("\n"+"'Dancer'");
        System.out.println(dancer+"\n");
        dancer.learn();
        dancer.eat();
        dancer.walk();
        dancer.dancing();


        /**
         * class Singer
         */
        System.out.println("\n"+"'Singer'");
        System.out.println(singer+"\n");
        singer.learn();
        singer.eat();
        singer.walk();
        singer.singing();
        singer.playGitar();
    }
}