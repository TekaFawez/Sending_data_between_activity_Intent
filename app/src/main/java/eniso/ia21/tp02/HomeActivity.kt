package eniso.ia21.tp02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eniso.ia21.tp02.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botn1.setOnClickListener {

            val i = Intent(this,CurrencyActivity::class.java)
            startActivity(i)
        }
        binding.botn2.setOnClickListener {
            val j = Intent(this,TemperatureActivity::class.java)
            startActivity(j)
        }

    }
}