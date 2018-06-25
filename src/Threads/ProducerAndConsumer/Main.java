package Threads.ProducerAndConsumer;

// We are gonna have two threads in this application: one that produces, one that consumes messages
// This will demonstrate how to synchronize critical sections of code and prevent race conditions
// Specifically, we'll look at methods that can only be called within synchronized code: wait(); notify(); notifyAll();

import java.util.Random;

public class Main {

    public static void main(String[] args) {

    }
}

class Message {

    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {

        }
        empty = true;
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {

        }
        empty = false;
        this.message = message;
    }

}

class Writer implements Runnable {

    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
                "This is the message number 1",
                "This is the message number 2",
                "This is the message number 3",
                "This is the message number 4",
        };

        Random random = new Random();

        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
            }
        }
        message.write("Finish");
    }
}