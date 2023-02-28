package test.page;

import org.openqa.selenium.By;

import test.util.DSL;

public class MenuPage {
    private DSL dsl = new DSL();
    Thread thread = new Thread();
    public void acessarDadosPessoais() throws InterruptedException {
        dsl.clicarBotão(By.id("com.example.menuactivity:id/bt_dadosPessoais"));
        thread.sleep(1000);
    }
}
