package  com.jawad.sons.joinVideos

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

abstract class BaseActivity : AppCompatActivity() {

    init {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

//    override fun attachBaseContext(newBase: Context?) {
//        super.attachBaseContext(LocaleHelper.onAttach(newBase, LocaleHelper.getLanguage(newBase)))
        //font
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onBaseCreate(savedInstanceState)
    }

    abstract fun onBaseCreate(savedInstanceState: Bundle?)

}