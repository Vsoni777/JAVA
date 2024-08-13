class test extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("there is daemon");
        }else{
            System.out.println("not");
        }
    }

/**
 * dmon
 */

    public static void main(String[] args) {
        test t1=new test();
        t1.setDaemon(true);
        t1.start();
    }
}