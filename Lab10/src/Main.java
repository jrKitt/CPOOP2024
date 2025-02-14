/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        WordLib dic = new WordLib();
        String sentence1 = "This is a sample sentence for similarity measurement.";
        String sentence2 = "For measuring similarity, this sample sentence is used.";

        dic.addTokenFromSentence(sentence1);
        dic.addTokenFromSentence(sentence2);
        dic.showAll();
        List<String> tokens = new ArrayList<>();
        tokens = WordLib.tokenize(sentence2);
        System.out.println(" ---- Sentence to tokens ---");
        tokens.forEach(System.out::println);

        List<String> vocab = dic.getVocab();

        System.out.println();
        int[] vector1 = dic.Vectorize(sentence1, vocab);
        int[] vector2 = dic.Vectorize(sentence2, vocab);

        for(int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i]);
        }
        System.out.println();

        // Compute the cosine similarity between the two vectors
        double similarity = WordLib.cosineSimilarity(vector1, vector2);
        System.out.println("Cosine Similarity: " + similarity);

    }
}