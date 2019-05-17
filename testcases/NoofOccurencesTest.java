import org.junit.Test;

import static org.junit.Assert.*;

public class NoofOccurencesTest {
    NoofOccurences oc;

    @org.junit.Before
    public void setUp() throws Exception {
        oc=new NoofOccurences();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        oc = null;
    }

        String s="aiswarya";
        @Test
        public void occurences()
        {
            int result= oc.totOccurences(s);
            assertEquals(3,result);
        }

    }
