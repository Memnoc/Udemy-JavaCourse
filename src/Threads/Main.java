package Threads;

import static Threads.ThreadColor.ANSI_GREEN;
import static Threads.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from Main Thread");

        Thread anotherThread = new AnotherThread();
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
                super.run();
            }

        });

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the Main Thread");
        //another.start();


    }
}
