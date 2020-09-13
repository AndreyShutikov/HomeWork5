/** 1)Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
        * 2)Конструктор класса должен заполнять эти поля при создании объекта;
        * 3)Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
        * 4)Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет; Пример: ```
        * Person [] persArray = new Person [ 5 ]; // Сначала объявляем массив объектов,
        * persArray [ 0 ] = new Person ( "Ivanov Ivan" , "Engineer" , " ivivan@mailbox.com " , "892312312" , 30000 ,30 ); // потом для каждой ячейки массива задаем объект
        * persArray [ 1 ] = new Person (...);
        * ...
        * persArray [ 4 ] = new Person (...);
        */


package HomeWork5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов", "Иван", "Иванович",
                "Директор", "ivanovii@mail.me", 4500, 45);
        employees[1] = new Employee("Петров", "Петр", "Петрович", "Главный инженер",
                "petrovpp@mail.me", 2000, 30);
        employees[2] = new Employee("Сидоров", "Сидор", "Сидорович",
                "бухгалтер", "sidorovss@mail.me", 1800, 43);
        employees[3] = new Employee("Андреев", "Андрей", "Андреевич",
                "мастер", "andreev@mail.me", 1500, 41);
        employees[4] = new Employee("Семенов", "Семён", "Семёнович",
                "штукатур", "semenovss@mail.me", 1200, 39);

        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i].getAge() > 40)
                employees[i].getInfo();
        }
    }
}