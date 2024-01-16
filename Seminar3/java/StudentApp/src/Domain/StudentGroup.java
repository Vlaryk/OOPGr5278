package Domain;

import java.util.Iterator;
import java.util.List;


/**
 * Класс StudentGroup, который описывает группу студента
 */
public class StudentGroup  implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;
    int totalStudents;


    /**
     * Конструктор класса StudentGroup c параметрами group и idGroup
     * @param group - список студентов
     * @param idGroup - id группы
     */
    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
        totalStudents = group.size();
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

     @Override
    public String toString() {
        return "StudentGroup{ id Группы: " + idGroup + ", Количество студентов: " + totalStudents + ", Список студентов: " + group;
    }


     @Override
    public Iterator<Student> iterator() {
       return new StudentIterator(group);
        
    }


    @Override
    public int compareTo(StudentGroup o) {
        if (group.size() == o.group.size()){
            if (this.getIdGroup().equals(o.getIdGroup())) {
                return 0;
            }
            if (this.getIdGroup() > o.getIdGroup()) {
                return 1;
            }
            return -1;
        }
        if (group.size() > o.group.size()){
            return 1;
        }
        return -1;
    }
}
