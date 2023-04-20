package HW_OOP.HW1;

public class Product {
    String name;
    double callory;

    String param_name;
    Double param_callory;
    int param_price;

    /**
     * создаем два метода геттер(акцессер - получать доступ) и сеттер(мьютейтер - изменять)
     * они нужны для создания обёртки над нашим методом в виде поля
     */
    public double getCallory(){
       return callory;
    }
    public void setCallory(double Callory){
        if (Callory<=0)
            throw new RuntimeException("Некорректно введено кол-во каллорий");
        this.callory = Callory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
 * вызов секции инициализатора наших параметров
 * он отрабатывает первее наших конструкторов
 */
{
    System.out.println("Initializator");
    param_callory = 400.0;
    param_name = "Name";
    param_price = 123;
}
    /**
     * Пустой конструктор - БАЗОВЫЙ
     */
    public Product(){
        name = "Продукт";
        callory = 1.0;
    }

    /**
     * Конструктор с 1 параметром - Название продукта
     * @param inputName
     */
    public Product(String inputName){
        name = inputName;
    }

    /**
     *Конструктор с 2 параметрами - Название продукта и кол-во каллорий
     * @param inputName
     */
    public Product(String inputName, double inputCallory){
        /**
         * здесь прописываем исключения которые поможет пользователю не сломать нашу программу
         */
        if (inputName.length()<3)
            this.name = "Name";
        else
            this.name = inputName;
//        if (inputCallory<=50)
//            inputCallory = 100;
//        this.callory = inputCallory;
        if(inputCallory<=50)
            throw new RuntimeException("Некорректно введено кол-во каллорий");
        this.callory = inputCallory;
    }






    /**
     * вспомогательный метод возвращает информацию по объекту
     * @return Информация по продукту
     */
    String displayInfo(){
        return String.format("%s - %f", name,callory);

    }
       }

