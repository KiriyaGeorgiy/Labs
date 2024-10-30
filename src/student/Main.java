package student;

public class Main {
    public static void main(String[] args) {
        Student studentOne = new Student("Олег Иванов", 1, 1, new int[]{3, 4, 5, 2, 2});
        Student studentTwo = new Student("Андрей Петров", 6, 4, new int[]{2, 2, 4, 5, 2});
        Student studentThree = new Student("Сергей Сидоров", 3, 2, new int[]{5, 5, 4, 3, 5});
        Student studentFour = new Student("Александр Попов", 9, 2, new int[]{4, 4, 4, 4, 5});
        Student studentFive = new Student("Евгений Бодров", 4, 3, new int[]{2, 3, 2, 3, 2});
        Student studentSix = new Student("Валерий Басков", 2, 5, new int[]{3, 4, 4, 5, 5});
        Student studentSeven = new Student("Никита Базавов", 8, 3, new int[]{5, 5, 5, 4, 5});
        Student studentEight = new Student("Филипп Багров", 10, 1, new int[]{3, 4, 4, 5, 5});
        Student studentNine = new Student("Даниил Фокин", 7, 3, new int[]{3, 2, 5, 5, 5});
        Student studentTen = new Student("Егор Кудрявцев", 5, 5, new int[]{4, 4, 5, 5, 3});


        Student.deleteOrFurther();
        Student.printStudents(Student.getStudentsList(), 6);
    }
}

