package ch06;

import io.reactivex.Flowable;

public class ColdPublisherExample {
    public static void main(String[] args) {
        Flowable<Integer> flowable = Flowable.just(1,2,3,4);
        flowable.subscribe(data -> System.out.println("구독 데이터 1 :" + data));
        flowable.subscribe(data -> System.out.println("구독 데이터 2 :" + data));
    }
}
