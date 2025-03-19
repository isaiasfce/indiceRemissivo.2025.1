import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String textFile = "example_text.txt";         
        String keywordsFile = "example_key.txt"; 
        String outputFile = "inverted_index.txt";

        HashTable hashTable = new HashTable();
        

        try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {

                line = line.replaceAll("[^a-zA-Z0-9\\s]", "");
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        hashTable.insert(word, lineNumber);
                    }
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Error reading the text file: " + e.getMessage());
            return;
        }
        

        List<String> keywords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(keywordsFile))) {
            String word;
            while ((word = br.readLine()) != null) {
                if (!word.trim().isEmpty()) {
                    keywords.add(word.trim().toLowerCase());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the keywords file: " + e.getMessage());
            return;
        }
        

        Collections.sort(keywords);
        

        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {
            for (String key : keywords) {
                Word w = hashTable.search(key);
                if (w != null) {
                    pw.println(key + " -> " + w.getOccurrences().toString());
                } else {
                    pw.println(key + " -> (not found)");
                }
            }
            System.out.println("Inverted index successfully generated in " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing the output file: " + e.getMessage());
        }
    }
}
