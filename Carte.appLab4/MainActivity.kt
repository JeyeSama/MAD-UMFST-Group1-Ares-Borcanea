package com.example.lab4bookfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //(Pt introducere sa fie pagina deschisa prima)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView2, Introduction())
            .commit()

        //butoane care sa mearga intre chaptere cu listener
        findViewById<Button>(R.id.button6).setOnClickListener {
            loadFragment(Chapter1())
        }

        findViewById<Button>(R.id.button7).setOnClickListener {
            loadFragment(Chapter2())
        }

        findViewById<Button>(R.id.button8).setOnClickListener {
            loadFragment(Chapter3())
        }

        findViewById<Button>(R.id.button9).setOnClickListener {
            loadFragment(Chapter4())
        }
    }

    // pt a da load la fragment. (cautat pe net, dar pe scurt doar schimba ID-ul
    //de la fragment-ul pe care esti, cu ala unde vrei sa fii) (gen, de la intro la 4)
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView2, fragment)
            .addToBackStack(null)
            .commit()
    }
}
