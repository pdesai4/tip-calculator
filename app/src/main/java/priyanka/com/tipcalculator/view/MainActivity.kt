package priyanka.com.tipcalculator.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import priyanka.com.tipcalculator.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.statusBarColor = ContextCompat.getColor(this, R.color.statusbar)
        setSupportActionBar(my_toolbar)
        supportActionBar?.title = getString(R.string.tip_calculator)

        val inputDetailsFragment = InputDetailsFragment.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.container, inputDetailsFragment).commit()
    }
}
