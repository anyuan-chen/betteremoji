package com.company;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        EmoteList el = new EmoteList();
        while(true){ //for now
            String emotion = sc.nextLine();
            System.out.println(el.getEmojiWithEmotion(emotion));
        }
    }
}
