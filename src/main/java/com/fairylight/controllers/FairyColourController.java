package com.fairylight.controllers;

import com.fairylight.LightArray;

/**
 * Created by vamshikirangullapelly on 12/01/2019.
 *
 */
public class FairyColourController extends AbstractFairyController {
    private final String[] listOfColours;

    /**
     * @param li see algController
     * @param t see algController
     * @param colourList set the colour you wish to alternate between with this controller
     * @see AbstractFairyController
     */
    public FairyColourController(LightArray li, int t, String[] colourList) {
        super(li, t);
        listOfColours = colourList;
    }

    /**
     *@see AbstractFairyController
     */
    @Override
    public void run() {
        try {
            while (true) {
                for (String col : listOfColours) {
                    super.getLightArr().switchColourLight(col);

                    Thread.sleep(super.getTime());

                    super.getLightArr().switchColourLight(col);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

