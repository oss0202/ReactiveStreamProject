package ch06;

import io.reactivex.processors.PublishProcessor;

public class HotPublisherExample {
    public static void main(String[] args) {
        PublishProcessor<Integer> processor = PublishProcessor.create();
        processor.subscribe(data -> System.out.println("구독 데이터1 : " + data));
        processor.onNext(1);
        processor.onNext(2);

        processor.subscribe(data -> System.out.println("구독 데이터2 : " + data));
        processor.onNext(3);
        processor.onNext(4);

        processor.onComplete();
    }
}
