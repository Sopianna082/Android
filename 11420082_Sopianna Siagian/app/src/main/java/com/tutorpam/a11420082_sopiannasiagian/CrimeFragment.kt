package com.tutorpam.a11420082_sopiannasiagian

import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class CrimeFragment : Fragment() {

    private lateinit var titleField: EditText
    private lateinit var dateButton: Button
    private lateinit var solvedCheckbox: CheckBox
//    private lateinit var logCrimeButton: Button
    private lateinit var crime: Crime

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        crime = Crime()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_crime, container, false)

        dateButton = view.findViewById(R.id.crime_date)
        solvedCheckbox = view.findViewById(R.id.crime_solved)
        titleField = view.findViewById(R.id.crime_title)
//        logCrimeButton = view.findViewById(R.id.log_crime)
//        crime = Crime()

//        logCrimeButton.setOnClickListener {
//            Log.d(TAG, crime.toString())
//        }

        dateButton.apply {
            text = crime.date.toString()
            isEnabled = false
        }

//        solvedCheckbox.apply {
//            setOnCheckedChangeListener { _, isChecked ->
//                crime.isSolved = isChecked
//            }
//        }

        return view
    }

    override fun onStart() {
        super.onStart()

        val titleWatcher = object: TextWatcher {
            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int) {
                // blank
            }

            override fun onTextChanged(
                s: CharSequence?,
                start: Int,
                before: Int,
                count: Int) {
                crime.title = s.toString()
            }

            override fun afterTextChanged(s: Editable?) {
                // blank
            }
        }
        titleField.addTextChangedListener(titleWatcher)

        solvedCheckbox.apply {
            setOnCheckedChangeListener { _, isChecked ->
                crime.isSolved = isChecked
            }
        }
    }

}