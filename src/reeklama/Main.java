package reeklama;

public class Main {

    public static void main(String[] args) {
        String test = "Hello my name is Dmitry and i'm noob in this life";
        System.out.println(test);
        System.out.println(MurmurHash.hash64(test));
    }
}
