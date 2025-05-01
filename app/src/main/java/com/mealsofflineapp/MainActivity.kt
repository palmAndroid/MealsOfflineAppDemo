package com.mealsofflineapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Observer
import com.mealsofflineapp.ui.theme.MealsOfflineAppDemoTheme
import com.mealsofflineapp.utils.isNetworkAvailable
import com.mealsofflineapp.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.Koin
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.java.KoinJavaComponent.inject

class MainActivity : ComponentActivity() , KoinComponent{
    private val mainViewModel : MainViewModel by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            if(isNetworkAvailable(this)){
            mainViewModel.refreshData()
            }

            try {
                mainViewModel.categoriesList.observe(this) { data ->
                    data?.let {
                        it.forEach {
                            Log.d("ANKITA", "" + it.strCategory)
                        }
                    }
                }
            } catch (e: Exception) {
                e.stackTrace
            }

            MealsOfflineAppDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MealsOfflineAppDemoTheme {
        Greeting("Android")
    }
}