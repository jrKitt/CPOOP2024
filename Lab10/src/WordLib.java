/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
import java.util.*;
public class WordLib {
    Set<String> wordDict = new HashSet<String>();
    public WordLib() {

    }

    public WordLib(Set<String> word){
        super();
        this.wordDict = word;
    }

    public void add(String word){
        wordDict.add(word);
    }


    public void addTokenFromSentence(String sentence) {
        for (String token:sentence.toLowerCase().replaceAll("[^a-z0-9\\s]", "").split("\\s")) {
            wordDict.add(token);
        }
    }

    public static List<String> tokenize(String text){
        text = text.toLowerCase().replaceAll("[^a-z0-9\\s]", "");
        String[] tokens = text.split("\\s+");
        return Arrays.asList(tokens);
    }

    public static int[] Vectorize(String sentence, List<String> vocabulary){
        int[] vector = new int[vocabulary.size()];
        String[] tokens = sentence.toLowerCase().replaceAll("[^a-z0-9\\s]", "").split("\\s+");
        for(String token: tokens){
            int index = vocabulary.indexOf(token);
            if(index != -1){
                vector[index]++;
            }
        }
        return vector;
    }

    public static double cosineSimilarity(int[] vec1, int[] vec2){
        if(vec1.length != vec2.length){
            throw new IllegalArgumentException("Vector must be the same length");
        }
        double dot = 0.0;
        double normVec1 = 0.0;
        double normVec2 = 0.0;

        for(int i = 0; i < vec1.length; i++){
            dot += vec1[i]*vec2[i];
            normVec1 += vec1[i]*vec1[i];
            normVec2 += vec2[i]*vec2[i];
        }

        if(normVec1 == 0 || normVec2 == 0){
            return 0.0;
        }
        return dot/(Math.sqrt(normVec1) * Math.sqrt(normVec2));
    }

    public void showAll() {
        for (String word : wordDict) {
            System.out.println(word);
        }
    }

    public List<String> getVocab() {
        return new ArrayList<>(wordDict);
    }

}
