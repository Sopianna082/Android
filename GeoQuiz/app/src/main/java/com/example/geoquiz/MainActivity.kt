package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Toast
import org.w3c.dom.Text
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import java.util.List.of

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button
    private lateinit var previousButton: Button
    private lateinit var questionTextView: TextView

    private val quizViewModel:QuizViewModel by lazy {
        ViewModelProviders.of(this).get(QuizViewModel::class.java)
    }
    
//    private val questionBank = listOf(
//        Question(R.string.question_australia, true),
//        Question(R.string.question_oceans, true),
//        Question(R.string.question_mideast, false),
//        Question(R.string.question_africa, false),
//        Question(R.string.question_americas, true),
//        Question(R.string.question_asia, true),
//    )
//
//    private var currentIndex = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "onCreate(Bundle?) called")

        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        questionTextView = findViewById(R.id.question_text_view)
        nextButton = findViewById(R.id.next_button)
        previousButton = findViewById(R.id.previous)

        trueButton.setOnClickListener{
            checkAnswer(true)
        }
        falseButton.setOnClickListener{
            checkAnswer(false)
        }
        nextButton.setOnClickListener{
            quizViewModel.moveToNext()
            updateQuestion()
//            currentIndex = (currentIndex + 1) % questionBank.size
//
//            val questionTextResId = questionBank[currentIndex].textResid
//            questionTextView.setText(questionTextResId)
//            updateQuestion()
        }
        //
        updateQuestion()

        previousButton.setOnClickListener{
            quizViewModel.moveToPrevious()
            updateQuestion()
//            currentIndex = (currentIndex - 1) % questionBank.size
//
//            val questionTextResId = questionBank[currentIndex].textResid
//            questionTextView.setText(questionTextResId)
//            updateQuestion()
        }

    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }

    private fun updateQuestion(){
        val questionTextResId = quizViewModel.currentQuestionText
        questionTextView.setText(questionTextResId)

//        val questionTextResId = questionBank[currentIndex].textResid
//        questionTextView.setText(questionTextResId)
    }

    private fun checkAnswer(userAnswer: Boolean){
        val correctAnswer = quizViewModel.currentQuestionAnswer

        val messageResId = if (userAnswer == correctAnswer)
        {
            R.string.correct_toast
        }else{
            R.string.incorrect_toast
        }

        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show()

//        val correctAnswer = questionBank[currentIndex].answer
//
//        val messageResId = if(userAnswer == correctAnswer){
//            R.string.correct_toast
//        }else{
//            R.string.incorrect_toast
//        }
//        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show()
    }

}