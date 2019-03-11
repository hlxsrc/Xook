package com.example.xook;

public class PalabraModel {

    private String name;
    private int image_drawable;
    private int audio_resource;
    private int s_audio_resource;

    /**
     * Create a new Word object.
     *
     * @param wordName is the word.
     * @param imageResourceId is the resource ID for the image of the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    /**public PalabraModel(String wordName, int imageResourceId, int audioResourceId) {
        name = wordName;
        image_drawable = imageResourceId;
        audio_resource = audioResourceId;
    }
    **/

    /**
     * Return the word.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the word.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return the id of the image
     */
    public int getImage_drawable() {
        return image_drawable;
    }

    /**
     * Set the image.
     */
    public void setImage_drawable(int image_drawable) {
        this.image_drawable = image_drawable;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return audio_resource;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public void setAudioResourceId(int audio_resource) {
        this.audio_resource = audio_resource;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getSlowAudioResourceId() {
        return s_audio_resource;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public void setSlowAudioResourceId(int audio_resource) {
        this.s_audio_resource = audio_resource;
    }


}
