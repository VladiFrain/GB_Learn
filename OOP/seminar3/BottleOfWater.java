package OOP.seminar3;

public class BottleOfWater extends Product {
    private int volume;

    public BottleOfWater(String name, double cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Вода : название = " + super.getName() + ", " + "объем = " + this.volume + ", " +
                "цена = " + super.getCost();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BottleOfWater)) {
            return false;
        }

        BottleOfWater that = (BottleOfWater) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && getVolume() == that.getVolume();
    }
}