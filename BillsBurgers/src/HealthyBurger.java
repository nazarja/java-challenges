public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price = 0;
    private double healthyExtra2Price = 0;


    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, "Brown rye", price);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price  = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price  = price;
    }

    @Override
    public double itemizeHamburger() {
        double price = super.itemizeHamburger();

        if (this.healthyExtra1Price > 0) {
            price +=  this.healthyExtra1Price;
            System.out.printf("Added %s for an extra %s%n", this.healthyExtra1Name, this.healthyExtra2Price);
        }
        if (this.healthyExtra2Price > 0) {
            price +=  this.healthyExtra2Price;
            System.out.printf("Added %s for an extra %s%n", this.healthyExtra2Name, this.healthyExtra2Price);
        }

        return price;
    }
}
