package com.example.jobfair

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class listView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>()
        taskList.add("Position: Web Developer\n" +
                "\n" +
                "Location: [Company Name], [Location]\n" +
                "\n" +
                "Job Type: Full-time\n" +
                "\n" +
                "Salary: [Salary Range]\n" +
                "\n" +
                "About the Role:\n" +
                "\n")
        taskList.add("We are seeking a skilled and experienced web developer to join our team at [Company Name]. As a web developer, you will be responsible for designing, developing, and maintaining websites for our clients. You will work closely with cross-functional teams, including designers, project managers, and other developers, to deliver high-quality and effective web solutions.")
        taskList.add("Responsibilities:\n" +
                "\n" +
                "Design and develop responsive websites and web applications using modern web technologies and frameworks.\n" +
                "Ensure the functionality, performance, and usability of web projects, and conduct thorough testing and debugging to identify and resolve issues.\n" +
                "Collaborate with cross-functional teams to understand client requirements, provide technical recommendations, and deliver web projects on time and on budget.\n" +
                "Stay up-to-date with emerging web technologies and trends, and continuously improve your skills and knowledge.\n" +
                "Contribute to the development of internal tools and processes to improve efficiency and quality of web projects.")
        taskList.add("Work on resume")
        taskList.add("Improve internet presence")

        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)
        listView.adapter = adapterForMyListView

        listView.setOnItemClickListener { parent, view, position, id ->

            val text = "Clicked on item : " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}