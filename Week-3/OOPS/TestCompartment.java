import java.util.Random;

public class TestCompartment {

    public static void main(String[] args) {
        Compartment[] arr = new Compartment[10];
        Random random = new Random();
        for (int i=0; i <arr.length;i++) {
            int num = random.nextInt(4)+1;
            switch (num) {
                case 1:
                    arr[i] = new FirstClass();
                    break;
                case 2:
                    arr[i] = new Ladies();
                    break;
                case 3:
                    arr[i] = new General();
                    break;
                case 4:
                    arr[i] = new Luggage();
                    break;
            }
        }
        System.out.println("Notices of Compartments:");
        for (Compartment c : arr) {
            System.out.println(c.notice());
        }
    }
}
