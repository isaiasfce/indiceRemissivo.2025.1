public class Word {
    private String text;
    private CustomLinkedList occurrences;

    public Word(String text, int lineNumber) {
        this.text = text.toLowerCase();
        this.occurrences = new CustomLinkedList();
        this.occurrences.insert(lineNumber);
    }
    
    public String getText() {
        return text;
    }
    
    public void addOccurrence(int lineNumber) {
        this.occurrences.insert(lineNumber);
    }
    
    public CustomLinkedList getOccurrences() {
        return occurrences;
    }
    
    @Override
    public String toString() {
        return text + " -> " + occurrences.toString();
    }
}
