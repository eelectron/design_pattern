package org.example.proxy;

public class Main {
    static void main() {
        RealVideoService realVideoService = new RealVideoService();
        VideoServiceProxy videoServiceProxy = new VideoServiceProxy(realVideoService);

        Client client = new Client(videoServiceProxy);
        String videoId = "111";
        System.out.println(client.loadVideo(videoId));
    }
}
