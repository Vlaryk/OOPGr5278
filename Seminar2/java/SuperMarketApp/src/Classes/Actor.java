package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Абстрактый класс, представляющий клиента
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * Конструктор для создания нового действующего лица с заданным именем.
     * @param name имя клиента
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Абстрактный метод для получения имени клиента.
     * @return имя клиента
     */
    public abstract String getName();

    /**
     * Абстрактный метод для установки имени клиента.
     * @param name новое имя клиента
     */
    public abstract void setName(String name);
}
