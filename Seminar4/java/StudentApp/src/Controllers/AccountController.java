package Controllers;

import Domain.Person;
import Domain.Teacher;
import Domain.Worker;

import java.util.ArrayList;



public class AccountController {
    /**
     * Метод для выплаты зарплаты
     * @param person человек кторому надо выплатить зарплату
     * @param salar зарплата
     * @param <T> Обобщенный тип данных наследуемых от класса Worker
     * @param <V>
     */
    public static <T extends Worker,V> void paySalary(T person, V salar) {
        System.out.println(person.getName()  + " выплачена зарплата "+salar);
    }

    /**
     * Метод для вычисления среднего возраста списка людей
     * @param listPersons список людей
     */
    public static <T extends Person> void averageAge (ArrayList<T> listPersons) {
        double summ = 0;
        for (Person person: listPersons) {
            summ += person.getAge();
        }
        System.out.println("Средний возраст: " + summ / listPersons.size());
    }
    // public void paySalary(Teacher person, int salar)
    // {
    //     System.out.println(person.getName()  + " выплачена зарплата "+salar);
    // }

    // public void paySalary(Student person, int salar)
    // {
    //     System.out.println(person.getName()  + " выплачена зарплата "+salar);
    // }
}
