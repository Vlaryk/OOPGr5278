package Classes;

/**
 * Представляет особого клиента, который расширяет класс Actor и имеет дополнительное поле VIP-идентификатора.
 */
public class SpecialClient extends Actor {
    private boolean isRequestedReturn;
    private boolean isReturnOrder;
    private int idVIP;

    /**
     * Конструктор класса SpecialClient.
     * @param name Имя особого клиента.
     * @param idVIP VIP-идентификатор клиента.
     */
    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }


    /**
     * Проверяет, забрал ли клиент заказ.
     * @return True, если клиент взял заказ, в противном случае - false.
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Проверяет, сделал ли клиент заказ.
     * @return True, если клиент сделал заказ, в противном случае - false.
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder; 
    }

    /**
     * Устанавливает статус для принятия заказа.
     * @param val Устанавливаемое значение.
     */
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    /**
     * Устанавливает статус для создания заказа.
     * @param val Устанавливаемое значение.
     */
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;        
    }

    /**
     * Проверяет запросил VIP-клиент возврат?
     * @return True, если VIP-клиент запросил возврат, в противном случае - false.
     */
    @Override
    public boolean isRequestedReturn() {return isRequestedReturn;}

    /**
     * Проверяет вернул ли VIP-клиент заказ?
     * @return True, если VIP-клиент вернул заказ, в противном случае - false.
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
     * Получает Actor, связанного с особым клиентом.
     * @return Аctor, связанный с особым клиентом.
     */
    public Actor geActor() {
        return this;
    }

    /**
     * Получает имя особого клиента.
     * @return Имя особого клиента.
     */
    public String getName() {
        return super.name;
    }

    /**
     * Устанавливает имя особого клиента.
     * @param name Имя для установки особого клиента.
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }
}
