package tests;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends TestBase{
    @BeforeTest
    public void preConditions() {
        if (app.getUser().isLogged()) {
            app.getUser().logOut();
        }
    }



    @Test
    public void loginPositive1() {
       // User user = new User().withEmail("mayadurdyyeva1992@gmail.com").withPassword("Mavlyuda1992");
        User user= User.builder().email("mayadurdyyevva1992@gmail.com").password("Mavlyuda1992").build();

        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillLoginForm(user);
        app.getUser().submitLogin();
        app.getUser().pause(2000);


        Assert.assertTrue(app.getUser().isLogged());

    }

    @Test
    public void loginPositive2() {

        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillLoginForm2("mayadurdyyeva1992@gmail.com","Mavlyuda1992");
        app.getUser().submitLogin();
        app.getUser().pause(2000);


        Assert.assertTrue(app.getUser().isLogged());


    }
}
