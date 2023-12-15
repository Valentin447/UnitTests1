package task1;

public class Calculator {
    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if(purchaseAmount < 0 || discountAmount > 100 || discountAmount < 0){
            throw new ArithmeticException("Invalid arguments");
        }
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        return purchaseAmount * ((100 - (double)discountAmount) / 100); // Метод должен возвращать сумму покупки со скидкой
    }

}
