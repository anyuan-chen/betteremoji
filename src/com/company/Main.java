package com.company;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter emotion, 0 to exit");
        EmoteList el = new EmoteList();
        while(true){ //for now
            String emotion = sc.nextLine();
            if (emotion.equals("0")){
                break;
            }
            System.out.println(el.getEmojiWithEmotion(emotion));
        }
    }
}
