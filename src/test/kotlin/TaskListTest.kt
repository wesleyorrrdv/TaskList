import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskListTest {


    private val taskList = TaskList()
    @Test
    fun addTask() {
        val task ="Task 1"
        taskList.addTask(task)
        assertTrue(taskList.getTasks().contains(task))
    }

    @Test
    fun removeTask() {
        val task = "Task 2"
        taskList.addTask(task)
        taskList.removeTask(task)
        assertFalse(taskList.getTasks().contains(task))
    }

}