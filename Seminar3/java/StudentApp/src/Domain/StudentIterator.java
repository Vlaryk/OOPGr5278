package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * ИтераторStudentIterator позволяющий перебирать сипсок объектов класса Student
 */
public class StudentIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;

    /**
     * Конструктор итератора StudentIterator с параметром students
     * @param students - список студентов
     */
    public StudentIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }
    
    @Override
    public boolean hasNext() {
       return counter<students.size();
    }
    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return students.get(counter++);        
    }
    
}

