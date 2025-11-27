package org.example.proxy;

import java.util.HashMap;
import java.util.Map;

public class VideoServiceProxy implements VideoService{
    private VideoService realVideoService;
    private Map<String, String> cache = new HashMap<>();

    public VideoServiceProxy(VideoService realVideoService){
        this.realVideoService = realVideoService;
    }

    @Override
    public String loadVideo(String videoId) {
        if(cache.containsKey(videoId)){
            System.out.println("Returning video from cache : " + videoId);
            return cache.get(videoId);
        }

        String data = realVideoService.loadVideo(videoId);
        cache.put(videoId, data);
        return data;
    }
}
