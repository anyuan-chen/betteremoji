package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class EmoteList {
    private static Emote notFound;
    private ArrayList<Emote> emoteList;
    public EmoteList() throws IOException, ParseException {
        //initialize arrayList and all objects
        emoteList = new ArrayList<>();
        notFound = new Emote("T_T", "sad");
        JSONParser parser = new JSONParser();
        //read the JSON file
        JSONArray emojiJSON = (JSONArray) parser.parse(new FileReader("/Users/andrewchen/IdeaProjects/betteremote/emotes.json"));
        //transfer the JSON objects into emoji objects to be intserted into the emojiList
        for (Object o : emojiJSON){
            JSONObject emoji = (JSONObject) o;
            String text = (String) emoji.get("text");
            String emotion = (String) emoji.get("emotion");
            emoteList.add(new Emote(text, emotion));
        }
    }
    public String getEmojiWithEmotion(String emotion){
        Collections.shuffle(emoteList);
        for (Emote emote : emoteList) {
            if (emote.getEmotion().contains(emotion)) {
                return emote.getEmojiText();
            }
        }
        //shuffle order aftter done
        return notFound.getEmojiText();
    }
}
