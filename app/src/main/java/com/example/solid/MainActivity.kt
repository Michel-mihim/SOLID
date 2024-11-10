package com.example.solid

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : Activity() {
    private val taskManager = TaskManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Добавление задачи
        taskManager.addTask(Task(1, "Buy groceries", false))
        taskManager.addTask(Task(2, "Clean the house", false))

        // Отметка задачи как выполненной
        taskManager.completeTask(1)

        // Удаление задачи
        taskManager.deleteTask(2)

        // Получение списка задач
        val tasks = taskManager.getTasks()
        tasks.forEach {
            println("Task: ${it.title}, Completed: ${it.isCompleted}")
        }
    }
}

