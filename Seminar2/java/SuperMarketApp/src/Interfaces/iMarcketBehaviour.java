package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * Интерфейс для определения поведения магазина
 */
public interface iMarcketBehaviour {

    /**
     * Метод для принятия клиента в магазин.
     */
    public void acceptToMarket(iActorBehaviour actor, boolean is);

    /**
     * Метод для выхода клиентов из магазина.
     */
    public void releseFromMarket(List<Actor> actors);

    /**
     * Метод для обновления состояния магазина.
     */
    public void update();
}
