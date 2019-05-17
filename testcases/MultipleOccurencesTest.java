import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurencesTest {
    MultipleOccurences m;

    @org.junit.Before
    public void setUp() throws Exception {
        m=new MultipleOccurences();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        m = null;
    }

        @Test
        public void occurences()
        {
            String text = "She sells seashells by the seashore";

            String find = "se";
            boolean res=m.multOccur(text,find);
            assertEquals( "true",res);
        }
    }


