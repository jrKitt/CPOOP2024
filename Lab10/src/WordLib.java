/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
import java.util.*;

public class WordLib {
    Set<String> wordDict = new HashSet<>();

    public WordLib() {}

    public WordLib(Set<String> word){
        this.wordDict = word;
    }

    public void add(String word){
        wordDict.add(word);
    }

    public void addTokenFromSentence(String sentence) {
        for (String token : sentence.toLowerCase().replaceAll("[^a-z0-9\\s]", "").split("\\s+")) {
            wordDict.add(token);
        }
    }

    public static List<String> tokenize(String text){
        text = text.toLowerCase().replaceAll("[^a-z0-9\\s]", "");
        return Arrays.asList(text.split("\\s+"));
    }

    public int[] getVector(String sentence){
        List<String> vocabulary = new ArrayList<>(wordDict);
        int[] vector = new int[vocabulary.size()];
        String[] tokens = sentence.toLowerCase().replaceAll("[^a-z0-9\\s]", "").split("\\s+");

        for (String token : tokens) {
            int index = vocabulary.indexOf(token);
            if (index != -1) {
                vector[index]++;
            }
        }
        return vector;
    }

    public static double cosineSimilarity(int[] vec1, int[] vec2){
        if (vec1.length != vec2.length) {
            throw new IllegalArgumentException("Vector must be the same length");
        }
        double dot = 0.0, normVec1 = 0.0, normVec2 = 0.0;

        for (int i = 0; i < vec1.length; i++) {
            dot += vec1[i] * vec2[i];
            normVec1 += vec1[i] * vec1[i];
            normVec2 += vec2[i] * vec2[i];
        }

        return (normVec1 == 0 || normVec2 == 0) ? 0.0 : dot / (Math.sqrt(normVec1) * Math.sqrt(normVec2));
    }

    public void showAll() {
        System.out.println("Vocabulary: " + wordDict);
    }

    public List<String> getVocab() {
        return new ArrayList<>(wordDict);
    }
}
