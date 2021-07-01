package hello.itemservice.validation;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.ObjectError;

import static org.assertj.core.api.Assertions.*;

public class MessageCodesResolverTest {

    MessageCodesResolver codesResolver = new DefaultMessageCodesResolver();

    @Test
    public void messageCodesResolverObject() throws Exception {
        //given
        String[] messageCodes = codesResolver.resolveMessageCodes("required", "item");
        //when

        //then
        for (String messageCode : messageCodes) {
            System.out.println("messageCode = " + messageCode);
        }



     }
}
