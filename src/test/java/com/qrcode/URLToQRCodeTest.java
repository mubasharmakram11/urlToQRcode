package com.qrcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class URLToQRCodeTest {
    @Test
    public void testQRCodeGeneration() throws Exception {
        String url = "https://www.example.com";
        
        // Test should not throw any exception
        URLToQRCode.displayQRCode(url);
        
        // If we reach here, the test passed
        assertTrue(true);
    }
}
