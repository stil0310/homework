package geekbrains;


import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] russianPoets = {"Ахматова", "Пушкин", "Цветаева", "Леромонтов", "Пушкин", "Тютчев", "Ахматова", "Пушкин", "Фет", "Тургенев", "Брюсов"};
        HashMap<String, Integer> fetus = new HashMap<>();
        for (String x : russianPoets) {
            fetus.put(x, fetus.getOrDefault(x, 0) + 1);
        }
        System.out.println(fetus);




        phoneBook book= new phoneBook();
        book.addContact("Иванов", "363487");
        book.addContact("Петров", "870977");
        book.addContact("Смирнов", "544456");
        book.addContact("Иванов", "877765");
        book.addContact("Сидоров", "877737");
        book.addContact("Пупкин", "877733");

        // ищем по имени
        book.findAndPrint("Иванов");
        book.findAndPrint("Пупкин");
        book.findAndPrint("Петров");
    }
}