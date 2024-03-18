package common;

import pages.AddAndEditPage;
import pages.ButtonPage;

public class PageFactory {
    public static ButtonPage buildButtonPage() {
        return new ButtonPage("/");
    }

    public static AddAndEditPage buildEditPage() {
        return new AddAndEditPage("/");

    }
}
