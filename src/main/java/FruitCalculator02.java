/**
 * 超市增加了一种水果芒果，其定价为 20 元/斤。现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，
 * 需计算一共需要多少钱？请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，
 * 计算并返回所购买商品的总价。
 */
public class FruitCalculator02 {

    public static int calculateTotalPrice(int applesPounds, int strawberriesPounds,int mangoPricePerPounds) {
        int applePricePerPound = 8;
        int StrawberryPricePerPound = 13;
        int mangoPricePerPound = 20;
        int totalPrice = (applesPounds * applePricePerPound) + (strawberriesPounds * StrawberryPricePerPound) + (mangoPricePerPounds * mangoPricePerPound);
        return totalPrice;
    }

    public static void main(String[] args) {
        int applesPounds = 1;
        int strawberriesPounds = 1;
        int mangoPricePerPounds = 1;
        int totalPrice = calculateTotalPrice(applesPounds, strawberriesPounds,mangoPricePerPounds);
        System.out.println("顾客A购买的水果总价为: " + totalPrice + "元");
    }
}