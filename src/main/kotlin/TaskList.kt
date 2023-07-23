class TaskList {
    private val tasks: MutableList<String> = mutableListOf()

    fun addTask(task:String){
        tasks.add(task)
    }
    fun removeTask(task: String){
        tasks.remove(task)


    } fun markTaskAsCompleted(task:String){

    }
    fun getTasks():List<String>{
        return tasks.toList()
    }

}