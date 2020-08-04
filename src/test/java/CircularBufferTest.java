import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CircularBufferTest {

    CircularBuffer cb = new CircularBuffer();
    @Test
    public  void create_new_buffer_should_empty(){
    boolean result =cb.isEmpty();
    assertTrue("Buffer ไม่ว่างนะ",result);
}
    @Test
    public void create_new_Buffer_with_default_size_should_10(){
    for (int i=0 ; i<10; i++) {
        cb.writeData("A" + i);
    }
    boolean result = cb.isFull();
    assertTrue("Buffer isn't full",result);
}
@Test
    public  void  write_A_and_B_to_buffer_should_read_A_and_B(){
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A",cb.readData());
        assertEquals("B",cb.readData());
}
    public  void write_AA_to_buffer_should_read_A(){

    }
    @Test
    public void Overwrite_B_instead_A_in_first_index_if_data_full(){
        for (int i=0; i<10 ; i++) {
            cb.writeData("A"+i);
        }
        cb.writeData("B");
        assertEquals("B", cb.readData());
    }
       @Test
       public void if_buffer_empty_data_read_should_be_null(){
           assertNull("Don't have data in buffer", cb.readData());
    }
}