package users;

import java.util.*;

public class User implements Comparable<User> {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String country;

    private static List<User> users = new ArrayList<>();

    public User(int id, String firstName, String lastName, int age, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        users.add(this);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public static List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "\nUser {" +
                "ID:" + id +
                ", Имя: " + firstName +
                ", Фамилия: " + lastName +
                ", Возраст: " + age +
                ", Страна: " + country +
                "}";
    }

    @Override
    public int compareTo(User o) {
        return this.getAge() - o.getAge();
    }

    public static void sortByAge(List<User> usersList) {
        usersList.sort(Comparator.comparing(User::getAge));
        System.out.println(usersList);
    }


    public static void sortByLastName(List<User> usersList) {
        usersList.sort(Comparator.comparing(User::getLastName));
        System.out.println(usersList);
    }


    public static void checkAge(List<User> usersList) {
        System.out.println("\n");
        usersList.stream()
                .filter(u -> u.getAge() < 7)
                .forEach(u -> {
                    System.out.println("Пользователь с ID " + u.getId() + " имеет возраст меньше 7 лет.");
                });
        System.out.println("\n");
    }


    public static void getAverageAge(List<User> usersList) {
        System.out.println("Средний возраст пользователей: " +
                usersList.stream().filter(u -> u.getAge() > 7)
                        .mapToDouble(u -> u.getAge())
                        .average() + "\n");
    }

    public static void countDifferentCountries(List<User> usersList) {
        System.out.println("Количество разных стран проживания среди пользователей: " +
        usersList.stream().map(u -> u.getCountry()).distinct().count());
        System.out.println("Количество разных стран проживания среди пользователей (больше 7 лет): " +
                usersList.stream().filter(u -> u.getAge() > 7).map(u -> u.getCountry()).distinct().count());
    }
}

