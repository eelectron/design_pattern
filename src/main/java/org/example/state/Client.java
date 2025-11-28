package org.example.state;

import javax.print.attribute.standard.Media;

public class Client {
    static void main() {
        MediaPlayer mediaPlayer = new MediaPlayer(new StopState());

        mediaPlayer.play();

        mediaPlayer.pause();

        mediaPlayer.stop();
    }
}
