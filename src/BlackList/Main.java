package BlackList;

public class Main {

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

        /**Инкапсульяция - базовый тип ООП при котором атрибуты и поведение
         * объекта объединяются в одном классе, внутренняя реализация объекта
         * скрывается от пользователя, а для работы с объектом предоставляется открытый интерфейс.
          */
        /**
         * нам нужно дать пользователю только возможность работы с программой, а не возможность её редактирования
         */
        /**
         * это возможно при использовании модификаторов доступа private, protected, public, а также default
         */
            }
     abstract class WirelessPhone extends AbstractPhone {

        private int hour;

        public WirelessPhone(int year, int hour) {
            super(year);
            this.hour = hour;
        }

        }
     class CellPhone extends  WirelessPhone{
        public CellPhone(int year, int hour){
            super(year, hour);


        }

        @Override
        public void call(int outNumber) {
            System.out.println("Вызываю номер " + outNumber);
        }

        @Override
        public void ring(int inputNumber) {
            System.out.println("Вам звонит абонент " + inputNumber);
        }
    }
     class Smartphone extends CellPhone {

        private String operationSystem;

        public Smartphone(int year, int hour, String operationSystem) {
            super(year, hour);
            this.operationSystem = operationSystem;
        }
        public void install(String program){
            System.out.println("Устанавливаю " + program + "для" + operationSystem);
        }

    }
     class User{
        private String name;
        public User(String name){
            this.name = name;
        }
        public void callAnotherUser(int number, AbstractPhone phone){
// вот он полиморфизм - использование в коде абстактного типа AbstractPhone phone!
            phone.call(number);
        }
    }
 class ThomasEdisson extends AbstractPhone{
        public ThomasEdisson(int year){
            super(year);
        }

    @Override
    public void call(int outNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }

}
     class Phone extends AbstractPhone {

        public Phone(int year) {
            super(year);
        }

        @Override
        public void call(int outputNumber) {
            System.out.println("Вызываю номер" + outputNumber);
        }

        @Override
        public void ring(int inputNumber) {
            System.out.println("Телефон звонит");
        }
    }
    class VideoPhone extends AbstractPhone {

        public VideoPhone(int year) {
            super(year);
        }
        @Override
        public void call(int outputNumber) {
            System.out.println("Подключаю видеоканал для абонента " + outputNumber );
        }
        @Override
        public void ring(int inputNumber) {
            System.out.println("У вас входящий видеовызов..." + inputNumber);
        }
    }

        AbstractPhone firstPhone = new ThomasEdisson(1879);
        AbstractPhone phone = new Phone(1984);

        AbstractPhone videoPhone=new VideoPhone(2018);
        User user = new User("Андрей");
        user.callAnotherUser(224466,firstPhone);
// Вращайте ручку
//Сообщите номер абонента, сэр
        user.callAnotherUser(224466,phone);
//Вызываю номер 224466
        user.callAnotherUser(224466,videoPhone);
//Подключаю видеоканал для абонента 224466
}}

