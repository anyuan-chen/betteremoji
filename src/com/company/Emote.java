package com.company;

import java.util.ArrayList;

public class Emote {
    private ArrayList<String> emotion;
    private String emojiText = "";

    Emote(String emojiText, ArrayList<String> emotion){
        this.emojiText = emojiText;
        this.emotion = emotion;
    }
    public String getEmojiText() { return emojiText; }
    public void setEmojiText(String emojiText) { this.emojiText = emojiText;}
    public ArrayList<String> getEmotion() { return emotion;}
    public void setEmotion(ArrayList<String> emotion) { this.emotion = emotion;}
}
