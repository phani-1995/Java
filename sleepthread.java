class sleepthread extends Thread{
    public void run(){
        for(int i=0;i<=5;i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String... args){
        sleepthread s1 = new sleepthread();
        s1.start();
//        System.out.println(s1);
    }
}
