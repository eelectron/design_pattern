package org.example.state;

public class MediaPlayer {
    private PlayerState state;

    public MediaPlayer(PlayerState state) {
        this.state = new StopState();
    }

    public void setState(PlayerState playerState) {
        System.out.println("State changed: "
                + state.getName() + " → " + playerState.getName());
        this.state = playerState;
    }

    public void play(){
        state.play(this);
    }

    public void pause(){
        state.pause(this);
    }

    public void stop(){
        state.stop(this);
    }

    public String stateName(){
        return this.state.getName();
    }

    @Override
    public String toString() {
        return "MediaPlayer{" +
                "state=" + state +
                '}';
    }
}
