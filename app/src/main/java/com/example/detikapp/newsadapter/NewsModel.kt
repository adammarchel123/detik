package com.example.detikapp.newsadapter

import com.example.detikapp.R

data class news(var title: String, var desc:String, var photo:Int)

object NewsModel {
    val newsList = listOf<news>(
        news("Dikarenakan akan diadakannya Lock Down, orang orang yang berada di kota akan pulang kampung, dan terjadi antrian di stasiun.",
            "detik.com | 2 jam yang lalu", R.drawable.news1),
        news("Petugas dan Pemerintah terjun langsung ke masyarakat utnuk menionjau COVID 19.",
            "detik.com | 3 jam yang lalu", R.drawable.news2),
        news("Kemacetan di Ibu kota masih terjadi, hal ini dikarenakan bertambahnya volume kendaraan.",
            "detik.com | 2 jam yang lalu", R.drawable.news3),
        news("Proses pembuatan gedung pencakar langit yang menghabiskan dana miliaran rupiah.",
            "detik.com | 2 jam yang lalu", R.drawable.news4),
        news("Dikarenakan akan diadakannya Lock Down, orang orang yang berada di kota akan pulang kampung, dan terjadi antrian di stasiun.",
            "detik.com | 2 jam yang lalu", R.drawable.news5)

    )
}