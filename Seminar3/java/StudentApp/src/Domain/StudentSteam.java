package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс StudentSteam описывающий поток студентов
 */
public class StudentSteam implements Iterable {
    private int number;
    private List<StudentGroup> listGroup;
    private int totalGroups;


    /**
     * Контсруктор класса StudentSteam с параметрами number и listGroup
     * @param number
     * @param listGroup
     */
    public StudentSteam (int number, List<StudentGroup> listGroup) {
        this.number = number;
        this.listGroup = listGroup;
        totalGroups = listGroup.size();

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setListGroup(List<StudentGroup> listGroup) {
        this.listGroup = listGroup;
    }

    public List<StudentGroup> getListGroup() {
        return listGroup;
    }

    @Override
    public String toString() {
        StringBuilder listStudents = new StringBuilder();
        for (StudentGroup i : getListGroup()) {
            for (Student j : i) {
                if (listStudents.isEmpty()) {
                    listStudents.append(" ").append(j.getName()).append(" - id группы : ").append(i.getIdGroup());
                }
                else {
                    listStudents.append(", ").append(j.getName()).append(" - id группы : ").append(i.getIdGroup());
                }
            }
        }
        return "StudentSteam{ Номер потока: " + number + ", количество групп: " + totalGroups + ", Список студентов:" + listStudents ;
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(listGroup);
    }
}
