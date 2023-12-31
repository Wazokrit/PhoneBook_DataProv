package manager;

import models.Contact;
import models.User;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProviderData {

    @DataProvider
    public Iterator<Object[]> userDTO(){ // Data Transfer Object = DTO
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{
                User.builder()
                .email("abc@def.com")
                .password("$Abcdef12345")
                .build()
        });
        list.add(new Object[]{
                User.builder()
                        .email("abc@def.com")
                        .password("$Abcdef12345")
                        .build()
        });
        list.add(new Object[]{
                User.builder()
                        .email("abc@def.com")
                        .password("$Abcdef12345")
                        .build()
        });
        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> contactDTO() { // Data Transfer Object = DTO
        List<Object[]> list = new ArrayList<>();
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        list.add(new Object[]{
                Contact.builder()
                        .name("John")
                        .lastName("Silver")
                        .phone("12345678" + i)
                        .email("john_" + i + "@mail.com")
                        .address("Rehovot")
                        .description("Pirate")
                        .build()
        });

        list.add(new Object[]{
                Contact.builder()
                        .name("John")
                        .lastName("Silver")
                        .phone("12345678" + i)
                        .email("john_" + i + "@mail.com")
                        .address("Rehovot")
                        .description("Pirate")
                        .build()
        });
        list.add(new Object[]{
                Contact.builder()
                        .name("John")
                        .lastName("Silver")
                        .phone("12345678" + i)
                        .email("john_" + i + "@mail.com")
                        .address("Rehovot")
                        .description("Pirate")
                        .build()
        });


        return list.iterator();
    }
}
