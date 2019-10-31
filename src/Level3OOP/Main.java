package Level3OOP;

public class Main {


    public static void main(String[] args) {

        Cars Audi = new Cars();
        Cars bmw = new Cars();
        Cars audi = new Cars();

       Audi.setModel("e-tron");
       Audi.setCountry("USA");
       Audi.setMaker("Audi Group");

       bmw.setModel("i8");
       bmw.setCountry("Germany");
       bmw.setMaker("Bayerische Motoren Werke AG");

       audi.setModel("Q9");
       audi.setCountry("Germany");
       audi.setMaker("Volkswagen Group");

        System.out.println("Model : Audi " + Audi.getModel()
                + " Country: " + Audi.getCountry()
                + " Maker: " + Audi.getMaker());

        System.out.println("Model : bmw " + bmw.getModel()
                + " Country: " + bmw.getCountry()
                + " Maker: " + bmw.getMaker());

        System.out.println("Model : audi " + audi.getModel()
                + " Country: " + audi.getCountry()
                + " Maker: " + audi.getMaker());


    }
}