package rabbit.tests;

import rabbit.RabbitMQBenchmarkBase;

public class StressBenchmark extends RabbitMQBenchmarkBase {

    public StressBenchmark() {
        super(10, 10);
    }
}