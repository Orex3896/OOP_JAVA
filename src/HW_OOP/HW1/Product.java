package HW_OOP.HW1;

public class Product {
    String name;
    double callory;

    String param_name;
    Double param_callory;
    int param_price;
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
        name = inputName;
        callory = inputCallory;
    }






    /**
     * вспомогательный метод возвращает информацию по объекту
     * @return Информация по продукту
     */
    String displayInfo(){
        return String.format("%s - %f", name,callory);

    }
       }

