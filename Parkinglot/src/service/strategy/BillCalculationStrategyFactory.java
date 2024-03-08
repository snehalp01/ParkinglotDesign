package service.strategy;

public class BillCalculationStrategyFactory {
        public static BillCalculationStrategy getBill(){
            return new SimpleBillCalculationStrategy();
        }
}
