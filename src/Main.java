import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("List of action: ");
        System.out.println("1. add");
        System.out.println("2. update");
        System.out.println("3. delete");
        System.out.println("Usage: <action> [description]  ");

        TaskList taskList = new TaskList();

        while(true) {

            System.out.print("metask ");

            String command = sc.nextLine();
            String[] array1 = command.split("\s");
            String[] array2 = command.split("\"");

            String action = array1[0].trim();
            String argument = "";
            int id = taskList.taskSize();

            switch (action) {
                case "add" -> {
                    argument = array2[1];
                    Task task = new Task(argument, id + 1);
                    taskList.addTask(task);
                    System.out.println(id);
                }
                case "delete" -> {
                    taskList.deleteTask(Integer.parseInt(array1[1]));
                }
                case "update" -> {
                    taskList.updateTask(Integer.parseInt(array1[1]),array2[1]);
                }
                case "list" -> {
                    taskList.displayTask();
                    System.out.println(taskList.taskSize());
                }
            }

//            for(String task : array){
//
//                System.out.println(task);
//
//            }


        }
    }



}