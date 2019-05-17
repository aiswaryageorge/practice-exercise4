import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {

    ReplaceCharacter c;

    @org.junit.Before
    public void setUp() throws Exception {
        c= new ReplaceCharacter();
    }

    @org.junit.After
    public void tearDown() throws Exception {

        c = null;
    }
        String s="daily dry";

        @Test
        public void replace()
        {
            String res=c.replaceChar(s);
            assertEquals("faity fry",res);
        }
    }