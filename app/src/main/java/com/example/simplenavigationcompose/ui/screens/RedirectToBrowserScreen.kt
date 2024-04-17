package com.example.simplenavigationcompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme

@Composable
fun RedirectToBrowserScreen(
    redirectToBrowser: () -> Unit,
    popBackStack: () -> Unit
) {

    LaunchedEffect(key1 = Unit) {
        redirectToBrowser()
    }

    // crash!!!
    OnLifecycleEventHandler(
        onResume = { popBackStack() }
    )

    //working popBackStack
    /*
   OnLifecycleEventHandler(
        onResume = {
            Handler(Looper.getMainLooper()).post { popBackStack() }
        }
    )*/

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Redirect to external browser", fontSize = 40.sp)
    }
}

@Composable
fun OnLifecycleEventHandler(
    onResume: () -> Unit,
    onStop: (() -> Unit)? = null,
    onPause: (() -> Unit)? = null
) {
    val inspectionModeCurrent = LocalInspectionMode.current
    val lifecycleOwner = LocalLifecycleOwner.current
    val onResumeState = rememberUpdatedState(onResume)
    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            when (event) {
                Lifecycle.Event.ON_RESUME -> {
                    if (inspectionModeCurrent.not()) {
                        onResumeState.value.invoke()
                    }
                }

                Lifecycle.Event.ON_PAUSE -> {
                    if (inspectionModeCurrent.not()) {
                        onPause?.invoke()
                    }
                }

                Lifecycle.Event.ON_STOP -> {
                    if (inspectionModeCurrent.not()) {
                        onStop?.invoke()
                    }
                }

                else -> {}
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    SimpleNavComposeAppTheme(useSystemUiController = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            RedirectToBrowserScreen(
                redirectToBrowser = {},
                popBackStack = {}
            )
        }
    }
}