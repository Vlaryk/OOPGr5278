package Domain;

/**
 * Класс Teacher описывающий учителя
 */
public class Teacher extends Person{
    private String acadDegree;

    /**
     * Коструктор класса Teacher с папраметрами firstName, age и acadDegree
     * @param firstName
     * @param age
     * @param acadDegree
     */
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}
