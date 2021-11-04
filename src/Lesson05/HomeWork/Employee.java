package Lesson05.HomeWork;

/**
 * @author Konstantin Babenko
 * @version 1
 * @create 04.11.2021
 */

public class Employee {

    // 1. поля класса
    private String FIO = "Vanya"; // ФИО
    private String position; // должность
    private String email; // email
    private String telephone; // телефон
    private double salary; // зарплата
    private int age; // возраст

    // 2. конструктор для заполнения полей при создании объекта
    public Employee(String FIO, String position, String email, String telephone, double salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    // 3. вывод информации о сотрудниках в консоль
    public void info() {
        System.out.println("Сотрудник: " + FIO + ", должность - " + position + ", email - " + email + ", телефон - " + telephone + ", зарплата - " + salary + ", возраст - " + age + ".");
    }

    // геттер возраста (для выполнения п.5 ДЗ)
    public int getAge() {
        return age;
    }

}
