import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statsservice.StatsService;

//сумма всех продаж
public class StatsServiceTest {

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sum(sales);
        int expected = 180;
        

        Assertions.assertEquals(expected, actual);
    }

    //Средняя сумма продаж в месяц

        @Test
        public void testMedium() {
            StatsService service = new StatsService();
            int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

            int actual = service.mediumSales(sales);
            int expected = 180 / 12;


            Assertions.assertEquals(expected, actual);
        }

    //Номер месяца, в котором был пик продаж.

    @Test
    public void testmax() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.max(sales);
        int expected = 8;


        Assertions.assertEquals(expected, actual);
    }

    //Номер месяца, в котором был минимум продаж.

    @Test
    public void testmin() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.min(sales);
        int expected = 9;


        Assertions.assertEquals(expected, actual);
    }

    //Количество месяцев, в которых продажи были ниже среднего.

    @Test
        public void testMinAverage()  {
            StatsService service = new StatsService();
            int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

            int actual = service.belowAverage(sales);
            int expected = 5;


            Assertions.assertEquals(expected, actual);
    }

    //Количество месяцев, в которых продажи были выше среднего.

    @Test
    public void testMaxAverage()  {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.belowAverage(sales);
        int expected = 5;


        Assertions.assertEquals(expected, actual);
    }
}
