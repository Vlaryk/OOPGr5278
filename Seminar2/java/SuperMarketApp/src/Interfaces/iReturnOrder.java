package Interfaces;

import Classes.Actor;

public interface iReturnOrder extends iActorBehaviour {

    /**
     * Проверяет запросил ли клиент возврат?
     * @return True, если клиент запросил возврат, в противном случае - false.
     */
    public boolean isRequestedReturn();

    /**
     * Проверяет вернул ли клиент заказ?
     * @return True, если клиент вернул заказ, в противном случае - false.
     */
    public boolean isReturnOrder();

    /**
     * устанавливает статус запроса на возврат.
     */
    public void setRequestedReturn(boolean val);

    /**
     * устанавливает статус возврата товара.
     */
    public void setReturnOrder(boolean val);

    /**
     * Получает клиента.
     * @return клиента.
     */
    public Actor geActor();
}
