package br.ce.renan.tasks.functional;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TasksTest {

	@Test
	public void deveSalvarTarefaComSucesso() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://localhost:8001/tasks/");
		
		driver.findElement(By.id("addTodo")).click();
		driver.findElement(By.id("task")).sendKeys("Test Funcional");
		driver.findElement(By.id("dueDate")).sendKeys("12/12/2023");
		driver.findElement(By.id("saveButton")).click();

	}
}
