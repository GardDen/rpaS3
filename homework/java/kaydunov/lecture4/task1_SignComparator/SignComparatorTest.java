package task1_SignComparator;

public class SignComparatorTest {
    public static void main(String[] args) {
        SignComparator comparator = new SignComparator();
        System.out.println(comparator.compare(13));
        System.out.println(comparator.compare(-123));
        System.out.printf(comparator.compare(0));
    }
}
