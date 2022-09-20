package gustavo.mytrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val id = view?.id
        if(id == R.id.btnCalcular){
            handleCalculate()
        }

    }

    private fun handleCalculate() {
        if(isValid()){

            try {
                val distance = editDistance.text.toString().toFloat();
                val preco = editPreco.text.toString().toFloat();
                val autonomia = editAutonomia.text.toString().toFloat();
                val result = ((distance * preco) / autonomia)
                textResult.setText("Total: RS $result")
            }catch (nfe: NumberFormatException){
                Toast.makeText(this,"Por favor, informe valores válidos!", Toast.LENGTH_LONG).show()
            }
        }else {
            Toast.makeText(this,"Por favor, informe valores válidos!", Toast.LENGTH_LONG).show()
        }
    }

    private fun isValid(): Boolean {
        return editDistance.text.toString() != ""
                && editPreco.text.toString() != ""
                && editAutonomia.text.toString() != ""
                && editAutonomia.text.toString() != "0"
    }

}