package com.codewiththien.add2num.unittest;

import com.codewiththien.add2num.service.MyBigNumberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.testng.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
class MyBigNumberServiceTest {

    private final MyBigNumberService service = new MyBigNumberService();

   @org.junit.jupiter.api.Test
    void testSum_basic() {
        String result = service.sum("1234", "5678");
        Assertions.assertEquals("6912", result);
    }

    @org.junit.jupiter.api.Test
    void testSum_withCarry() {
        String result = service.sum("999", "1");
        Assertions.assertEquals("1000", result);
    }

    @org.junit.jupiter.api.Test
    void testSum_differentLength() {
        String result = service.sum("12345", "678");
        Assertions.assertEquals("13023", result);
    }
    @org.junit.jupiter.api.Test
    void testSum_emptyString() {
        String result = service.sum("", "123");
        Assertions.assertEquals("123", result);
    }

    @org.junit.jupiter.api.Test
    void testSum_zero() {
        String result = service.sum("0", "0");
        Assertions.assertEquals("0", result);
    }

    @Test
    void testSum_largeNumber() {
        String result = service.sum("999999999999", "1");
        Assertions.assertEquals("1000000000000", result);
    }
}