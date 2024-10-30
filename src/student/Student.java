package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private int[] rates = new int[5];

    //список студентов
    private static List<Student> studentsList = new ArrayList<>(1);


    public Student(String name, int group, int course, int[] rates) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rates = rates;
        studentsList.add(this);
    }

    // блок инициализации для проверки того,
    // чтобы значения group, course не были меньше 0
    // и оценки в массиве rates не было меньше 2.0
    {
        for (Student stud : studentsList) {
            if (stud.group < 0) {
                stud.group = 1;
            }

            if (stud.course < 0) {
                stud.course = 1;
            }

            for (int i = 0; i < stud.rates.length; i++) {
                if (stud.rates[i] < 2) {
                    stud.rates[i] = 2;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", rates=" + Arrays.toString(rates) +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public double getRates(int subject) {
        return rates[subject];
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static List<Student> getStudentsList() {
        return studentsList;
    }

    //метод для получения средней оценки
    //использую double, чтобы получить более точное число
    public double getAverageOfRates() {
        double sumOfRates = 0;
        double rateInDouble;
        double averageOfRates;
        for (int i = 0; i < rates.length; i++) {
            rateInDouble = Double.valueOf(getRates(i));
            sumOfRates += rateInDouble;
        }
        averageOfRates = sumOfRates / rates.length;
        return averageOfRates;
    }

    //метод для определения отчисления/перехода на другой курс
    public static void deleteOrFurther() {
        List<Student> toRemove = new ArrayList<Student>();
        for (Student stud : studentsList) {
            if (stud.getAverageOfRates() < 3) {
                toRemove.add(stud);
            } else if (stud.getAverageOfRates() >= 3) {
                int newCourse = 0;
                newCourse = stud.getCourse() + 1;
                stud.setCourse(newCourse);
            }
        }
        studentsList.removeAll(toRemove);
    }

    //метод вывода студентов, обучающихся на указанном курсе
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты, обучающиеся на " + course + " курсе:");
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println("Имя студента: " + s.getName());
            }
        }
    }
}
