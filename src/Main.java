public class Main {

    public static void main(String[] args) {

        SalesManager convert = new SalesManager(new long[]{10,5,8});
        convert.max();
        System.out.println(convert.max());
        System.out.println(convert.medium());
    }
}
