package com.fairylight.controllers;


import com.fairylight.LightArray;

import static com.fairylight.util.Helper.ALG_RUN_DURATION_IN_MILLIS;


/**
 * Created by vamshikirangullapelly on 12/01/2019.
 *
 */
public class FairySeqController extends AbstractFairyController {
    private int seq = 0;

    /**
     * @param li see algController
     * @param t see algController
     * @see AbstractFairyController
     */
    public FairySeqController(LightArray li, int t) {
        super(li, t);
    }

    /**
     *@see AbstractFairyController
     */
    @Override
    public void run() {
        try {
            long startTime = System.currentTimeMillis();
            long endTime = System.currentTimeMillis();
            while (endTime - startTime < ALG_RUN_DURATION_IN_MILLIS) {
                if (seq > super.getLightArr().getLightArraySize()) {
                    seq = 0;
                }

                super.getLightArr().changeLight(seq);


                Thread.sleep(super.getTime());

                super.getLightArr().changeLight(seq);

                seq++;
                endTime = System.currentTimeMillis();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

