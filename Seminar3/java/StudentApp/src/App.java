import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

/**
 * Главный класс приложения
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);
        Student s7 = new Student("Алексей",  20);
        Student s8 = new Student("Александр",  23);
        Student s9 = new Student("Петр",  23);
        Student s10 = new Student("Вячеслав",  20);

        List<Student> listStud1 = new ArrayList<>();
        List<Student> listStud2 = new ArrayList<>();
        List<Student> listStud3 = new ArrayList<>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s7);
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        listStud3.add(s8);
        listStud3.add(s9);
        listStud3.add(s10);


        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        StudentGroup group5278 = new StudentGroup(listStud2,5278);
        StudentGroup group3455 = new StudentGroup(listStud3,3455);

        List<StudentGroup> listGroup = new ArrayList<>();
        listGroup.add(group4580);
        listGroup.add(group5278);
        listGroup.add(group3455);

        StudentSteam steam1 = new StudentSteam(1,listGroup);


        Collections.sort(group4580.getGroup());
        Collections.sort(group5278.getGroup());
        Collections.sort(group3455.getGroup());

        for (StudentGroup sgr : steam1.getListGroup()) {
            System.out.println("Поток № " + steam1.getNumber() +" Группа № " + sgr.getIdGroup());
            for(Student std: sgr.getGroup())
            {
                System.out.println(std);
            }
        }
        System.out.println("\n==============================================\n");
        Collections.sort(steam1.getListGroup());

        for (StudentGroup sgr : steam1.getListGroup()) {
            System.out.println("Поток № " + steam1.getNumber() +" Группа № " + sgr.getIdGroup());
            for(Student std: sgr.getGroup())
            {
                System.out.println(std);
            }
        }

        System.out.println("\n" + group4580);
        System.out.println(steam1);
    }
}
