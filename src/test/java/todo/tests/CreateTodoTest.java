package todo.tests;

import org.testng.annotations.Test;
import todo.object.CompletedList;
import todo.object.ListPage;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;

public class CreateTodoTest {
    @Test
    public void createTodo() {

        //create
        ListPage listpage = new ListPage();
        listpage.open();

        $(".new-todo").val("Read book").pressEnter();
        assertEquals("Read book", $(".todo-list label").text());
        assertEquals("1 item left", $(".todo-count").text());

        //complete
        CompletedList complatedlist = new CompletedList();
        complatedlist.open();

        $(".toggle-all").click();
        assertEquals("Read book", $(".todo-list label").text());

        //clear complete
        $(".clear-completed").click();
        assertEquals("", $(".new-todo").text());

    }
}
