package Interfaces;

import Classes.Actor;

/**
 * Интерфейс для определения поведения лиента.
 */
public interface iActorBehaviour{


    /**
     * Проверяет, забрал ли клиент заказ.
     * @return True, если клиент забрал заказ, в противном случае - false.
     */
    public boolean isTakeOrder();

    /**
     * Проверяет, сделал ли клиент заказ.
     * @return True, если клиент сделал заказ, в противном случае - false.
     */
    public boolean isMakeOrder();

    /**
     * Устанавливает статус для получения заказа.
     * @param val Устанавливаемое значение.
     */
    public void setTakeOrder(boolean val);

    /**
     * Устанавливает статус для создания заказа.
     * @param val Устанавливаемое значение.
     */
    public void setMakeOrder(boolean val);

    /**
     * Получает клиента.
     * @return клиента.
     */
    public Actor geActor(); 
}
