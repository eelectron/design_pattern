package org.example.state;

public class StopState implements PlayerState{
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Playing media player ...");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Ignoring pause in stop state");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Already stopped ...");
    }

    @Override
    public String getName() {
        return "Stop";
    }
}
