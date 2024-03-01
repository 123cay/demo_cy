/**
 * 有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。现在顾客 A 在
 * 超市购买了若干斤苹果和草莓，需要计算一共多少钱？请编写函数，对于 A 购买的水果斤数
 * (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 */
public class FruitCalculator01 {

    public static int calculateTotalPrice(int applesPounds, int strawberriesPounds) {
        int applePricePerPound = 8;
        int StrawberryPricePerPound = 13;
        int totalPrice = (applesPounds * applePricePerPound) + (strawberriesPounds * StrawberryPricePerPound);
        return totalPrice;
    }

    public static void main(String[] args) {
        int applesPounds = 2;
        int strawberriesPounds = 2;
        int totalPrice = calculateTotalPrice(applesPounds, strawberriesPounds);
        System.out.println("顾客A购买的水果总价为: " + totalPrice + "元");

    }
}