import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "Orange", "Apple", "Nut", "Milk",
                "Butter", "Fish", "Apple", "Butter",
                "Fish", "Apple", "Strawberry",
                "Strawberry", "Banana", "Apple",
                "Grape", "Orange", "Banana", "Banana"};

        searchUniqueWords(arr);
        countOfUniqueWords(arr);
        phoneBook();
    }

    public static void searchUniqueWords(String[] arr) {
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        System.out.println("Список уникальных слов: " + set);
    }

    public static void countOfUniqueWords(String[] arr) {
        Map<String,Integer> map = new HashMap<>();
        for (String word : arr) {
            Integer val = map.get(word);
            map.put(word, val == null ? 1 : val + 1);
        }
        System.out.println("Количество повторяющихся слов: ");
        map.forEach((k,v) -> System.out.println(k + ": " + v));
    }

    public static void phoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", "777");
        phoneBook.add("Petrov", "666");
        phoneBook.add("Ivanov", "111");
        phoneBook.add("Frolov", "222");
        phoneBook.add("Ivanov", "333");
        phoneBook.add("Trusov", "999");
        System.out.println(phoneBook);

        phoneBook.getPhone("Ivanov");
        phoneBook.getPhone("Trusov");
    }
}
