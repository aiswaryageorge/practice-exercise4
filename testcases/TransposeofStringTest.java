import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeofStringTest {

    TransposeofString st;

    @Before
    public void setUp() throws Exception {
        st= new TransposeofString();
    }

    @After
    public void tearDown() throws Exception {
        st=null;
    }

    @Test
    public void transpose()
    {
        String s="a quick brown fox jumps over the lazy dog";
        String result=st.reverseWordInString(s);
        assertEquals( "a kciuq nworb xof spmuj revo eht yzal god",result);
    }

}
