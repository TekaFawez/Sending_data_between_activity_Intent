package eniso.ia21.tp02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import eniso.ia21.tp02.databinding.ActivityTemperatureBinding
import kotlin.math.ceil

class TemperatureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTemperatureBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if( binding.editTemp.text.isEmpty()){
                Toast.makeText(this,"entrer une valeur",Toast.LENGTH_LONG).show()
            } else {
                val T = binding.editTemp.text.toString().toFloat()
                var res = 0.0f
                when (checkedId){

                    binding.btn.id -> {
                        res=((9*T)/5)+32
                    }
                    R.id.btn1 ->{
                        res = ((5*(T-32))/9)
                      //  binding.resltatTemp.text="${(5*(T-32))*(1/9)}"
                    }
                }
                if (binding.checkBox.isChecked){
                    res= ceil(res)
                }
                binding.resltatTemp.text="$res"
            }

        }

    }

}