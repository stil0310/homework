package geekbrains;

import java.util.HashMap;
import java.util.HashSet;

public class phoneBook {
    HashMap<String, HashSet<String>> pb;

    public phoneBook() {
        this.pb = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }

    public void findAndPrint(String name) {
        System.out.println("Contact " + name + " / Phone number " + pb.getOrDefault(name, new HashSet<>()));
    }
}
