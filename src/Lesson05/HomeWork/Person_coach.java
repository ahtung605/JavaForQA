package Lesson05.HomeWork;

public class Person_coach {

    private static final int CURRENT_YEAR = 2021;

    private String surname;
    private String secondName;
    private String name;
    private String position;
    private String phone;
    private int salary;
    private int birthYear;

    // 2.	Конструктор класса должен заполнять эти поля при создании объекта;
    public Person_coach(String name,
                  String secondName,
                  String surname,
                  String phone,
                  String position,
                  int salary,
                  int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
    }

    // 3.	Внутри класса «Сотрудник» написать методы, которые возвращают
    // значение каждого поля;
    int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    int getSalary() {
        return salary;
    }

//    String getSecondName() { not recommended
//        return secondName;
//    }
//
//    String getName() {
//        return name;
//    }
//
//    String getSurname() {
//        return surname;
//    }
//
//    String getPosition() {
//        return position;
//    }
//
//    String getPhone() {
//        return phone;
//    }

    String getFullInfo() {
        return this.name + " " +
                this.secondName + " " +
                this.surname + ", " +
                this.getAge() + " years old, " +
                this.position + ". Phone number: " +
                this.phone + ". Salary is " +
                this.getSalary() + " RU";
    }

}
