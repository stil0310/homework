package geekbrains.hw_4;


    public class Main {

        public static void main(String[] args) {

            Employee[] persArray = new Employee[5];
            persArray[0] = new Employee("Калинина Нататья Петровна ", "Учитель", "i55-155", 50, 30);
            persArray[1] = new Employee("Иванов Петр Сергеевич ", "Программист", "269-863", 250, 34);
            persArray[2] = new Employee("Петрова Мария Ивановна ", "Флорист", "459-875", 50, 45);
            persArray[3] = new Employee("Прохоров Максим Савельевич ", "Дворник", "952-859", 35, 59);
            persArray[4] = new Employee("Белов Владимир Алексеевич", "Дворник", "582-859", 47, 50);

            for (Employee item : persArray) {
                if (item.GetAge() > 40) Show(item);
            }
            System.out.println("-----------------------");
            raiseSalary(persArray);

            for (Employee item : persArray) {
                Show(item);
            }
        }
        public static void Show(Employee employee) {

            System.out.println(employee.GetId() + " " + employee.GetFulName() + " " + employee.GetPosition() + " " + employee.GetSalary());
        }

        public static void raiseSalary(Employee[] employees) {
            for (Employee employee : employees) {
                if (employee.GetAge() > 35) employee.setSalary(employee.GetSalary() + 10);
            }
        }
    }

