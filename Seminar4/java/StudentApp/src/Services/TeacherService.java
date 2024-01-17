package Services;

import Domain.PersonComparator;
import Domain.Student;
import Domain.Teacher;

import java.util.ArrayList;
import java.util.List;


/**
 * Класс TeacherService обслуживающий усчителей
 */
public class TeacherService implements iPersonService<Teacher> {


    //Список учителей
    private List<Teacher> teachers;
    //Считает количество учителей в списке учителей
    private int count;


    /**
     * Коструктор класса TeacherService
     */
    public TeacherService() {
        teachers = new ArrayList<>();
    }

    /**
     * @return возвращает список учителей
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * Создает Учителя и добавляет в список
     * @param name - имя учителя
     * @param age - возраст учителя
     */
    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "Доцент");
        count++;
        teachers.add(teacher);
    }

    /**
     * Сортирует список учителей
     */
    public void sortByFIO()
    {
        PersonComparator<Teacher> teacherComp = new PersonComparator<>();
        teachers.sort(teacherComp);
    }
}
