package org.example.proxy;

public class RealVideoService implements VideoService{

    @Override
    public String loadVideo(String videoId) {
        System.out.println("Loading video from Youtube API : " + videoId);
        return "Video data : " + videoId;
    }
}
