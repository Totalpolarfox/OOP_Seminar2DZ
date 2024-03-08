public class Cat {
    private String name;
    private int appetite;
    private boolean satiety; // сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean isEnoughFood(Plate plate) { // достаточно ли еды
        return plate.getFood() >= this.appetite;
    }

    public void eat() { }

}
