package com;

import java.util.concurrent.Semaphore;

// 1.0 Имеется одна пристань и несколько контейнеров.
// Контейнеры по очереди попадают в порт и загружаются либо разгружаются.

public class Test {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1, true);
        for (int i=0; i<5; ++i) {
            double d = Math.random();
            int containers = (Math.round(d) == 1) ? (int) (d * 101) : 0;
            new Ship(containers, semaphore);
        }
    }
}
