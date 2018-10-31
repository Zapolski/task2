
public class WordWithStringComparator {

    public int countPunctuation(String str){
        int oldLength = str.length();
        return oldLength-str.replaceAll("[\\p{Punct}]+","").length();
    }

    public int wordStringComparator (String str, String word){

        String[] res = str.split("[\\p{Punct}\\s]+");
        int count = 0;
        for (String s: res){
            if (s.equals(word)) count++;
        }
        return count;
    }
}
