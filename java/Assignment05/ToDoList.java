import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Read Java chapter");
        tasks.add("Complete lab work");
        StringBuffer display = new StringBuffer("To-Do List\n");
        for (String task : tasks) display.append("- ").append(task).append('\n');
        System.out.print(display);
    }
}
