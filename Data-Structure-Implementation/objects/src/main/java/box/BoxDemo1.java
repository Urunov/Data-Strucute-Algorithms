package box;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {ObjectSamples}
 * @Date: {2022/02/09 && 8:46 PM}
 */
public class BoxDemo1 {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // assign values to mybox2'x instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;


        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume is : " + vol);

        // compute volume of second box
        vol = mybox2.depth * mybox2.height * mybox2.width;
        System.out.println("Volume is 2 " + vol);

        // Assigning object reference variable
        Box b1 = new Box();
        Box b2 = b1;

        b1= null;
        System.out.println("b1 ="+ b1);

        // After adding method in the Box class
        System.out.println("-------- After adding method ------");
        mybox1.volume();
        mybox2.volume();

        // size of Box class inside size method
        Box size1 = new Box();
        System.out.println("size => " + size1.sizeValue(9));


        // Garbage Collection
        System.runFinalization();
        Runtime.getRuntime().gc();
        System.gc();
    }
}
