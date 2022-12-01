public class MyThread extends Thread{
    MyCube myCube;

    public MyThread(MyCube myCube){
        this.myCube = myCube;
    }

    public void run(){
        try{
            System.out.println(
                    "Thread " + Thread.currentThread().getId() +
                            " is counting volume " +(myCube.height * myCube.width * myCube.length));
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}

