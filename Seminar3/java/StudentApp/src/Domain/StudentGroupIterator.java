package Domain;

import java.util.Iterator;
import java.util.List;


/**
 * Итератор StudentGroupIterator позволяющий перебирать список объектов класса StudentGroup
 */
public class StudentGroupIterator implements Iterator<StudentGroup> {
    private int counter;
    private List<StudentGroup> studentGroup;

    /**
     * Конструктор итератора StudentGroupIterator с параметром studentGroup
     * @param studentGroup - списос групп студентов
     */
    public StudentGroupIterator(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroup.size();
    }

    @Override
    public StudentGroup next() {
        return studentGroup.get(counter++);
    }
}
