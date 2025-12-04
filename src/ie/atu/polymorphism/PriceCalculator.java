package ie.atu.polymorphism;

public class PriceCalculator {

    public double calculatePrice(double basePrice){
        return basePrice;
    }
    public double calculatePrice(double basePrice, double discountPercent){
        return basePrice-(basePrice*(discountPercent/100));
    }
    public double calculatePrice(double basePrice, double discountPercent, boolean hasStudentId){
        if (hasStudentId) {
            return calculatePrice(basePrice, hasStudentId)-(calculatePrice(basePrice, hasStudentId)*(discountPercent/100));
        } else {
            return calculatePrice(basePrice, discountPercent);
        }
    }
    public double calculatePrice(double basePrice, boolean hasStudentId){
        if (hasStudentId) {
            if (basePrice-5>0) {
                return basePrice-5;
            } else {
                return basePrice;
            }
        } else {
            return basePrice;
        }
    }
}
