import org.junit.Test;

import static org.junit.Assert.*;

public class SortStringTest {
    SortString ob;

    @org.junit.Before
    public void setUp() throws Exception {
        ob=new SortString();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        ob = null;
    }
        String s="geo ass";
        @Test
        public void alphaSort()
        {
            ob=new SortString();
            String res=ob.sortStr(s);
            assertEquals("[ass,geo]",res);
        }

    }