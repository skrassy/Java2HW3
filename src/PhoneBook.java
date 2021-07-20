import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    public PhoneBook() {
    }

    Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String name, String phone) {
        List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    public void getPhone(String name) {
        List<String> phones = phoneBook.get(name);
        System.out.println(name + ": " + phones);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }


}
