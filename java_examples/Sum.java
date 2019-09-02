package java_examples;

public class Sum {

    public static void main(String args[]) {
        System.out.println(sum(5, 6));

        // We can also do this using Java.lang.Integer.sum() method
        System.out.println(Integer.sum(10, 15));
    }

    // But this is static, to sum with non-static need to create object.
    private static int sum(int a, int b) {
        return a + b;
    }
}
