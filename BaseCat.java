public class BaseCat {

    protected String name;
    protected int appetite;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseCat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
}
