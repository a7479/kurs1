package kurs1;

public class Main {
    private static Employee[] employees = new Employee[10];


    public static void main(String[] args) {

        employees[0] = new Employee("Иван Иванович Иванов", 1, 65700.50);
        employees[1] = new Employee("Петр Петрович Петров", 4, 78500.30);
        employees[2] = new Employee("Сергей Владимирович Смирнов", 2, 54300.10);
        employees[3] = new Employee("Дмитрий Константинович Сидоров", 3, 67450.60);
        employees[4] = new Employee("Татьяна Александровна Жукова", 1, 71200.90);
        employees[5] = new Employee("Евгений Яковлевич Воронов", 5, 47900.10);
        employees[6] = new Employee("Ирина Дмитриевна Стрельцова", 2, 52980.30);
        employees[7] = new Employee("Ольга Арсеньевна Воробьева", 5, 63370.00);
        employees[8] = new Employee("Александр Борисович Пупкин", 3, 83900.20);
        employees[9] = new Employee("Кристина Сергеевна Сорокина", 4, 73850.40);

        printEmployee();

        calculateSalary();

        calculateMinSalary();

        calculateMaxSalary();

        calculateAverageSalary();

        printFullNameEmployees();
    }

    // Метод вывода списка всех сотрудников
    public static void printEmployee() {
        System.out.println("Вывод списка всех сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    // Метод подсчета суммы зарплат всех сотрудников за месяц
    public static void calculateSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Cумма зарплат всех сотрудников за месяц = " + sum);

        // Метод вывода сотрудника с минимальной зарплатой
    }

    public static void calculateMinSalary() {
        double salary = Integer.MAX_VALUE;
        Employee contact = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salary) {
                salary = employees[i].getSalary();
                contact = employees[i];
            }

        }
        System.out.println("Минимальная зарплата: " + contact);
    }

    public static void calculateMaxSalary() {
        double salary = Integer.MIN_VALUE;
        Employee contact = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > salary) {
                salary = employees[i].getSalary();
                contact = employees[i];
            }

        }
        System.out.println("Максимальная зарплата: " + contact);
    }

    // Метод для вывода средней зарплаты за месяц
    public static void calculateAverageSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        double average = sum / employees.length;
        System.out.println("Cредняя зарплата: " + average);
    }


    // Метод вывода ФИО всех сотрудников
    public static void printFullNameEmployees() {
        System.out.println("ФИО всех сотрудников:");
        for (int i = 0; i < employees.length; i++) {

            System.out.println(employees[i].getFullName());
        }
    }

}

