package common;

import driver.DriverFactory;
import pages.AddAndEditPage;
import pages.ButtonPage;

public class PageManager {
    public ButtonPage buttonPage;
    public AddAndEditPage addAndEditPage;
    public PageManager() {

        DriverFactory.initDriver();
        buttonPage = PageFactory.buildButtonPage();
        addAndEditPage = PageFactory.buildEditPage();
    }
}
