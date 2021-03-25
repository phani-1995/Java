class creatingthread extends Thread {
    public void run(){
        System.out.println("Thread is running...!!!!!");
    }
    public static void main(String... args){
        creatingthread t1 = new creatingthread();
        t1.start();
    }
}

