package com.example.geoquiz

import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel(){

    private val questionBank = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true),
    )

    var currentIndex = 0;

    val  currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer

    val currentQuestionText: Int
        get() = questionBank[currentIndex].textResid

    fun moveToNext(){
        currentIndex = (currentIndex + 1) % questionBank.size
    }

    fun moveToPrevious(){
        currentIndex = (currentIndex - 1) % questionBank.size
    }
}