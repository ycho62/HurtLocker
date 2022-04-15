import java.util.Objects;

public class Grocery {
    String name;
    String price;
    String type;
    String expiration;


    public Grocery(String name, String price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return "grocery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", expiration='" + expiration + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grocery)) return false;
        Grocery grocery = (Grocery) o;
        return Objects.equals(getName(), grocery.getName()) && Objects.equals(getPrice(), grocery.getPrice()) && Objects.equals(getType(), grocery.getType()) && Objects.equals(getExpiration(), grocery.getExpiration());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getType(), getExpiration());
    }
}
