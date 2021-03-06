package com.fairylight.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vamshikirangullapelly on 12/01/2019.
 *
 */
public class HelperTest {

    @Test
    public void parseArgInt() throws Exception {
        Assert.assertEquals(10,Helper.parseArg(null,10));
        Assert.assertEquals(20,Helper.parseArg("20",10));
        Assert.assertEquals("hi",Helper.parseArg(null,"hi"));
        Assert.assertEquals("bye",Helper.parseArg("bye","hi"));
    }

}