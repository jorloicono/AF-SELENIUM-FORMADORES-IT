import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class WebFormAutomation {
    public static void main(String[] args) {
        // Configurar WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Iniciar WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();

        // Maximizar ventana
        driver.manage().window().maximize();

        // Definir tiempo de espera implícito
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Abrir la página web
        driver.get("URL_DE_TU_FORMULARIO");

        // Automatización del formulario
        completarFormulario(driver);

        // Cerrar el navegador
        driver.quit();
    }

    public static void completarFormulario(WebDriver driver) {
        // Ingresar texto en un input
        WebElement textInput = driver.findElement(By.id("my-text-id"));
        textInput.sendKeys("Texto de prueba");

        // Ingresar contraseña
        WebElement passwordInput = driver.findElement(By.name("my-password"));
        passwordInput.sendKeys("MiPassword123");

        // Ingresar texto en el textarea
        WebElement textArea = driver.findElement(By.name("my-textarea"));
        textArea.sendKeys("Este es un mensaje en el textarea.");

        // Seleccionar una opción del dropdown <select>
        WebElement dropdown = driver.findElement(By.name("my-select"));
        Select select = new Select(dropdown);
        select.selectByValue("2"); // Seleccionar opción "Two"

        // Seleccionar una opción en el datalist
        WebElement datalistInput = driver.findElement(By.name("my-datalist"));
        datalistInput.sendKeys("Seattle");

        // Subir un archivo
        WebElement fileInput = driver.findElement(By.name("my-file"));
        fileInput.sendKeys("/ruta/al/archivo.txt");

        // Marcar checkbox
        WebElement checkbox = driver.findElement(By.id("my-check-2"));
        checkbox.click();

        // Seleccionar radio button
        WebElement radioButton = driver.findElement(By.id("my-radio-2"));
        radioButton.click();

        // Seleccionar un color
        WebElement colorPicker = driver.findElement(By.name("my-colors"));
        colorPicker.sendKeys("#ff0000");

        // Ingresar una fecha en el date picker
        WebElement datePicker = driver.findElement(By.name("my-date"));
        datePicker.sendKeys("12/31/2024"); // Asegurarse de usar el formato compatible con el datepicker

        // Mover el slider (range)
        WebElement rangeInput = driver.findElement(By.name("my-range"));
        rangeInput.sendKeys("8");

        // Hacer clic en el botón de submit
        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        submitButton.click();
    }
}
