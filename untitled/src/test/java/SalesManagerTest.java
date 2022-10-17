import org.junit.jupiter.api.*;

public class SalesManagerTest {
    private SalesManager salesManager;

    @BeforeEach
    @DisplayName("Погнали тестить!")
    void setUp() {
        salesManager = new SalesManager(new long[]{10, 5, 8});
    }


    @Test
    @DisplayName("Тест на макс")
    void testOne() {
        Assertions.assertEquals(10, salesManager.max());
        System.out.println("Тест номер один выполнен");
    }

    @Test
    @DisplayName("Тест на мин")
    void testTwo() {
        Assertions.assertEquals(5, salesManager.min());
        System.out.println("Тест номер два выполнен");
    }

    @Test
    @DisplayName("Тест на сред")
    void testThree() {
        Assertions.assertEquals(8, salesManager.medium());
        System.out.println("Тест номер три выполнен");
    }

    @AfterEach
    @DisplayName("Конец теста")
    void setDown() {
        System.out.println("Хватит тестить");
    }


}
