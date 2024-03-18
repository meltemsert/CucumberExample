package tests;

import org.testng.annotations.Test;

public class AddAndEditStepsTest extends BaseTest {

    @Test
    public void addAndRecordTest() {
        pageManager.addAndEditPage.openWebTables();
        pageManager.addAndEditPage.testAddAndRecordInWebTable(
                "Meltem",
                "Sert",
                "meltemsert29@gmail.com",
                "30",
                "50000",
                "EGM");
    }

    @Test
    public void addAndEditRecordTest() {
        pageManager.addAndEditPage.openWebTables();
        pageManager.addAndEditPage.testAddAndEditRecordInWebTable("55000");
    }
}
