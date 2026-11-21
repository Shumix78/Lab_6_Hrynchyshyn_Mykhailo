package com.ip_24_1.lab_6_hrynchyshyn_mykhailo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ip_24_1.lab_6_hrynchyshyn_mykhailo.ui.theme.Lab_6_Hrynchyshyn_MykhailoTheme
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewTasks)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val tasks = listOf(
            Task("Задача 1: Вивчити компоненти RecyclerView"),
            Task("Задача 2: Створити кастомний макет елемента"),
            Task("Задача 3: Реалізувати ViewHolder"),
            Task("Задача 4: Створити власний Adapter"),
            Task("Задача 5: Налаштувати LinearLayoutManager")
        )

        val adapter = TaskAdapter(tasks)
        recyclerView.adapter = adapter
    }
}