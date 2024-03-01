/**
 * 促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。现在顾客 D 在超市购买了若干斤苹果、
 * 草莓和芒果，需计算一共需要多少钱？请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，
 * 计算并返回所购买商品的总价
 */
public class FruitCalculator04 {

    public static double calculateTotalPrice(int applesPounds, int strawberriesPounds,int mangoPricePerPounds) {
        int applePricePerPound = 8;
        int StrawberryPricePerPound = 13;
        int mangoPricePerPound = 20;
        double totalPrice = ((applesPounds * applePricePerPound) + (strawberriesPounds * StrawberryPricePerPound * 0.8) +
                (mangoPricePerPounds * mangoPricePerPound))-(Math.floor(((applesPounds * applePricePerPound) + (strawberriesPounds * StrawberryPricePerPound * 0.8) +
                (mangoPricePerPounds * mangoPricePerPound))/100)*10);
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