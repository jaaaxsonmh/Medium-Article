package java_examples;

public class Sum {

    public static void main(String args[]) {
        System.out.println(sum(5, 6));
    }

    // But this is static, to sum with non-static need to create object.
    private static int sum(int a, int b) {
        return a + b;
    }
}
