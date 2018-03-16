package ch11;

import io.reactivex.Flowable;
import io.reactivex.Single;

public class ReduceEx {
    public static void main(String[] args) {
        Single<Integer> single = Flowable.just(1,2,3,4,5)
                .reduce(0, (sum, data) -> sum + data);

        single.subscribe(integer -> {
            System.out.println(integer);
        },throwable -> {
            System.out.println(throwable);
         });
    }
}
