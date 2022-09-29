package Rectangle;

public class Bai5V2 {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Bai5V2(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
}
