public class Cat extends BaseCat{

    private boolean satiety; // сытость

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(String name, int appetite) {
        super(name, appetite);
    }

    public boolean isEnoughFood(Plate plate) { // достаточно ли еды
        return plate.getFood() >= this.appetite;
    }

    public void eat(Plate plate) {
        if (isEnoughFood(plate)) {
        plate.removeFood(appetite);
        satiety = true;
        }
    }

}
