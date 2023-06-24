import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import java.security.interfaces.DSAParams;
//import java.util.PriorityQueue;
//import java.util.Queue;

public class TasksTest {

    @Test
    public void shouldShowSimpleTaskQuery() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Task tasks = new Task(555);
        //Queue queue = new Queue("позвонить родителям") {
        // };
        // tasks.add(simpleTask);
        // tasks.add(epic);
        // tasks.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = tasks.m();
        Assertions.assertArrayEquals(expected, actual);
    }
}

