package com.lambton;

public class MultiThread extends Thread {

        public void run(){
            System.out.println("thread is running...");

            for(int i=1;i<5;i++){
                try{Thread.sleep(1000);}
                catch(InterruptedException e){System.out.println(e);}
                System.out.println(i);
            }
        }
}
