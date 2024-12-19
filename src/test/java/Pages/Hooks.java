package Pages;

import Utility.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;


public class Hooks {
    @After
    public void tearDown(Scenario scenario) {
        GWD.quitDriver();
    }
}
