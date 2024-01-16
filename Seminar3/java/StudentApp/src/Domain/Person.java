package Domain;

/**
 *  Абстрактный класс Person, описывающий человека
 */
public abstract class Person {
    private String name;
    private int age;

    /**
     * Конструктор класса Person с параметрами name и age
     * @param name Имя человека
     * @param age Возраст человека
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}


