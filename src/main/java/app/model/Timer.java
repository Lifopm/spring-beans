package app.model;

import org.springframework.beans.factory.annotation.Qualifier;

public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
