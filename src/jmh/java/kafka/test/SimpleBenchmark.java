package kafka.test;

import kafka.KafkaProducerConsumerBenchmarkBase;

public class SimpleBenchmark extends KafkaProducerConsumerBenchmarkBase {
    public SimpleBenchmark() {
        super(1, 1);
    }
}
