package stepsDefinition;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesObjects.homePage;

import java.util.List;
import java.util.Map;

public class selectFlyDefinition {

    WebDriver driver = null;
    homePage defineTravel;



    @Given("The user is on board page")
    public void user_is_on_board_page() throws Throwable {
        System.out.println("Starting - browser is open");
        String projectPath = System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.navigate().to("https://www.ryanair.com/gb/en");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.className("cookie-popup-with-overlay__button")).click();
        Thread.sleep(2000);

        System.out.print("Inside Step - user is on board page");
    }

    @And("^Select the departure and destination city$")
    public void Select_the_departure_and_destination_city(DataTable table) throws Throwable {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        defineTravel = new homePage(driver);
        defineTravel.setDeparture(data.get(0).get("departureCity"));
        Thread.sleep(2000);
        driver.findElement(By.id("input-button__destination")).click();
        Thread.sleep(1000);
        defineTravel.setDestination(data.get(0).get("destinationCity"));
        Thread.sleep(2000);
        driver.findElement(By.id("input-button__destination")).sendKeys(Keys.TAB);
        Thread.sleep(1000);
    }

    @And("^Select the depart and return date$")
    public void Select_the_depart_and_return_date(DataTable table) throws Throwable {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        Thread.sleep(2000);

        defineTravel.setMonthYear(data.get(0).get("monthYear"));
        Thread.sleep(1000);
        defineTravel.setDepartDay(data.get(0).get("day"));
        Thread.sleep(1000);
        defineTravel.setReturnMonthYear(data.get(1).get("monthYear"));
        Thread.sleep(1000);
        defineTravel.setReturnDay(data.get(1).get("day"));
    }

    @And("Select the passengers")
    public void Select_the_passengers(DataTable table) throws Throwable {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        System.out.print("Inside Step - user is selecting the passengers");
        defineTravel.setChildrenQtd();
        defineTravel.setAdultQtd();
    }

    @When("I search the fly")
    public void I_search_the_fly() throws Throwable {
        Thread.sleep(1000);
        System.out.print("Inside Step - user clicked to submit");
        defineTravel.setSearchFly();
        Thread.sleep(3000);
    }

    @And("^I define (.*) new depart and (.*) return date$")
    public void I_change_nDptDay_nDptMonth_new_depart_and_nRtnDay_nRtnMonth_the_date(String nDptMonth, String nRtnMonth) throws Throwable {
        @Deprecated
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        Thread.sleep(3000);
        defineTravel.setNewDepartDate(nDptMonth);
        driver.findElement(By.xpath(("//body/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-summary-container[1]/flights-summary[1]/div[1]/div[1]/journey-container[1]/journey[1]/flight-list[1]/div[1]/flight-card[1]/div[1]/div[1]/div[1]/div[1]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Continue with Value fare')]")));
        driver.findElement(By.xpath(("//span[contains(text(),'Continue with Value fare')]"))).click();
        Thread.sleep(1000);

        defineTravel.setNewReturnDate(nRtnMonth);
        driver.findElement(By.xpath(("//body/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-summary-container[1]/flights-summary[1]/div[1]/div[2]/journey-container[1]/journey[1]/flight-list[1]/div[1]/flight-card[1]/div[1]/div[1]/div[1]/div[1]"))).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Continue with Value fare')]")));
        driver.findElement(By.xpath(("//span[contains(text(),'Continue with Value fare')]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='login-touchpoint__login-later h3']")));
        driver.findElement(By.xpath(("//span[@class='login-touchpoint__login-later h3']"))).click();
    }

    @Then("I fill the passengers detail")
    public void I_fill_the_passengers_detail(DataTable table) throws Throwable {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        By mr = By.xpath("//div[contains(text(),'Mr')]");
        By mrs = By.xpath("//div[contains(text(),'Mrs')]");
        By ms = By.xpath("//div[contains(text(),'Ms')]");
        By title1 = By.xpath(("//body/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-lazy-passengers[1]/pax-app-container[1]/pax-app[1]/ry-spinner[1]/div[1]/div[1]/div[2]/pax-app-form-container[1]/pax-app-form[1]/form[1]/pax-passenger-container[1]/pax-passenger[1]/div[1]/pax-passenger-details-container[1]/pax-passenger-details[1]/pax-passenger-details-form-container[1]/pax-details-form[1]/ry-dropdown[1]/div[2]/button[1]"));
        By title2 = By.xpath(("//body/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-lazy-passengers[1]/pax-app-container[1]/pax-app[1]/ry-spinner[1]/div[1]/div[1]/div[2]/pax-app-form-container[1]/pax-app-form[1]/form[1]/pax-passenger-container[2]/pax-passenger[1]/div[1]/pax-passenger-details-container[1]/pax-passenger-details[1]/pax-passenger-details-form-container[1]/pax-details-form[1]/ry-dropdown[1]/div[2]/button[1]"));
        defineTravel.setPassengersFirstNames1(data.get(0).get("name"));
        defineTravel.setPassengersLastNames1(data.get(0).get("lasName"));
        defineTravel.setPassengersFirstNames2(data.get(1).get("name"));
        defineTravel.setPassengersLastNames2(data.get(1).get("lasName"));
        defineTravel.setPassengersFirstNames3(data.get(2).get("name"));
        defineTravel.setPassengersLastNames3(data.get(2).get("lasName"));


        if (data.get(0).get("title").equals("Mr")) {
            driver.findElement(title1).click();
            Thread.sleep(1000);
            driver.findElement(mr).click();
        } else if (data.get(0).get("title").equals("Mrs")) {
            driver.findElement(title1).click();
            Thread.sleep(1000);
            driver.findElement(mrs).click();
        } else if (data.get(0).get("title").equals("Ms")) {
            driver.findElement(title1).click();
            Thread.sleep(1000);
            driver.findElement(ms).click();
        }

        if (data.get(1).get("title").equals("Mr")) {
            driver.findElement(title2).click();
            Thread.sleep(1000);
            driver.findElement(mr).click();
        } else if (data.get(1).get("title").equals("Mrs")) {
            driver.findElement(title2).click();
            Thread.sleep(1000);
            driver.findElement(mrs).click();
        } else if (data.get(1).get("title").equals("Ms")) {
            driver.findElement(title2).click();
            Thread.sleep(1000);
            driver.findElement(ms).click();
        }
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();


    }

    @And("Select the same seats depart and return")
    public void Select_the_seats() throws Throwable {
        {
            {
                @Deprecated
                WebDriverWait wait = new WebDriverWait(driver, 3000);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Okay, got it.')]")));
                driver.findElement(By.xpath("//button[contains(text(),'Okay, got it.')]")).click();
                Thread.sleep(1000);
                By pickSame = By.xpath("//button[contains(text(),'Pick these seats')]");
                driver.findElement(By.xpath("/html[1]/body[1]/seats-root[1]/div[1]/div[1]/seats-container-root[1]/seats-container-v2[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/seat-map[1]/div[1]/div[31]/div[1]/button[1]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html[1]/body[1]/seats-root[1]/div[1]/div[1]/seats-container-root[1]/seats-container-v2[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/seat-map[1]/div[1]/div[31]/div[1]/button[2]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html[1]/body[1]/seats-root[1]/div[1]/div[1]/seats-container-root[1]/seats-container-v2[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/seat-map[1]/div[1]/div[31]/div[1]/button[3]")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//button[contains(text(),'Next flight')]")).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Pick these seats')]")));
                driver.findElement(By.xpath("//button[contains(text(),'Pick these seats')]")).click();
                Thread.sleep(4000);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'No, thanks')]")));
                driver.findElement(By.xpath("//button[contains(text(),'No, thanks')]")).click();
            }
        }
    }

    @And("Select the bags")
    public void Select_the_bags(DataTable table) throws Throwable {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        {
            Thread.sleep(4000);

            if (data.get(0).get("bagType").equals("small bag")) {
                defineTravel.setSmallBag(data.get(0).get("small bag"));

            } else if (data.get(0).get("bagType").equals("large Bag")) {
                defineTravel.setLargeBag(data.get(0).get("large bag"));
            }
        }
    }

    @And("I go to payment")
    public void I_go_to_payment() throws Throwable {
        @Deprecated
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        By continueBtn = By.xpath("//button[contains(text(),'Continue')]");
        By continueBtnFnl = By.xpath("   //button[contains(text(),'No, thanks')]");
        Thread.sleep(1000);
        driver.findElement(continueBtn).click();
        Thread.sleep(1000);
        driver.findElement(continueBtnFnl).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueBtn));
        driver.findElement(continueBtn).click();
        System.out.println("Inside Step - user is in the checkout page");
    }

}
