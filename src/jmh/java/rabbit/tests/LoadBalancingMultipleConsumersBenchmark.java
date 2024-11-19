package rabbit.tests;

import rabbit.RabbitMQBenchmarkBase;

public class LoadBalancingMultipleConsumersBenchmark extends RabbitMQBenchmarkBase {

    public LoadBalancingMultipleConsumersBenchmark() {
        super(3, 3);
    }
}