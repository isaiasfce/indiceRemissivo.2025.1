import java.util.*;

public class HashTable {
    private Map<Character, LinkedList<Word>> table;

    public HashTable() {
        table = new HashMap<>();
    }

    public void insert(String word, int lineNumber) {
        word = word.toLowerCase();
        char key = word.charAt(0);
        table.putIfAbsent(key, new LinkedList<>());
        LinkedList<Word> list = table.get(key);
        
        for (Word w : list) {
            if (w.getText().equals(word)) {
                w.addOccurrence(lineNumber);
                return;
            }
        }

        list.add(new Word(word, lineNumber));
    }

    public Word search(String word) {
        word = word.toLowerCase();
        char key = word.charAt(0);
        LinkedList<Word> list = table.get(key);
        if (list != null) {
            for (Word w : list) {
                if (w.getText().equals(word)) {
                    return w;
                }
            }
        }
        return null;
    }

    public List<Word> getAllWords() {
        List<Word> allWords = new ArrayList<>();
        for (LinkedList<Word> list : table.values()) {
            allWords.addAll(list);
        }
        return allWords;
    }
}
