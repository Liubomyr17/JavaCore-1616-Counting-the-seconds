package com.company;

/*

1616 We consider seconds
1. Write the implementation of the run method in the Stopwatch thread (stopwatch).
2. Stopwatch must count the number of seconds that elapsed from creating the thread to entering the string.
3. Display the number of seconds in the console.

Requirements:
1. The Stopwatch class run method must contain a loop.
2. The run method should call Thread.sleep (1000).
3. The run method must increase the value of the seconds field by 1 every second.
4. After stopping the Stopwatch thread (calling the interrupt method), the run method must output the number of seconds (seconds) to the console.
5. There must be only one run method in the Stopwatch class.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                //add your code here - добавьте код тут
                while (!isInterrupted()) {
                    seconds += 1;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}


