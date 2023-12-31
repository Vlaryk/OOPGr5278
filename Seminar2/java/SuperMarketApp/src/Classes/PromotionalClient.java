package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class PromotionalClient implements iActorBehaviour, iReturnOrder {
    private String promotionName = "Скидка на все товары 5%";
    private int id;
    private static int totalParticipants = 0;
    private boolean isRequestedReturn;
    private boolean isReturnOrder;
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    /**
     * Конструктор для класса PromotionalClient.
     * @param name Имя акционного клиента.
     * @param id Id акционного клиентаю
     */
    public PromotionalClient (int id, String name) {
        this.name = name;
        this.id = id;
        totalParticipants ++;
    }

    /**
     * Возвращает количество участников акции.
     * @return количество участников акции.
     */
    public static int getTotalParticipants() {
        return totalParticipants;
    }

    /**
     * Проверяет, забрал ли акционный клиент заказ.
     * @return True, если акционный клиент забрал заказ, в противном случае - false.
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Проверяет, сделал ли акционный клиент заказ.
     * @return True, акционный клиент сделал заказ, в противном случае - false.
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Устанавливает статус для принятия заказа.
     * @param val Устанавливаемое значение.
     */
    @Override
    public void setTakeOrder(boolean val) {
        this.isTakeOrder = val;
    }

    /**
     * Устанавливает статус для создания заказа.
     * @param val Устанавливаемое значение.
     */
    @Override
    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }

    /**
     * Получает клиента.
     * @return клиента.
     */
    @Override
    public Actor geActor() {
        return new OrdinaryClient(name);
    }


    /**
     * Проверяет запросил акционный клиент возврат?
     * @return True, если акционный клиент запросил возврат, в противном случае - false.
     */
    @Override
    public boolean isRequestedReturn() {return isRequestedReturn;}

    /**
     * Проверяет вернул ли акционный клиент заказ?
     * @return True, если акционный клиент вернул заказ, в противном случае - false.
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
}
