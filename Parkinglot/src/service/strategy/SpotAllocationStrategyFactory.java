package service.strategy;

public class SpotAllocationStrategyFactory {

    public static SpotAllocationStrategy getSpotAllocationStrategy(){
        return new LinearSpotAllocationStrategy();
    }
}
