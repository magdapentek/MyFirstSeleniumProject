public class RegisterTest {
//    Adăugați în clasa RegisterTest un test în care să automatizați pașii necesari
//    pentru înregistrarea cu succes a unui utilizator nou (deschideți homepage-ul,
//    apăsați pe Account, apăsați pe Register, completați toate câmpurile de pe pagina Register -
//    atenție ca email-ul să fie unic, bifați opțiunea pentru primirea newsleterr-ului).
//    Folosiți identificatori diferiți pentru câmpurile de pe pagina Register (id, name, className).
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a/span[2]")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Pentek");
        driver.findElement(By.name("lastname")).sendKeys("Magda");
        driver.findElement(By.id("email_address")).sendKeys("magdapenteka@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("0246810");
        driver.findElement(By.id("confirmation")).sendKeys("0246810");
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span")).click();

        Thread.sleep(5000);
        driver.close();

//        Cu nameClass nu a functionat


    }
}
