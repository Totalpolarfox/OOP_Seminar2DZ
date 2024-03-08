public class Plate {

    private int food;

    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
   
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("Осталось в тарелке: " + food);
    }

    public void removeFood(int food) {
        if (this.food - food >= 0) {
            this.food -= food;
        } 
    }

    public void addFood(int food) {
        this.food += food;

}
