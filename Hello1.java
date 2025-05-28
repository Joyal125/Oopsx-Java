import java.util.HashMap;

// Java Program to find the occurrence
// of words in a String using HashMap.
import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Hello1 {
    public static void main(String[] args)
    {

        // Declaring the String
        String str = "Programming is fun";

        Map<String, Integer> hashMap = new HashMap<>();



        String[] words = str.split(" ");

        for (String word : words) {



            Integer integer = hashMap.get(word);

            if (integer == null)


                hashMap.put(word, 1);

            else {

                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}