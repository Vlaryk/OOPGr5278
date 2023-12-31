package Classes;

/**
 * Класс, представляющий обычного клиента.
 */
public class OrdinaryClient extends Actor {
    private boolean isRequestedReturn;
    private boolean isReturnOrder;

    /**
     * Конструктор для создания нового обычного клиента с заданным именем.
     * @param name Имя клиента
     */
    public OrdinaryClient(String name) {
        super(name);
    }

    /**
     * Метод для проверки, взял ли клиент заказ.
     * @return true, если клиент взял заказ, иначе false
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Метод для проверки, сделал ли клиент заказ.
     * @return true, если клиент сделал заказ, иначе false
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder; 
    }

    /**
     * Метод для установки значения флага "взял заказ".
     * @param val Значение флага
     */
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    /**
     * Метод для установки значения флага "сделал заказ".
     * @param val Значение флага
     */
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;        
    }

    /**
     * Проверяет запросил ли обычный клиент возврат?
     * @return True, если обычный клиент запросил возврат, в противном случае - false.
     */
    @Override
    public boolean isRequestedReturn() {return isRequestedReturn;}

    /**
     * Проверяет вернул ли обычный клиент заказ?
     * @return True, если обычный клиент вернул заказ, в противном случае - false.
     */
    @Override
    public boolean isReturnOrder() {return isReturnOrder; }

    /**
     * устанавливает статус запроса на возврат.
     */
    @Override
    public void setRequestedReturn(boolean val){ this.isRequestedReturn = val;}

    /**
     * устанавливает статус возврата товара.
     */
    @Override
    public void setReturnOrder(boolean val) { this.isReturnOrder = val;}

    /**
     * Метод для получения объекта клиента.
     * @return Объект клиента
     */
    public Actor geActor() {
        return this;
    }

    /**
     * Метод для получения имени клиента.
     * @return Имя клиента
     */
    public String getName() {
        return super.name;
    }

    /**
     * Метод для получения имени клиента.
     * @return Имя клиента
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }
}