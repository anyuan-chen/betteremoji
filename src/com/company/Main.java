package com.company;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        EmoteList el = new EmoteList();
        String selection;
        do{
            System.out.println("Menu:");
            System.out.println("Enter 1 to choose an emotion" );
            System.out.println("Enter 2 to add an emoji" );
            System.out.println("Enter 3 for a random emoji" );
            System.out.println("Enter 4 to exit program" );
            //drop down menu

            selection = sc.nextLine();
            if (selection.equals("4")){
                System.exit(0);
            }
            else if (selection.equals("1")){
                System.out.println("Enter any emotion! (∩_∩)");
                String input = sc.nextLine();
                System.out.println("Here's your emoji ^_^");
                System.out.println(el.getEmojiWithEmotion(input));
            }
            else if(selection.equals("2")){
                System.out.println("Enter the emotion of your emoji (◐‿◑）");
                String emotion = sc.nextLine();
                System.out.println("Enter your emoji!! :3");
                String emojiText = sc.nextLine();
                el.addEmoji(new Emote(emotion, emojiText));
            }
            else if (selection.equals("3")){
                System.out.println("Hope you like you random emoji！（；￣ェ￣）");
                System.out.println(el.getEmojiRandom());
            }
            else{
                System.out.println("T_T - Not Found");
            }
        }while(!selection.equals("5"));
    }

}
