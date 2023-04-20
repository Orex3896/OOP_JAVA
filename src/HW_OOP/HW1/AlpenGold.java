package HW_OOP.HW1;

public class AlpenGold {
    String name;
    double callory;

    public AlpenGold(){
        name = "Шоколадка";
        callory = 111.0;
    }

    /**
     * Конструктор с 1 параметром - Название продукта
     * @param inputName
     */
    public AlpenGold(String inputName){
        name = inputName;
    }

    /**
     *Конструктор с 2 параметрами - Название продукта и кол-во каллорий
     * @param inputName
     */
    public AlpenGold(String inputName, double inputCallory){
        /**
         * здесь прописываем исключения которые поможет пользователю не сломать нашу программу
         */
        if (inputName.length()<3)
            this.name = "Chocolate";
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
