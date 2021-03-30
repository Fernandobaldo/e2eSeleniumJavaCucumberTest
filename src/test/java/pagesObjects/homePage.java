package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class homePage {

    WebDriver driver;

    By txt_departure_city = By.id("input-button__departure");
    By txt_destination_city = By.id("input-button__destination");


    By calendar_monthName = By.xpath("(//div[@class='calendar__month-name'])[1]");
    By nextMonth = By.xpath("//div[@data-ref='calendar-btn-next-month']");
    By departDay = By.xpath("(//div[@class='calendar-body__cell-wrap ng-star-inserted'])");

    By calendar_returnMonthName = By.xpath("(//div[@class='calendar__month-name'])[2]");
    By returnDay = By.xpath("(//div[@class='calendar-body__cell-wrap ng-star-inserted'])");

    By childrenQtd = By.xpath("//body/ry-tooltip[@id='ry-tooltip-6']/div[2]/hp-app-controls-tooltips[1]/fsw-controls-tooltips-container[1]/fsw-controls-tooltips[1]/fsw-passengers-container[1]/fsw-passengers[1]/fsw-passengers-picker-container[1]/fsw-passengers-picker[1]/ry-counter[3]/div[2]/div[3]");
    By adultQtd = By.xpath("/html[1]/body[1]/ry-tooltip[1]/div[2]/hp-app-controls-tooltips[1]/fsw-controls-tooltips-container[1]/fsw-controls-tooltips[1]/fsw-passengers-container[1]/fsw-passengers[1]/fsw-passengers-picker-container[1]/fsw-passengers-picker[1]/ry-counter[1]/div[2]/div[3]");

    By searchFly = By.xpath("//ry-spinner[contains(text(),'Search')]");

    By newNextDate = By.xpath("//button[@class='carousel-next ng-tns-c144-10']");
    By newDepartMonth = By.xpath("//body/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-summary-container[1]/flights-summary[1]/div[1]/div[1]/journey-container[1]/journey[1]/div[1]/div[2]/div[1]/carousel-container[1]/carousel[1]/div[1]/ul[1]/li[4]/carousel-item[1]/button[1]/div[1]/div[1]");
    By newReturnDate = By.xpath("//body/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-summary-container[1]/flights-summary[1]/div[1]/div[2]/journey-container[1]/journey[1]/div[1]/div[2]/div[1]/carousel-container[1]/carousel[1]/div[1]/ul[1]/li[4]/carousel-item[1]/button[1]/div[1]/div[1]");
    By newNextDateRtn = By.xpath("//button[@class='carousel-next ng-tns-c144-13']");
    By loginLater = By.xpath("");


    By firstName1 = By.xpath("//body[1]/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-lazy-passengers[1]/pax-app-container[1]/pax-app[1]/ry-spinner[1]/div[1]/div[1]/div[2]/pax-app-form-container[1]/pax-app-form[1]/form[1]/pax-passenger-container[1]/pax-passenger[1]/div[1]/pax-passenger-details-container[1]/pax-passenger-details[1]/pax-passenger-details-form-container[1]/pax-details-form[1]/ry-input-d[1]/div[1]/input[1]");
    By lastName1 = By.xpath("//body[1]/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-lazy-passengers[1]/pax-app-container[1]/pax-app[1]/ry-spinner[1]/div[1]/div[1]/div[2]/pax-app-form-container[1]/pax-app-form[1]/form[1]/pax-passenger-container[1]/pax-passenger[1]/div[1]/pax-passenger-details-container[1]/pax-passenger-details[1]/pax-passenger-details-form-container[1]/pax-details-form[1]/ry-input-d[2]/div[1]/input[1]");
    By firstName2 = By.xpath(("//body[1]/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-lazy-passengers[1]/pax-app-container[1]/pax-app[1]/ry-spinner[1]/div[1]/div[1]/div[2]/pax-app-form-container[1]/pax-app-form[1]/form[1]/pax-passenger-container[2]/pax-passenger[1]/div[1]/pax-passenger-details-container[1]/pax-passenger-details[1]/pax-passenger-details-form-container[1]/pax-details-form[1]/ry-input-d[1]/div[1]/input[1]"));
    By lastName2 = By.xpath("//body[1]/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-lazy-passengers[1]/pax-app-container[1]/pax-app[1]/ry-spinner[1]/div[1]/div[1]/div[2]/pax-app-form-container[1]/pax-app-form[1]/form[1]/pax-passenger-container[2]/pax-passenger[1]/div[1]/pax-passenger-details-container[1]/pax-passenger-details[1]/pax-passenger-details-form-container[1]/pax-details-form[1]/ry-input-d[2]/div[1]/input[1]");
    By firstName3 = By.xpath("//body[1]/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-lazy-passengers[1]/pax-app-container[1]/pax-app[1]/ry-spinner[1]/div[1]/div[1]/div[2]/pax-app-form-container[1]/pax-app-form[1]/form[1]/pax-passenger-container[3]/pax-passenger[1]/div[1]/pax-passenger-details-container[1]/pax-passenger-details[1]/pax-passenger-details-form-container[1]/pax-details-form[1]/ry-input-d[1]/div[1]/input[1]");
    By lastName3 = By.xpath("//body[1]/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-lazy-passengers[1]/pax-app-container[1]/pax-app[1]/ry-spinner[1]/div[1]/div[1]/div[2]/pax-app-form-container[1]/pax-app-form[1]/form[1]/pax-passenger-container[3]/pax-passenger[1]/div[1]/pax-passenger-details-container[1]/pax-passenger-details[1]/pax-passenger-details-form-container[1]/pax-details-form[1]/ry-input-d[2]/div[1]/input[1]");

    By smallBag = By.xpath("//body/bags-root[1]/bags-booking-container[1]/div[1]/main[1]/div[1]/section[1]/bags-cabin-lazy-bag[1]/bags-cabin-bag-section[1]/bags-bag-layout[1]/div[1]/div[3]/div[2]/bags-pax-table-journey-container[1]/div[1]/bags-cabin-bag-table-controls[1]/ry-radio-group[1]/div[1]/div[1]/div[1]/bags-cabin-bag-product[1]/div[1]/bags-product-selector[1]/div[1]/div[1]/div[1]/ry-radio-circle-button[1]/label[1]");
    By largeBag = By.xpath("//body/bags-root[1]/bags-booking-container[1]/div[1]/main[1]/div[1]/section[1]/bags-cabin-lazy-bag[1]/bags-cabin-bag-section[1]/bags-bag-layout[1]/div[1]/div[3]/div[2]/bags-pax-table-journey-container[1]/div[1]/bags-cabin-bag-table-controls[1]/ry-radio-group[1]/div[1]/div[1]/div[2]/bags-cabin-bag-product[1]/div[1]/bags-product-selector[1]/div[1]/div[1]/div[1]/ry-radio-circle-button[1]/label[1]");


    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSearchFly() {
        driver.findElement(searchFly).click();
    }

    public void setChildrenQtd() {
        driver.findElement(childrenQtd).click();
    }

    public void setAdultQtd() {
        driver.findElement(adultQtd).click();
    }

    public void setReturnMonthYear(String monthYear) {
        String cmonth = driver.findElement(calendar_returnMonthName).getText().trim();
        WebElement next;

        while ((!cmonth.equals(monthYear))) {
            next = driver.findElement(nextMonth);
            next.click();
            cmonth = driver.findElement(calendar_returnMonthName).getText().trim();
        }
    }

    public void setReturnDay(String day) {
        List<WebElement> dates = driver.findElements(returnDay);
        for (WebElement e : dates) {
            if (e.getText().trim().equals(day)) {
                e.click();
                break;
            }
        }
    }


    public void setMonthYear(String monthYear) {
        String cmonth = driver.findElement(calendar_monthName).getText().trim();
        WebElement next;

        while ((!cmonth.equals(monthYear))) {
            next = driver.findElement(nextMonth);
            next.click();
            cmonth = driver.findElement(calendar_monthName).getText().trim();
        }
    }

    public void setDepartDay(String day) {
        List<WebElement> dates = driver.findElements(departDay);
        for (WebElement e : dates) {
            if (e.getText().trim().equals(day)) {
                e.click();
                break;
            }
        }
    }

    public void setDeparture(String departure) {
        driver.findElement(txt_departure_city).sendKeys(Keys.chord(Keys.COMMAND, "a"), departure);

    }

    public void setDestination(String destination) {
        driver.findElement(txt_destination_city).sendKeys(destination);
    }

    public void setNewDepartDate(String nDptMonth) throws Throwable {
        String newMonth = driver.findElement(newDepartMonth).getText().trim();
        System.out.println("The date is " + newMonth);
        WebElement next;
        while (!newMonth.equals(nDptMonth)) {
            next = driver.findElement(newNextDate);
            next.click();
            Thread.sleep(1000);
            newMonth = driver.findElement(newDepartMonth).getText();
            driver.findElement(newDepartMonth).click();
            List<WebElement> dates = driver.findElements(newDepartMonth);
            if (newMonth.equals(nDptMonth)) {
                for (WebElement e : dates) {
                    e.click();
                    break;
                }

            }
        }
    }


    public void setNewReturnDate(String nRtnMonth) throws Throwable {
        String newRtnMonth = driver.findElement(newReturnDate).getText().trim();
        System.out.println("The date is " + newRtnMonth);
        WebElement nextNew;
        while (!newRtnMonth.equals(nRtnMonth)) {
            nextNew = driver.findElement(newNextDateRtn);
            nextNew.click();
            Thread.sleep(1000);
            driver.findElement(newReturnDate).click();
            newRtnMonth = driver.findElement(newReturnDate).getText();
            List<WebElement> dateds = driver.findElements(newReturnDate);
            if (newRtnMonth.equals(nRtnMonth)) {
                for (WebElement c : dateds) {
                    c.click();
                    break;
                }

            }
        }
    }


    public void setPassengersFirstNames1(String names1) {
        driver.findElement(firstName1).click();
        driver.findElement(firstName1).sendKeys(names1);

    }

    public void setPassengersLastNames1(String lastName) {
        driver.findElement(lastName1).click();
        driver.findElement(lastName1).sendKeys(lastName);

    }

    public void setPassengersFirstNames2(String name) {
        driver.findElement(firstName2).click();
        driver.findElement(firstName2).sendKeys(name);

    }

    public void setPassengersLastNames2(String lastName) {
        driver.findElement(lastName2).click();
        driver.findElement(lastName2).sendKeys(lastName);

    }

    public void setPassengersFirstNames3(String name) {
        driver.findElement(firstName3).click();
        driver.findElement(firstName3).sendKeys(name);

    }

    public void setPassengersLastNames3(String lastName) {
        driver.findElement(lastName3).click();
        driver.findElement(lastName3).sendKeys(lastName);

    }

    public void setSmallBag(String smallBag1large) {
        driver.findElement(smallBag).click();
    }

    public void setLargeBag(String largBag) {
        driver.findElement(largeBag).click();
    }


}


