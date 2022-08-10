import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Проверка вхождения слова в текст.
 */
public class WordsChecker {

    private final Set<String> set;//множество уникальных слов исходного текста без учета регистра

    public WordsChecker(String text) {
        this.set = new HashSet<>(Arrays.asList(text.toLowerCase().split("\\P{IsAlphabetic}+")));
    }

    /**
     * Возвращает результат поиска слова в тексте (без учета регистра).
     *
     * @param checkWord - слово для поиска
     * @return - true/false, найдено/не найдено
     */
    public boolean hasWord(String checkWord) {
        System.out.print("Результат поиска слова: " + checkWord + " -> ");
        return set.contains(checkWord.toLowerCase());//без учета регистра
    }

    /**
     * Вывод отсортированного множества слов исходного текста без дубликатов.
     */
    public void printSortedCheckSet() {
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Отсортированное множество слов ->>");
        for (String word : treeSet) {
            System.out.println(word);
        }
    }

    @Override
    public String toString() {
        return "Всего уникальных слов в тексте -> " + set.size() + " -> " + set;
    }
}
