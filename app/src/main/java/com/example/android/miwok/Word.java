package com.example.android.miwok;

public class Word {
    private String mDefault;
    private String mMiwok;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImage = NO_IMAGE_PROVIDED;
    private int soundID;

    public Word(String english, String miwok, int sound) {
        mDefault = english;
        mMiwok = miwok;
        soundID = sound;
    }

    public Word(String english, String miwok, int image, int sound) {
        mDefault = english;
        mMiwok = miwok;
        mImage = image;
        soundID = sound;
    }

    public String getMiwokTranslation() {
        return mMiwok;
    }

    public String getDefaultTranslation() {
        return mDefault;
    }

    public int getImageResourceId() {
        return mImage;
    }

    public boolean hasImage(){
        if (mImage != NO_IMAGE_PROVIDED) return true;
        else return false;
    }

    public int getSoundId() {
        return soundID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefault='" + mDefault + '\'' +
                ", mMiwok='" + mMiwok + '\'' +
                ", mImage=" + mImage +
                ", soundID=" + soundID +
                '}';
    }
}
