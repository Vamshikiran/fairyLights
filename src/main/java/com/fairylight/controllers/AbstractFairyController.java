package com.fairylight.controllers;

import com.fairylight.LightArray;

/**
 * Created by vamshikirangullapelly on 12/01/2019.
 * abstract controller algorithm Class
 */

public abstract class AbstractFairyController implements Runnable{

    private LightArray lightArr;
    private int time; //time delay used when extended

    /**
     * algController constructor
     * @param li lights Array that will be mainpulated with this programme.
     * @param t time in millisec used to hold the delay of switching light ON or OFF.
     */
    public AbstractFairyController(LightArray li, int t) {
        lightArr = li;
        time = t;
    }


    /**
     *
     */
    public void run() {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public LightArray getLightArr() {
        return lightArr;
    }

    public void setLightArr(LightArray lightArr) {
        this.lightArr = lightArr;
    }
}