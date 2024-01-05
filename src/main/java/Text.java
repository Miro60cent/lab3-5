import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Text {

    private List<Sentence> sentences;

    public Text(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public List<Word> getWords() {
        return sentences.stream()
                .flatMap(sentence -> sentence.getElements().stream())
                .filter(element -> element instanceof Word)
                .map(element -> (Word) element)
                .collect(Collectors.toList());
    }

    public List<Word> sortWordsByLetterCount(char targetLetter) {
        return getWords().stream()
                .sorted(Comparator.comparingInt(word ->
                        (int) word.getLetters().stream()
                                .filter(letter -> letter.getValue() == targetLetter)
                                .count()))
                .collect(Collectors.toList());
    }
}