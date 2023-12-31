package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarcketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс, представляющий поведение магазина.
 */
public class Market implements iMarcketBehaviour,iQueueBehaviour {
    private List<iActorBehaviour> queue;
    private List<iReturnOrder> queueForReturn;

    /**
     * Конструктор для создания нового магазина.
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
        this.queueForReturn = new ArrayList<iReturnOrder>();
    }

    /**
     * Метод для принятия клиента в магазин.
     * @param actor Клиент, который пришел в магазин.
     * @param bool Будет ли клиент возвращать товар.
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor, boolean bool) {
        System.out.println(actor.geActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor,bool);
    }

    /**
     * Метод для добавления клиента в очередь.
     * @param actor Клиент, который добавляется в очередь
     */
    @Override
    public void takeInQueue(iActorBehaviour actor, boolean bool) {
        this.queue.add(actor);
        System.out.println(actor.geActor().getName() + " клиент добавлен в очередь ");
        if(bool)
            this.queueForReturn.add((iReturnOrder) actor);

    }


    /**
     * Метод для выхода клиентов из магазина.
     * @param actors список клиентов
     */
    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
            queueForReturn.remove(actor);
        }

    }

    /**
     * Метод для обновления состояния магазина.
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        takeRequestReturn();
        takeReturnedOrder();
        releaseFromQueue();

    }

    /**
     * Метод для выдачи заказов клиентам.
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void takeReturnedOrder() {
        for (iReturnOrder actor : queueForReturn) {
            if (actor.isRequestedReturn()) {
                actor.setReturnOrder(true);
                System.out.println(actor.geActor().getName() + " клиент вернул свой заказ ");
            }
        }
    }



    /**
     * Метод для выхода клиентов из очереди.
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.geActor());
                System.out.println(actor.geActor().getName() + " клиент ушел из очереди ");
            }
        }
        releseFromMarket(releaseActors);
    }

    /**
     * Метод для принятия заказов от клиентов.
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент сделал заказ ");


            }
        }

    }

    @Override
    public void takeRequestReturn() {
        for (iReturnOrder actor : queueForReturn) {
            if (!actor.isReturnOrder()) {
                actor.setRequestedReturn(true);
                System.out.println(actor.geActor().getName() + " клиент сделал запрос на возврат заказа");
            }
        }
    }
}
    

