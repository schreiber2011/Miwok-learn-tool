package com.example.android.miwok;

/**
 * Criado por schreiber em 1/2/18.
 * Definicão da classe word.
 */

class Word {
    private final String mDefaultTranslation;
    private final String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private final int mAudioResourceId;

    /**
     * Primeiro método para armazenar palavra SEM imagem
     * First method to store word withOUT image
     * @param defaultTranslation english word or phrase
     * @param miwokTranslation miwok ord or phrase
     * @param soundResourceID sound Id
     */
    Word(String defaultTranslation, String miwokTranslation, int soundResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = soundResourceID;
    }

    /**
     * Segundo método para armazenar palavra com imagem
     * Second method to store word with image
     * @param defaultTranslation english word or phrase
     * @param miwokTranslation miwok ord or phrase
     * @param imageResourceId image Id
     * @param soundResourceID sound Id
     */
    Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = soundResourceID;
    }

    /**
     * Retorna palavra ou frase em inglês
     * Returns english word or phrase
     * @return private english word or phrase
     */ String getmDefaultTranslation() {return mDefaultTranslation;}

    /**
     * Retorna palavra ou frase em miwok
     * Returns miwok word or phrase
     * @return private miwok word or phrase
     */ String getmMiwokTranslation() {return mMiwokTranslation;}

    /**
     * Retorna o Id da imagem local na pasta drawable
     * Returns image resource Id on drawable folder
     * @return mImageResourceId
     */ int getmImage() {return mImageResourceId;}

    /**
     * Retorna true se houve uma imagem associada e falso se não houver
     * Returns true if there is an image resource associated
     * @return true/false
     */ boolean hasImage(){return mImageResourceId != NO_IMAGE_PROVIDED;}

    /**
     * Retorna o Id do audio local na pasta raw
     * Returns audio resource Id on raw folder
     * @return private audio resource Id
     */ int getAudioResourceId() {return mAudioResourceId;}

}
