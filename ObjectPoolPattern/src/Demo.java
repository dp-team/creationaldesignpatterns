public class Demo {
    public static void main(String[] args) {
        EnglishMenuPool pool = new EnglishMenuPool();
        System.out.println(pool);
        System.out.println("check out");
        EnglishMenu menu1 = pool.checkOut();
        System.out.println(pool);
        System.out.println("check out");
        EnglishMenu menu2 = pool.checkOut();
        System.out.println(pool);
        System.out.println("check in");
        pool.checkIn(menu2);
        System.out.println(pool);
        System.out.println("check in");
        pool.checkIn(menu1);
        System.out.println(pool);
    }
}
