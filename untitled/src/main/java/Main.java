public class Main {

    public static void main(String[] args) {

        SalesManager convert = new SalesManager(new long[]{183148540,58486,788731,848485,4847647,7467254,6459173,247613,47912463});
        convert.max();
        System.out.println(convert.max());
        System.out.println(convert.medium());
    }
}
