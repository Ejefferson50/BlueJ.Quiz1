import java.lang.StringBuilder;
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue +valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String back="";
        for(int i=valueToBeReversed.length()-1; i>=0; i--){
            back+=valueToBeReversed.charAt(i);
        }
        return back;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char m ='k';
        if(word.length()%2==0){
            m=word.charAt(word.length()/2-1);
        }else if(word.length()%2==1){
            m=word.charAt(word.length()/2);
        }

        return m;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        int i = 0;
        while (i < value.length()) {
            char ch = value.charAt(i);
            if(ch == charToRemove){
                String before = value.substring(0, i);
                String after = value.substring(i + 1);
                value = before + after;
            } else {
                i++;
            }
        }
        return value;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String lastWord = sentence.substring(sentence.lastIndexOf(" ") +1);

        return lastWord;
    }
}
