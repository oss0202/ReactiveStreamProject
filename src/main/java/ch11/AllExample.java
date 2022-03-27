package ch11;

import io.reactivex.Flowable;
import io.reactivex.Single;

import javax.xml.crypto.Data;
import java.util.concurrent.TimeUnit;

public class AllExample {
    public static void main(String[] args) {
        Single<Boolean> single = Flowable.interval(100L, TimeUnit.MILLISECONDS)//<- Flowable을 생성
                .take(3) //<- 3건까지 통지(0,1,2 통지)
                .all(data -> data < 5);

        single.subscribe();
    }
}
