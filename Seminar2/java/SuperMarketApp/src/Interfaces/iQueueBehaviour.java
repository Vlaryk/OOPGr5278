package Interfaces;

import Classes.Actor;
/**
 * Интерфейс для определения поведения очереди
 */
public interface iQueueBehaviour {

    /**
     * Метод для добавления клиента в очередь
     */
    public void takeInQueue(iActorBehaviour actor, boolean bool);

    /**
     * Метод для выхода клиентов из очереди
     */
    public void releaseFromQueue();

    /**
     * Метод для принятия заказов от клиентов
     */
    public void takeOrder ();

    /**
     * Метод для принятия запроса на возврат заказа от клиента.
     */
    public void takeRequestReturn();

    /**
     * Метод для выдачи заказов клиентам
     */
    public void giveOrder ();

    /**
     * Метод для принятия возврата от клиента.
     */
    public void takeReturnedOrder ();
}
