package com.example.detikapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.detikapp.R
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.lay_berita.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val cont_TitleNews = "cont_TitleNews"
        const val cont_PhotoNews = "cont_PhotoNews"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        tv_judul.setText(intent.getStringExtra(cont_TitleNews))
        tool_bar.setImageResource(intent.getStringExtra(cont_PhotoNews)!!.toInt())

        btn_back.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
               val intentMain = Intent(this@DetailActivity, MainActivity::class.java)
                startActivity(intentMain)
                finish()
            }
        })

    }
}