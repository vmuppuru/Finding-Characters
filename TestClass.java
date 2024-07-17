package findCharacters;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args){
        CharFinder charFinder = new CharFinder();

        Scanner scan = new Scanner(System.in);
        System.out.println("enter characters to search :");
        String charToSearch = scan.nextLine();

        System.out.println("enter search string :");
        String stringToSearch =scan.nextLine();

        Map<Character, List<Integer>> finalCharMapFinder =charFinder.findMatchPositions(charToSearch, stringToSearch);
        System.out.println("characters and its positions :" +finalCharMapFinder);

    }
}
