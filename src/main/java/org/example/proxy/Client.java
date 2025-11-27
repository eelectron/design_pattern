package org.example.proxy;

public class Client {
    private VideoService videoService;
    public Client(VideoService videoService){
        this.videoService = videoService;
    }

    public String loadVideo(String videoId){
        return videoService.loadVideo(videoId);
    }
}
