package fr.vbe.android.base

import android.os.Bundle
import android.widget.TextView

class TestActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).also {
            it.text = "coucou"
        })
    }
}