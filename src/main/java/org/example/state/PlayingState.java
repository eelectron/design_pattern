package org.example.state;

public class PlayingState implements PlayerState{
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Already playing ...");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Pausing media player ...");
        player.setState(new PauseState());
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopping media player ...");
        player.setState(new StopState());
    }

    @Override
    public String getName() {
        return "Playing";
    }
}
