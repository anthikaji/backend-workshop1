## Circular buffer
1. Data structure ? (Internal)
    - Array of String
2. Operations/Behavior/Methods ? user -> CB ?
    - writeData(string):void
    - readData(): string
    - isFull(): boolean
    - isEmpty(): boolean
    - setSize(int): void
3. Internal process ?
    - buffer size = 10 (default)
    - read pointer = 0
    - write pointer = 0
- List of test cases
    - TC01 => create_new_buffer_should_empty
    - TC02 => create_new_Buffer_with_default_size_should_10
    - TC03 => write_A_and_B_to_buffer_should_read_A_and_B
    - TC04 => Overwrite_B_instead_A_in_first_index_if_data_full
    - TC05 => if_buffer_empty_data_read_should_be_null