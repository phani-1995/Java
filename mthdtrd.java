// getName(), setname()
class testmethod extends Thread {
    public void run(){
        System.out.println("Runing....!!");
    }

    public static void main(String... args){
        testmethod t1 = new testmethod();
        testmethod t2 = new testmethod();
        System.out.println("Name of thread: "+t1.getName());
        System.out.println("Name of thread t2: "+t2.getName());
        System.out.println("Id of thread t1: "+t1.getId());

        t1.start();
        t2.start();

        t1.setName("Sonu");
        System.out.println("After changing name of t1:"+t1.getName());
    }
}
