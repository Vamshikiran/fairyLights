package com.fairylight.controllers;

import com.fairylight.LightArray;
import org.junit.Test;

import static com.fairylight.util.Helper.COL_LIST;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by vamshikirangullapelly on 12/01/2019.
 *
 */
public class AbstractFairyControllerTest {


//    ALT

    @Test
    public void getTimeALT() throws Exception {
        AbstractFairyController alg = new FairyAltController(new LightArray(0),100);
        assertEquals(100,alg.getTime());
    }

    @Test
    public void setTimeALT() throws Exception {
        AbstractFairyController alg = new FairyAltController(new LightArray(0),100);
        alg.setTime(200);
        assertEquals(200,alg.getTime());
    }

    @Test
    public void getLightArrALT() throws Exception {
        LightArray array = new LightArray(0);
        AbstractFairyController alg = new FairyAltController(array,100);
        assertEquals(array,alg.getLightArr());
        assertNotEquals(new LightArray(0),alg.getLightArr());
    }

    @Test
    public void setLightArrALT() throws Exception {
        LightArray array = new LightArray(0);
        LightArray array2 = new LightArray(1);
        AbstractFairyController alg = new FairyAltController(array,100);
        alg.setLightArr(array2);
        assertNotEquals(array,alg.getLightArr());
        assertEquals(array2,alg.getLightArr());
    }





//COL



    @Test
    public void getTimeCOL() throws Exception {
        AbstractFairyController alg = new FairyColourController(new LightArray(0),100,COL_LIST);
        assertEquals(100,alg.getTime());
    }

    @Test
    public void setTimeCOL() throws Exception {
        AbstractFairyController alg = new FairyColourController(new LightArray(0),100,COL_LIST);
        alg.setTime(200);
        assertEquals(200,alg.getTime());
    }

    @Test
    public void getLightArrCOL() throws Exception {
        LightArray array = new LightArray(0);
        AbstractFairyController alg = new FairyColourController(array,100,COL_LIST);
        assertEquals(array,alg.getLightArr());
        assertNotEquals(new LightArray(0),alg.getLightArr());
    }

    @Test
    public void setLightArrCOL() throws Exception {
        LightArray array = new LightArray(0);
        LightArray array2 = new LightArray(1);
        AbstractFairyController alg = new FairyColourController(array,100,COL_LIST);
        alg.setLightArr(array2);
        assertNotEquals(array,alg.getLightArr());
        assertEquals(array2,alg.getLightArr());
    }








// SEQ

    @Test
    public void getTimeSEQ() throws Exception {
        AbstractFairyController alg = new FairySeqController(new LightArray(0),100);
        assertEquals(100,alg.getTime());
    }

    @Test
    public void setTimeSEQ() throws Exception {
        AbstractFairyController alg = new FairySeqController(new LightArray(0),100);
        alg.setTime(200);
        assertEquals(200,alg.getTime());
    }

    @Test
    public void getLightArrSEQ() throws Exception {
        LightArray array = new LightArray(0);
        AbstractFairyController alg = new FairySeqController(array,100);
        assertEquals(array,alg.getLightArr());
        assertNotEquals(new LightArray(0),alg.getLightArr());
    }

    @Test
    public void setLightArrSEQ() throws Exception {
        LightArray array = new LightArray(0);
        LightArray array2 = new LightArray(1);
        AbstractFairyController alg = new FairySeqController(array,100);
        alg.setLightArr(array2);
        assertNotEquals(array,alg.getLightArr());
        assertEquals(array2,alg.getLightArr());
    }




















}