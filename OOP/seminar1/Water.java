package OOP.seminar1;

public class Water extends Product {
    private Integer volume;

    public Water(String name, Double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }
}