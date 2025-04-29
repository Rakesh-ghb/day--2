public class SimpleInterestCalculator {
    public static void calculateSimpleInterest(double principle , double rate , double time){
        System.out.println("simple intrest : "+(principle*rate*time/100));
    }
    public static void main(String[] args) {
        calculateSimpleInterest(1000.0,5.0,2.0);
        
        
    }
}
