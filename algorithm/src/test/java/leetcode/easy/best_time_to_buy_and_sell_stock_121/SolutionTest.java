package leetcode.easy.best_time_to_buy_and_sell_stock_121;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

class SolutionTest {

    private Solution sut;

    @BeforeEach
    void setUp() {
        sut = new Solution();
    }

    @Test
    public void case1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expectedMaxProfit = 5;

        Assertions.assertEquals(expectedMaxProfit, sut.maxProfit(prices));
    }

    @Test
    public void case2() {
        int[] prices = {7, 6, 4, 3, 1};
        int expectedMaxProfit = 0;

        Assertions.assertEquals(expectedMaxProfit, sut.maxProfit(prices));
    }

    @Test
    public void case3() throws IOException {
        int[] prices = {};
        int expectedMaxProfit = 999;

        try (InputStream inputStream = getClass().getResourceAsStream("/leetcode_121_case3_prices.json")) {
            if (inputStream != null) {
                String jsonString = new String(inputStream.readAllBytes());

                ObjectMapper objectMapper = new ObjectMapper();
                prices = objectMapper.readValue(jsonString, int[].class);
            }
        }

        Assertions.assertEquals(expectedMaxProfit, sut.maxProfit(prices));
    }

}