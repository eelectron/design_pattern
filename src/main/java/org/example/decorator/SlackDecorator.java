package org.example.decorator;

public class SlackDecorator extends NotifierDecorator{
    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Slack message " + message);
    }
}
