import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;

public class WebFormAutomation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        try {
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");
            
            // 1. Verificación de la página
            assert driver.getTitle().contains("Web form");
            
            // 2. Rellenar campos de texto
            driver.findElement(By.id("my-text-id")).sendKeys("Nombre Prueba");
            driver.findElement(By.name("my-password")).sendKeys("Passw0rd123");
            driver.findElement(By.name("my-textarea")).sendKeys("Mensaje de prueba");
            
            // 3. Seleccionar opción en dropdown
            Select select = new Select(driver.findElement(By.name("my-select")));
            select.selectByValue("2");
            
            // 4. Selección en datalist
            WebElement datalistInput = driver.findElement(By.name("my-datalist"));
            datalistInput.sendKeys("Seattle");
            
            // 5. Subir un archivo
            driver.findElement(By.name("my-file")).sendKeys("C:/ruta/del/archivo.txt");
            
            // 6. Checkboxes y radio buttons
            WebElement checkbox = driver.findElement(By.id("my-check-2"));
            if (!checkbox.isSelected()) checkbox.click();
            driver.findElement(By.id("my-radio-2")).click();
            
            // 7. Color picker y slider
            driver.findElement(By.name("my-colors")).sendKeys("#ff0000");
            driver.findElement(By.name("my-range")).sendKeys("9");
            
            // 8. Date picker
            WebElement datePicker = driver.findElement(By.name("my-date"));
            datePicker.sendKeys("12/31/2024");
            
            // 9. Verificar campo oculto
            WebElement hiddenInput = driver.findElement(By.name("my-hidden"));
            assert !hiddenInput.isDisplayed();
            
            // 10. Enviar el formulario
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            
            // 11. Validar redirección
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.urlContains("submitted-form.html"));
            
            // 12. Captura de pantalla
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("screenshot.png"));
            
            System.out.println("Automatización completada exitosamente.");
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
