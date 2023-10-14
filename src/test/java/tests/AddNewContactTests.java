package tests;

import manager.ProviderData;
import models.Contact;
import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewContactTests extends TestBase{


    @BeforeMethod(alwaysRun = true)
    public void precondition(){
        if(!app.getHelperUser().isLogged()) app.getHelperUser().login(
                User.builder()
                        .email("abc@def.com")
                        .password("$Abcdef12345")
                        .build()

        );
    }

@Test( groups = {"positive","smoke"}, dataProvider = "contactDTO", dataProviderClass = ProviderData.class)
    public void addNewContactPositive(Contact contact){
    app.getHelperContact().openContactForm();
    app.getHelperContact().fillContactForm(contact);
    app.getHelperContact().submitContactForm();
    Assert.assertTrue(app.getHelperContact().isContactCreated(contact));

}

}
