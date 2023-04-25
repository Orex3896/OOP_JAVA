package HW_OOP.HW2_1;

public class Bowl {
    protected static int food;
    public void info() {
        System.out.println( food + "еды в миске.");
    }
    public int getFood(){
        return Bowl.food;
    }
    public void addFood(int food){
        Bowl.food = Bowl.food + food;
    }

    public void food(int food){
        Bowl.food =  food;
    }
    }
