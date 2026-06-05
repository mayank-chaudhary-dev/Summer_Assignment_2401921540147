public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser k = new KidUser();

        k.age=10;
        k.registerAccount();
        k.age=18;
        k.registerAccount();

        k.bookType="Kids";
        k.requestBook();
        k.bookType="Fiction";
        k.requestBook();


        AdultUser a = new AdultUser();

        a.age=5;
        a.registerAccount();
        a.age=23;
        a.registerAccount();

        a.bookType="Kids";
        a.requestBook();
        a.bookType="Fiction";
        a.requestBook();
    }
}
