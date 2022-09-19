package gustavo.mytrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

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

    }

}