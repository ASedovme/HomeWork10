public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее работа 10");
        //Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        //Задание2
        System.out.println("Задание 2");
        System.out.println(fullName.toUpperCase());

        //Задание 3
        System.out.println("Задание 3");
        firstName = "Семён";
        lastName = "Иванов";
        middleName = "Cемёныч";
        fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName);
    }
}