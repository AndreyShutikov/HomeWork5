package HomeWork5;

public class Employee {
    String firstname, name, middlename, position, email;
    int salary, age;

    Employee(String firstname,
             String name,
             String middlename,
             String position,
             String email,
             int salary,
             int age) {
        this.firstname = firstname;
        this.name = name;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    void getInfo() {
        System.out.println("Фамилия: " + firstname + " Имя: " + name
                + " Отчество: " + middlename + "  должность: " + position
                + "  email: " + email + "  зарплата: " + salary + "  возраст: "
                + age);
    }

    int getAge()
    {
        return age;
    }
}
