package com.fairylight;

import com.fairylight.controllers.AbstractFairyController;
import com.fairylight.controllers.FairyAltController;
import com.fairylight.controllers.FairyColourController;
import com.fairylight.controllers.FairySeqController;
import com.fairylight.util.Helper;
import org.junit.Test;

/**
 * Created by vamshikirangullapelly on 12/01/2019.
 *
 */
public class MainTest {

    @Test
    public void main() throws Exception {
        Main main = new Main();
        Helper helper = new Helper();


        Main.main(new String[]{});
        Main.main(new String[]{""});
        Main.main(new String[]{Helper.SEQ});
        Main.main(new String[]{Helper.ALT});
        Main.main(new String[]{Helper.COL});

        Main.main(new String[]{Helper.SEQ,"0"});
        Main.main(new String[]{Helper.ALT,"0"});
        Main.main(new String[]{Helper.COL,"0"});
    }

    @Test
    public void controller(){
        AbstractFairyController abstractFairyController = new AbstractFairyController(new LightArray(0), 0) {};
        FairyColourController algColourController = new FairyColourController(new LightArray(0),0,new String[]{""});
        FairySeqController algSeqController = new FairySeqController(new LightArray(0),0);
        FairyAltController algAltController= new FairyAltController(new LightArray(0),0);


        abstractFairyController.run();
//        algColourController.run();
//        algSeqController.run();
//        algAltController.run();

    }

}