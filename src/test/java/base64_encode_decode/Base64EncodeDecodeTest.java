package base64_encode_decode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Base64;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Base64EncodeDecodeTest {
    @Test
    @DisplayName("Base64 Encode and Decode test")
    void testOne() {
        Base64.Encoder urlEncoder = Base64.getUrlEncoder();
        Base64.Decoder urlDecoder = Base64.getUrlDecoder();
        assertAll("Base64 Encoder",
                () -> {
                    String urlString = "http://www.javatpoint.com/java-tutorial/";
                    assertAll(
                            () -> assertEquals(
                                    "aHR0cDovL3d3dy5qYXZhdHBvaW50LmNvbS9qYXZhLXR1dG9yaWFsLw==",
                                    urlEncoder.encodeToString(urlString.getBytes()),
                                    "should encode the URL"),
                            () -> assertEquals(
                                    new String(urlDecoder.decode("aHR0cDovL3d3dy5qYXZhdHBvaW50LmNvbS9qYXZhLXR1dG9yaWFsLw==")),
                                    urlString,
                                    "should decode the URL")
                    );
                });
    }
}
