package org.example.decorator;

public class Client {
    static void main() {
        Notifier notifier = new SlackDecorator(new SmsDecorator(new EmailNotifier()));
        notifier.send("Hello Salokya !");
    }
}
