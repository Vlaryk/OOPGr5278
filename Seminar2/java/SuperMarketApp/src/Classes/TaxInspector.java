package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Представляет инспектора, реализующего интерфейс iActorBehaviour.
 */
public class TaxInspector implements iActorBehaviour, iReturnOrder {
    private String name;
    private boolean isTakeOrder;
    private boolean isRequestedReturn;
    private boolean isMakeOrder;
    private boolean isReturnOrder;

    /**
     * Конструктор для класса TaxInspector.
     * Устанавливает имя инспектора по умолчанию.
     */
    public TaxInspector() {
        this.name = "Tax audit";
    }

    /**
     * Получает имя инспектора.
     * @return Имя инспектора.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Проверяет, забрал ли инспектор заказ.
     * @return True, если инспектор забрал заказ, в противном случае - false.
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Проверяет запросил ли инспектор возврат?
     * @return True, если инспектор запросил возврат, в противном случае - false.
     */
    @Override
    public boolean isRequestedReturn() {return isRequestedReturn;}

    /**
     * Проверяет, сделал ли инспектор заказ.
     * @return True, если инспектор сделал заказ, в противном случае - false.
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Проверяет вернул ли инспектор заказ?
     * @return True, если инспектор вернул заказ, в противном случае - false.
     */
    @Override
    public boolean isReturnOrder() {return isReturnOrder; }


    /**
     * Устанавливает статус забрал ли заказ инспектор.
     * @param val Устанавливаемое значение.
     */
    @Override
    public void setTakeOrder(boolean val) {
       this.isTakeOrder = val;
    }

    /**
     * устанавливает статус возврата товара.
     */
    @Override
    public void setReturnOrder(boolean val) { this.isReturnOrder = val;}

    /**
     * Устанавливает статус сделал ли заказ инспектор.
     * @param val Устанавливаемое значение.
     */
    @Override
    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }

    /**
     * устанавливает статус запроса на возврат.
     */
    @Override
    public void setRequestedReturn(boolean val){ this.isRequestedReturn = val;}

    /**
     * Создает объект Actor для инспектора.
     * @return Объект Actor.
     */
    @Override
    public Actor geActor() {
        return new OrdinaryClient(name);
    }



}
