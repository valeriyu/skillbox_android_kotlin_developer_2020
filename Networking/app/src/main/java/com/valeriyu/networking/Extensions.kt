package com.valeriyu.networking

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment

fun <T : Fragment> T.withArguments(action: Bundle.() -> Unit): T {
    return apply {
        arguments = Bundle().apply(action)
    }
}

fun <T : Activity?> T.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

/*fun <T : Activity?> T.println(text: String) {
    this?.runOnUiThread {
        consoleTextView.setText(consoleTextView.text.toString() + text + "\n")
    }
}
 */






