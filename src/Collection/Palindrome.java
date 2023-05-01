package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Palindrome {
    public static void main(String[] args) {
        String[] words = {"RADAR","WARTER START","MILK KLIM","RESERVERED","IWI","","i"};

        for(String word : words){
            System.out.println(isPalindrome(word));
        }
    }

    static boolean isPalindrome(String s){
        Deque<Character> deque = new ArrayDeque<Character>();
        for(Character c : s.toCharArray()){
            deque.add(c);
        }

        while (deque.size() > 1){
            char head = deque.pollFirst();
            char tail = deque.pollLast();
            if(head != tail){
                return false;
            }
        }
        return true;
    }
}
