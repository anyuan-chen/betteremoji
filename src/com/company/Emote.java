package com.company;

import java.util.ArrayList;

public class Emote {
    private String emotion;
    private String emojiText = "";

    Emote(String emojiText, String emotion){
        this.emojiText = emojiText;
        this.emotion = emotion;
    }
    public String getEmojiText() { return emojiText; }
    public void setEmojiText(String emojiText) { this.emojiText = emojiText;}
    public String getEmotion() { return emotion;}
    public void setEmotion(String emotion) { this.emotion = emotion;}
}
