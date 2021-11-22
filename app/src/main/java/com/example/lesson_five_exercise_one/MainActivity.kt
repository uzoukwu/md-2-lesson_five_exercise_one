package com.example.lesson_five_exercise_one

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNewsList.adapter = NewsAdapter(this, getNews())
        rvNewsList.layoutManager = LinearLayoutManager(this)

    }

    private fun getNews(): ArrayList<News>{
        val news = ArrayList<News>()

        news.add(News(
            header = "Dummy News 1",
            news = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                    "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img2)
        ))

        news.add(News(
            header = "Dummy News 2",
            news = "Sed ut perspiciatis unde omnis iste natus error sit " +
                    "voluptatem accusantium doloremque laudantium," +
                    " totam rem aperiam, eaque ipsa quae ab illo inventore veritatis",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img3)
        ))

        news.add(News(
            header = "Dummy News 3",
            news = "But I must explain to you how all this mistaken idea " +
                    "of denouncing pleasure and praising pain was born",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img4)
        ))

        news.add(News(
            header = "Dummy News 4",
            news = "Tof denouncing pleasure and praising pain was born",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img5)
        ))

        news.add(News(
            header = "Dummy News 5",
            news = "qui blanditiis praesentium voluptatum deleniti atque",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img2)
        ))

        news.add(News(
            header = "Dummy News 6",
            news = "in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga." +
                    "in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga.",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img3)
        ))

        news.add(News(
            header = "Dummy News 7",
            news = "qui blanditiis praesentium voluptatum deleniti atque",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img4)
        ))

        news.add(News(
            header = "Dummy News 8",
            news = "est, qui dolorem ipsum quia dolor sit amet, consectetur",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img5)
        ))

        news.add(News(
            header = "Dummy News 9",
            news = "At vero eos et accusamus et iusto odio dignissimos ducimus " +
                    "qui blanditiis praesentium voluptatum deleniti atque" +
                    "corrupti quos dolores et quas molestias excepturi sint" +
                    " occaecati cupiditate non provident, similique sunt" +
                    " in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. " +
                    "Et harum quidem rerum facilis est et expedita distinctio." +
                    " Nam libero tempore, cum soluta nobis est eligendi optio cumque",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img2)
        ))

        news.add(News(
            header = "Dummy News 10",
            news = "Account of the system, and expound the actual teachings of the great ",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img3)
        ))

        news.add(News(
            header = "Dummy News 11",
            news = "est, qui dolorem ipsum quia dolor sit amet, consectetur",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img4)
        ))

        news.add(News(
            header = "Dummy News 12",
            news = "Sed ut perspiciatis unde omnis iste natus error",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img5)
        ))

        news.add(News(
            header = "Dummy News 13",
            news = "But I must explain to you how all this mistaken idea of denouncing " +
                    "pleasure and praising pain was born and I will give you a complete " +
                    "account of the system, and expound the actual teachings of the great " +
                    "explorer of the truth, the master-builder of human happiness. " +
                    "No one rejects, dislikes, or avoids pleasure itself, " +
                    "because it is pleasure, but because those who do not know how " +
                    "to pursue pleasure rationally encounter consequences t",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img2)
        ))

        news.add(News(
            header = "Dummy News 14",
            news = "Sed ut perspiciatis unde omnis iste natus error",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img3)
        ))

        news.add(News(
            header = "Dummy News 15",
            news = "one rejects, dislikes, or avoids pleasure itself, because it is pleasure, " +
                    "but because those who do not know how to " +
                    "pursue pleasure rationally encounter consequences that are extremely painful. ",
            icon = BitmapFactory.decodeResource(resources, R.drawable.img4)
        ))

        return news
    }
}