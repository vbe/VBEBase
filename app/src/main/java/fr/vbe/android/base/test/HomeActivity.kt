package fr.vbe.android.base.test

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import fr.vbe.android.base.test.databinding.HomeActivityBinding

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<HomeActivityBinding>(this, R.layout.home_activity)

        binding.title.text = "TITLE"
    }
}