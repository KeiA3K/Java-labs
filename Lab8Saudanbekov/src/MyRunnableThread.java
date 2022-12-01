public class MyRunnableThread implements Runnable {
    MyCube myCube;

    public MyRunnableThread(MyCube myCube){
        this.myCube = myCube;
    }

    public void run(){
        try{
            System.out.println(
                    "Thread " + Thread.currentThread().getId() +
                            " is counting volume: " +(myCube.height * myCube.width * myCube.length));
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }

}