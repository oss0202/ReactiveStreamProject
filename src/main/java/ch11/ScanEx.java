package ch11;

import io.reactivex.Flowable;

public class ScanEx {
    public static void main(String[] args) {
        Flowable<Integer> flowable = Flowable.just(1,2,3,4,5)
                .scan(0, (sum, data) -> sum + data);

        flowable.subscribe(integer -> System.out.println(integer));
    }
}
