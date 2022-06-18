package com.example.notesapp.core

import android.view.View
import com.google.android.material.snackbar.Snackbar

fun snackbar(view: View, message: String){
    Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
}