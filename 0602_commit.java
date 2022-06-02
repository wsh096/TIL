import java.util.HashMap;
import java.util.Map.Entry;

class Main {
    public static void main(String[] args) {

        // 해쉬맵 만들기
        HashMap<String, String> languages = new HashMap<>();
        languages.put("Java", "Enterprise");
        languages.put("Python", "ML/AI");
        languages.put("JavaScript", "Frontend");
        System.out.println("HashMap: " + languages);

        // 키/변수 맵핑 반복
        System.out.print("항목: ");
        for(Entry<String, String> entry: languages.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }

        // 키반복
        System.out.print("\n키: ");
        for(String key: languages.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }

        // 변수반복
        System.out.print("\n변수: ");
        for(String value: languages.values()) {
            System.out.print(value);
            System.out.print(", ");
        }
    }
}
