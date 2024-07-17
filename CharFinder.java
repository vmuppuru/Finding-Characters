package findCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharFinder {
    public Map<Character, List<Integer>> findMatchPositions(String charToFind, String stringToSearch){
       Map<Character, List<Integer>> charCountMap = null;
       if((charToFind!=null && stringToSearch!=null) &&(!charToFind.isEmpty() && !stringToSearch.isEmpty())){
           char[] stringToCharArray = stringToSearch.toCharArray();
           charCountMap = new HashMap<>();
           for(int i =0; i<stringToCharArray.length; i++) {
               if (!charCountMap.containsKey(stringToCharArray[i]) && charToFind.contains(String.valueOf(stringToCharArray[i]))) {
                   List<Integer> charPositions = new ArrayList<>();
                   charPositions.add(i);
                   charCountMap.put(stringToCharArray[i], charPositions);
               } else {
                   List<Integer> charPositions = charCountMap.get(stringToCharArray[i]);
                   if (charPositions != null) {
                       charPositions.add(i);
                       charCountMap.replace(stringToCharArray[i], charPositions);
                   }
               }
           }
           }
       return  charCountMap;
       }

}
