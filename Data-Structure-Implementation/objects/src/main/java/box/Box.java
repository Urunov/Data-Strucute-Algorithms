package box;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {ObjectSamples}
 * @Date: {2022/02/09 && 8:46 PM}
 */
public class Box {
    //
    double width;
    double height;
    double depth;

    public Box() {
    }

//    public Box(double w, double h, double d) {
//
//        this.width = w;
//        this.height = h;
//        this.depth = d;
//    }

    void volume() {
        System.out.println("Volume is : ");
        System.out.println(width * height * depth);
    }

    int sizeValue(int i){
        return i * i;
    }
}
