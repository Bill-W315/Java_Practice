package Collection;

import java.util.ArrayList;


public class IterableString extends ArrayList<Character>{
    IterableString(String s){
        char[] arr = s.toCharArray();
        for(Character c : arr){
            this.add(c);
        }
    }

    public static void main(String[] args) {
        var iterableString = new IterableString("Bill");
        for(Character c : iterableString){
            System.out.println(c);
        }
        iterableString.forEach((Character c) -> System.out.println("Hello"));
    }
}
