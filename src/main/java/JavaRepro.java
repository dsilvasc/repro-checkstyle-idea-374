public class JavaRepro {
    int unused_int = 6;

    public static void main() {
        int foo = 5;
        int bad_name$ = foo + 2;
        System.out.println(bad_name$);
    }
}
