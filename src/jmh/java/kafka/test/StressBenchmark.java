package kafka.test;

import kafka.KafkaProducerConsumerBenchmarkBase;

public class StressBenchmark extends KafkaProducerConsumerBenchmarkBase {
    public StressBenchmark() {
        super(10, 10);
    }
}
