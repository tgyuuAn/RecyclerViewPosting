package com.tgyuu.recyclerviewexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.tgyuu.recyclerviewexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var datas = mutableListOf<data>(
            data("김철수","야 그거 학점 어떻게 나옴??","2022-12-18",R.drawable.kt_9),
            data("딴따라","코인 노래방이나 한번 떄릴까??","2022-12-18",R.drawable.kt_10),
            data("멜론","(광고)카카오엔터테인먼트가 드리는 12월의 6,000캐시...","2022-12-17",R.drawable.melon),
            data("뉴발란스","(광고)♥NB 홀리데이 기프트 컬렉션♥","2022-12-17",R.drawable.newbalance),
            data("박력남","헬스ㄲㄲ","2022-12-17",R.drawable.kt_9),
            data("털뭉치","형아 집에 언제와~?","2022-12-17",R.drawable.dog),
            data("가족톡방","밥은 먹고 다니니?","2022-12-16",R.drawable.family)
        )

        val recyclerView = binding.rv
        recyclerView.adapter = MyAdapter(datas)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}