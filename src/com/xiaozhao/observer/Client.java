package com.xiaozhao.observer;

import org.junit.Test;

/**
 * Created by xiaozhao on 2016/12/22.
 */
public class Client {


    @Test
    public void test(){
        Mouse mouse = new Mouse();

        IObserver cat = new Cat();
        IObserver master = new Master();

        mouse.attachObserver(cat);
        mouse.attachObserver(master);

        mouse.pushGlass();

    }

}
