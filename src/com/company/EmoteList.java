package com.company;

import java.util.ArrayList;

public class EmoteList {
    private static Emote notFound;
    private ArrayList<Emote> emoteList;
    public EmoteList(){
        ArrayList<String> emotions = new ArrayList<>();
        emotions.add("sad");
        notFound = new Emote("T_T", emotions);
    }
    public Emote getEmojiWithEmotion(String emotion){
        for (Emote emote : emoteList) {
            if (emote.getEmotion().contains(emotion)) {
                return emote;
            }
        }
        return notFound;
    }
}
