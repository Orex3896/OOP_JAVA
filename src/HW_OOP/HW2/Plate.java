package HW_OOP.HW2;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void info(){
        System.out.println("plate: " + food );
    }
}
