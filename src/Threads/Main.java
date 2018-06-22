package Threads;

import java.sql.SQLOutput;

import static Threads.ThreadColor.ANSI_GREEN;
import static Threads.ThreadColor.ANSI_PURPLE;
import static Threads.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from Main Thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName(" == Another Thread ==");
        //AnotherThread another =  new AnotherThread(); // good example of polymorphism
        anotherThread.start();

        // Now we can try to call start90; but this time using a anonymous class

        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the Anonymous class Thread");

            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class implementation of run()");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "Another Thread terminated, or timed out, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println( ANSI_RED + "I couldn't wait after all. I was interrupted.");
                }
            }

        });

        myRunnableThread.start();
        //anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from the Main Thread");
        //another.start();


    }
}
