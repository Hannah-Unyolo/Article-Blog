package com.akirachix.articleblog

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.articleblog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvArticles.layoutManager= LinearLayoutManager(this)
        displayArticles()

    }


    fun displayArticles(){
        val article1 = Article("Konemi Unyolo","", "Education", "Published on: 3rd Aug 2024", "It is good to talk about education...","View more")
        val article2 = Article("Konemi Unyolo","", "Health", "Published on: 3rd Aug 2024", "It is good to talk about health...","View more")
        val article3 = Article("Konemi Unyolo","", "Business", "Published on: 3rd Aug 2024", "It is good to talk about business...","View more")
        val article4 = Article("Konemi Unyolo","", "Sports", "Published on: 3rd Aug 2024", "It is good to talk about sports...","View more")
        val article5 = Article("Konemi Unyolo","", "Religious", "Published on: 3rd Aug 2024", "It is good to talk about religious...","View more")
        val article6 = Article("Konemi Unyolo","", "Technology", "Published on: 3rd Aug 2024", "It is good to talk about technology...","View more")
        val article7 = Article("Konemi Unyolo","", "Communication", "Published on: 3rd Aug 2024", "It is good to talk about communication...","View more")

       val articlesList = listOf(article1,article2,article3,article4,article5,article6,article7)
        val articleAdapter = ArticleAdapter(articlesList)
        binding.rvArticles.adapter = articleAdapter
    }
}

