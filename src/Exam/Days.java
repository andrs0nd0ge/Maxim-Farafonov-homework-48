package Exam;

import Server.Complexity;

import java.util.ArrayList;
import java.util.List;

public class Days {
    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }

    List<Day> days = new ArrayList<>();


    public Days(){
        days.add(new Day(null, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(null, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(null, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(null, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(1, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(2, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(3, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(4, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(5, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(6, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(7, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(8, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(9, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(10, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(11, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(12, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(13, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(14, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(15, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(16, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(17, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(18, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(19, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(20, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(21, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(22, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(23, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(24, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(25, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(26, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(27, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(28, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(29, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(30, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
        days.add(new Day(null, 3, new Task("lorem", "lorem", Complexity.NORMALTASK)));
    }

    public static class Day{
        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public int getTaskCount() {
            return taskCount;
        }

        public void setTaskCount(int taskCount) {
            this.taskCount = taskCount;
        }

        public Task getTask() {
            return task;
        }

        public void setTask(Task task) {
            this.task = task;
        }

        private Integer count;
        private int taskCount;
        private Task task;

        public Day(Integer count, int taskCount, Task task){
            this.count = count;
            this.taskCount = taskCount;
            this.task = task;
        }

    }

    public static class Task{
        private String desc;
        private String name;
        private String type;

        public Task(String desc, String name, Complexity type){
            this.desc = desc;
            this.name = name;
            this.type = String.valueOf(type);
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

}
