package BlackList;

public class Main2 {
    public static void main(String[] args) {
        class AbstractPhone{
            private int year;
            private String company;
            public AbstractPhone(int year){
                this.year = year;
            }
            private void openConnection(){
                //findComutator
                //openNewConnection...
            }
            public  void call(int outNumber){
                openConnection();
                System.out.println("Вызываю номер");
            }

            public  void ring(int inputNumber){
                System.out.println("Дзынь-дзынь");
            }
    }
}}

