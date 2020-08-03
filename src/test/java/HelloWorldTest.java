import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void sayHi_should_return_Hello_World(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("Hello World" , result);

    }
    @Test
    public void sayHi_with_Anthika_should_return_Hello_World(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("anthikA");
        assertEquals("Hello AnthikA" , result);

    }
    @Test
    public void sayHi_with_Mint_should_return_Hello_World(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("mint");
        assertEquals("Hello Mint" , result);

    }

}