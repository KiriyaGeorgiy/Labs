package users;

public class Main {
    public static void main(String[] args) {
        var userOne = new User(100000, "Олег", "Иванов", 25, "Россия");
        var userTwo = new User(100001, "Фернандо", "Лопес", 31, "Испания");
        var userThree = new User(100002, "Маркус", "Шайбер", 4, "Австрия");
        var userFour = new User(100003, "Клаудиа", "Телло", 23, "Мексика");
        var userFive = new User(100004, "Майя", "Кутателадзе", 35, "Грузия");
        var userSix = new User(100005, "Мартин", "Коннелл", 6, "Англия");
        var userSeven = new User(100006, "Ханс", "Визе", 25, "Дания");
        var userEight = new User(100007, "Сальма", "Абдулла", 30, "Египет");
        var userNine = new User(100008, "Салтанат", "Сарсенбаева", 21, "Казахстан");
        var userTen = new User(100009, "Николай", "Куманов", 62, "Болгария");


        User.sortByLastName(User.getUsers());
        User.sortByAge(User.getUsers());
        User.checkAge(User.getUsers());
        User.getAverageAge(User.getUsers());
        User.countDifferentCountries(User.getUsers());
        }
}
