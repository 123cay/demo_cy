/**
 * 超市做促销活动，草莓限时打 8 折。现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
 * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 */
public class FruitCalculator03 {

    public static double calculateTotalPrice(int applesPounds, int strawberriesPounds,int mangoPricePerPounds) {
        int applePricePerPound = 8;
        int StrawberryPricePerPound = 13;
        int mangoPricePerPound = 20;
        double totalPrice = (applesPounds * applePricePerPound) + (strawberriesPounds * StrawberryPricePerPound * 0.8) + (mangoPricePerPounds * mangoPricePerPound);
        return  totalPrice;
    }

    public static void main(String[] args) {
        int applesPounds = 10;
        int strawberriesPounds = 10;
        int mangoPricePerPounds = 10;
        double totalPrice = calculateTotalPrice(applesPounds, strawberriesPounds,mangoPricePerPounds);
        System.out.println("顾客A购买的水果总价为: " + totalPrice + "元");
    }
}