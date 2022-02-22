package it.edu.iisfalcone_righi.geoquiz

import androidx.annotation.StringRes

data class Question(@StringRes val textResID: Int, val answer: Boolean)