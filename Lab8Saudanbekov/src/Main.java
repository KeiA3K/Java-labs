import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Threads: ");
        List<MyCube> myCubes = new ArrayList<>();
        myCubes.add(new MyCube(3, 4, 5));
        myCubes.add(new MyCube(17, 45, 50));
        myCubes.add(new MyCube(40, 11, 23));
        myCubes.add(new MyCube(47, 17, 29));
        myCubes.add(new MyCube(53, 61, 30));

        for (int i = 0; i< myCubes.size(); i++){
            MyThread object = new MyThread(myCubes.get(i));
            object.start();
        }

        System.out.println("Runnable threads: ");
        List<MyCube> myRunnableCubes = new ArrayList<>();
        myRunnableCubes.add(new MyCube(3, 4, 5));
        myRunnableCubes.add(new MyCube(17, 45, 50));
        myRunnableCubes.add(new MyCube(40, 11, 23));
        myRunnableCubes.add(new MyCube(47, 17, 29));
        myRunnableCubes.add(new MyCube(53, 61, 30));

        for (int i = 0; i< myRunnableCubes.size(); i++){
            Thread object = new Thread(new MyRunnableThread(myRunnableCubes.get(i)));
            object.start();
        }
    }
}

