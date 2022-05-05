package com.example.semana15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var recyclerViewAdapter: RecyclerViewAdapter? = null
    private var movieList = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        movieList = ArrayList()
        recyclerView = findViewById<View>(R.id.recycler_view) as RecyclerView
        recyclerViewAdapter = RecyclerViewAdapter(movieList)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView!!.layoutManager = layoutManager
        recyclerViewAdapter!!.setOnItemClickListener(object : ClickListener<Movie> {
            override fun onItemClick(data: Movie) {
                Toast.makeText(this@MainActivity2, data.title, Toast.LENGTH_SHORT).show()
            }
        })
        recyclerView!!.adapter = recyclerViewAdapter
        prepareMovie()
    }


        private fun prepareMovie() {
            var movie = Movie("GILBER FUENTES", R.drawable.nahum, "Le gusta , " +
                                                                      "y hacer enojar a la novia ")
            movieList.add(movie)
            movie = Movie("CESAR MUÑOZ", R.drawable.cesar,"Es amistoso, le gusta el FREE FIRE, ")
            movieList.add(movie)
            movie = Movie("GERARDO CAMPOS", R.drawable.gerardo,"Le gusta quejarse, " +
                                                              "ama los deportes y es muy sociable")
            movieList.add(movie)
            movie = Movie("NATALIA TRIGUEROS", R.drawable.nata, "Le gusta cantar")
            movieList.add(movie)



            recyclerViewAdapter?.notifyDataSetChanged()
        }
}