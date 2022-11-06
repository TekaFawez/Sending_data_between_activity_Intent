package eniso.ia21.tp02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import eniso.ia21.tp02.databinding.ActivityConversionBinding

class ConversionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityConversionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val m = intent.getFloatExtra("montant",0.0f)
        val s =intent.getStringExtra("sens")
        binding.textmont.text="$m"
        binding.textsens1.text=s

        binding.conver.setOnClickListener {
            if(s=="DT TO Euro") {
                Toast.makeText(this,"l'equivalent de $m dt en euro est ${m/3.2} E",Toast.LENGTH_LONG).show()

            } else if (s=="EUro TO DT") {
                Toast.makeText(this,"l'equivalent de $m E en dinar est ${m*3.2} DT",Toast.LENGTH_LONG).show()


            }
        }
    }
}