package rabbit.tests;

import rabbit.RabbitMQBenchmarkBase;

public class MultipleConsumersBenchmark extends RabbitMQBenchmarkBase {

    public MultipleConsumersBenchmark() {
        super(1, 3);
    }
}