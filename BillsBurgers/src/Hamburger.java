public class Hamburger {

    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name = "";
    private String addition2Name = "";
    private String addition3Name = "";
    private String addition4Name = "";
    private double addition1Price = 0;
    private double addition2Price = 0;
    private double addition3Price = 0;
    private double addition4Price = 0;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        String listing = String.format("%s hamburger on a %s roll with %s, price is %s", this.name, this.breadRollType, this.meat, this.price);
        System.out.println(listing);

        if (this.addition1Price > 0) {
            this.price +=  this.addition1Price;
            System.out.printf("Added %s for an extra %s%n", this.addition1Name, this.addition1Price);
        }
        if (this.addition2Price > 0) {
            this.price +=  this.addition2Price;
            System.out.printf("Added %s for an extra %s%n", this.addition2Name, this.addition2Price);
        }
        if (this.addition3Price > 0) {
            this.price +=  this.addition3Price;
            System.out.printf("Added %s for an extra %s%n", this.addition3Name, this.addition3Price);
        }
        if (this.addition4Price > 0) {
            this.price +=  this.addition4Price;
            System.out.printf("Added %s for an extra %s%n", this.addition4Name, this.addition4Price);
        }

        return price;
    }
}
