import org.junit.Test;

import static org.junit.Assert.*;

public class PresenceofNameTest {
    PresenceofName b;

    @org.junit.Before
    public void setUp() throws Exception {
        b=new PresenceofName();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        b = null;
    }

        String s="hey this is aish";
        String find="aish";
        @Test
        public void presence()
        {
            String res=b.sortAlpha(s,find);
            assertEquals(true,res);
        }
    }
