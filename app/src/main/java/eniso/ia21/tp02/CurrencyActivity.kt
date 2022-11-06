package eniso.ia21.tp02

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import eniso.ia21.tp02.databinding.ActivityCurrencyBinding

class CurrencyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCurrencyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.DinaEuro.setOnClickListener {
            binding.DinaEuro.setBackgroundColor(Color.DKGRAY)
            binding.EuroDin.setBackgroundColor(Color.LTGRAY)

            if ( binding.edit1.text.isEmpty()) {
                Toast.makeText(this,"saisi donnée avant",Toast.LENGTH_LONG).show()


            }
            else {
                val i = Intent(this,ConversionActivity::class.java)
                i.putExtra("montant",binding.edit1.text.toString().toFloat())
                i.putExtra("sens","DT TO Euro")
                startActivity(i)
              //  val D = binding.edit1.text.toString().toFloat()
              //  binding.reslt.text="${D/3.2}"
           }

        }
        binding.EuroDin.setOnClickListener {
            binding.EuroDin.setBackgroundColor(Color.DKGRAY)
            binding.DinaEuro.setBackgroundColor(Color.LTGRAY)
            if ( binding.edit1.text.isEmpty()) {
                Toast.makeText(this,"saisi donnée avant",Toast.LENGTH_LONG).show()


            }
            else {
                val i = Intent(this,ConversionActivity::class.java)
                i.putExtra("montant",binding.edit1.text.toString().toFloat())
                i.putExtra("sens","EUro TO DT")
                startActivity(i)

                //    val D = binding.edit1.text.toString().toFloat()
            //    binding.reslt.text="${D*3.2}"
            }
        }
    }

}