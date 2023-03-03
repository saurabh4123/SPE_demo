import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class helloworldTest {
    helloworld obj=new helloworld();
    @Test
    public void testhelloworld(){
        assertEquals("Hello from func....", obj.printy());
    }
}

