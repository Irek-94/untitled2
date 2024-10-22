package pacake.one;

import java.util.*;

public class HW {

    public static void main(String[] args) {

        String s = "The United Nations is the organization that defines these problems and takes measures to solve them. The United Nations is an example of cooperation of the world-leading countries. They want to make our world a better place.";

        String[] wordArray = s.split(" ");
        List<String> words = Arrays.asList(wordArray);

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words){
            if (wordCount.containsKey(word)){
                Integer count = wordCount.get(word);
                count++;
                wordCount.put(word,count);
            } else{
                wordCount.put(word,1);
            }
        }
        System.out.println(wordCount);
    }
}
