package org.example.state;

public class PauseState implements PlayerState{
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Playing media player ...");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already paused ...");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopping media player .");
        player.setState(new StopState());
    }

    @Override
    public String getName() {
        return "Pause";
    }
}
