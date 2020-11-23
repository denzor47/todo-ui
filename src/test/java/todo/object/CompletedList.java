package todo.object;

import com.codeborne.selenide.Selenide;
import todo.config.Config;

public class CompletedList {
    public void open() {
        Selenide.open(Config.baseUrl + "/react/#/completed");
    }
}