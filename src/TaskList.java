import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> tasks;
    public int id;

    public TaskList(){
        tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void deleteTask(int id){
        tasks.remove(id);
    }

    public void updateTask(int id, String description){

        for(Task task: tasks){
            if(task.id == id){
                Task updateTask = new Task (description, id);
                tasks.set(id-1,updateTask);
            }
        }


    }

    public void displayTask() {

        for(Task task : tasks){
            System.out.println( "id: " + task.id + " " + task.description + " " + task.status );
        }

    }

    public int taskSize() {
        if(tasks.isEmpty()){
            return 0;
        }
        return tasks.size();
    }

}
