package ch12;

import io.reactivex.processors.PublishProcessor;
import org.reactivestreams.Processor;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class ProcessorEx {
    public static void main(String[] args) {
        Processor<Integer, Integer> processor = PublishProcessor.create();

        processor.subscribe(new Subscriber<Integer>() {
            @Override
            public void onSubscribe(Subscription s) {
                System.out.println("ProcessorEx.onSubscribe");
                s.request(Long.MAX_VALUE);
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("ProcessorEx.onNext() -> " + integer);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("ProcessorEx.onError");
            }

            @Override
            public void onComplete() {
                System.out.println("ProcessorEx.onComplete");
            }
        });

        processor.onNext(1);
        processor.onNext(2);
        processor.onNext(3);
        processor.onComplete();
    }
}
