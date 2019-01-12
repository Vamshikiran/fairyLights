package com.fairylight.controllers;

import com.fairylight.LightArray;

import static com.fairylight.util.Helper.ALG_RUN_DURATION_IN_MILLIS;
import static com.fairylight.util.Helper.COL_LIST;
import static com.fairylight.util.Helper.COL_MILLI_TIME;
import static com.fairylight.util.Helper.SEQ_MILLI_TIME;

/**
 * Created by vamshikirangullapelly on 12/01/2019.
 *
 */
public class FairyAltController extends AbstractFairyController {

    /**
     * @param li see algController
     * @param t see algController
     * @see AbstractFairyController
     */
    public FairyAltController(LightArray li, int t) {
        super(li, t);
    }

    @Override
    public void run() {
        try {
            Thread d;
            long startTime = System.currentTimeMillis();
            long endTime = System.currentTimeMillis();
            while (endTime - startTime < ALG_RUN_DURATION_IN_MILLIS) {
                d = new Thread(new FairySeqController(super.getLightArr(), SEQ_MILLI_TIME));
                d.start();
                Thread.sleep(super.getTime());
                d.interrupt();
                super.getLightArr().turnOffAllTheLights();
                d = new Thread(new FairyColourController(super.getLightArr(), COL_MILLI_TIME, COL_LIST));
                d.start();
                Thread.sleep(super.getTime());
                d.interrupt();
                endTime = System.currentTimeMillis();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}