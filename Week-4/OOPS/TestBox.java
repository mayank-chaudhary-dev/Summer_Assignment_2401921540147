public class TestBox {

    public static void main(String[] args) {
        Box box = new Box(10, 5);
        System.out.println("Area = " + box.area());
        Box3D box3D = new Box3D(10, 5, 4);
        System.out.println("Area = " + box3D.area());
        System.out.println("Volume = " + box3D.volume());
    }
}
