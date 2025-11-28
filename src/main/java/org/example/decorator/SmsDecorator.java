package org.example.decorator;

public class SmsDecorator extends NotifierDecorator{
    public SmsDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS : " + message);
    }
}
