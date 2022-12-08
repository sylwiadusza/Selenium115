import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadanie8Sda {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.bbc.com/");
    }

    @Test
    public void iloscLinkowNaStronie() {
        List<WebElement> znalezioneLinki = driver.findElements(By.tagName("a"));
        System.out.println("Ilość linków na stronie = " + znalezioneLinki.size());
        driver.findElements(By.cssSelector())

    }

    @Test
    public void iloscObrazkowNaStronie() {
        List<WebElement> znalezioneObrazki = driver.findElements(By.tagName("img"));
        System.out.println("Ilość obrazków na stronie = " + znalezioneObrazki.size());

    }

    @AfterAll
    public static void tearDown() {
        driver.close();
    }
}
