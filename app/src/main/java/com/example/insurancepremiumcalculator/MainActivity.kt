package com.example.insurancepremiumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates
        Toast.makeText(this,"Position" + position
            Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerAge.onItemSelectedListener=this
        buttonCalculate.setOnClickListener {
            calculatePremium()
        }
    }

    private fun calculatePremium() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val position= spinnerAge.selectedItemPosition
        val gender = radioGroupGender.checkedRadioButtonId
        if(gender == R.id.radioButtonMale){
            //TODO calculate premium for male
        }
        if(checkBoxSmoker.isChecked){
            //TODO calculate premium for smoker
        }
    }
}
