import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zavd_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        List<String> extractedWords = new ArrayList<>();
        StringBuilder remainingText = new StringBuilder();

        String[] words = text.split("\\s+");

        for (String word : words) {
            if (hasDuplicateLetters(word)) {
                extractedWords.add(word);
            } else {
                remainingText.append(word).append(" ");
            }
        }

        System.out.println("Вилучені слова: " + String.join(" ", extractedWords));
        System.out.println("Текст, що залишився: " + remainingText.toString().trim());

        scanner.close();
    }

    private static boolean hasDuplicateLetters(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
