package Level3OOP;

public class Main {


    public static void main(String[] args) {

        Cars audi2 = new Cars();
        Cars bmw = new Cars();
        Cars audi = new Cars();

       audi2.setModel("e-tron");
       audi2.setCountry("USA");
       audi2.setMaker("Audi Group");

       bmw.setModel("i8");
       bmw.setCountry("Germany");
       bmw.setMaker("Bayerische Motoren Werke AG");

       audi.setModel("Q9");
       audi.setCountry("Germany");
       audi.setMaker("Volkswagen Group");

        System.out.println("Model : Audi " + audi2.getModel()
                + " Country: " + audi2.getCountry()
                + " Maker: " + audi2.getMaker());

        System.out.println("Model : bmw " + bmw.getModel()
                + " Country: " + bmw.getCountry()
                + " Maker: " + bmw.getMaker());

        System.out.println("Model : audi " + audi.getModel()
                + " Country: " + audi.getCountry()
                + " Maker: " + audi.getMaker());


    }
}