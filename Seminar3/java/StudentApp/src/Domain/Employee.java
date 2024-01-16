package Domain;


/**
 * Класс Employee, который описывает сотрудника
 */
public class Employee extends Person{
    private String special;

    /**
     * Конструктор класса Employee с параметрами firstName, age и special
     * @param firstName Имя сотрудника
     * @param age Возраст сотрудника
     * @param special Специальность сотрудника
     */
    public Employee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }
}
