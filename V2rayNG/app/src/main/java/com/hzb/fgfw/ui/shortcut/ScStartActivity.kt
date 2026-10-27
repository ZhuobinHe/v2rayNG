package com.hzb.fgfw.ui.shortcut

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.hzb.fgfw.core.CoreServiceManager
import com.hzb.fgfw.core.LauncherManager
import com.hzb.fgfw.ui.base.BaseComponentActivity

class ScStartActivity : BaseComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @Composable
    override fun ScreenContent() {
        LaunchedEffect(Unit) {
            moveTaskToBack(true)
            if (!CoreServiceManager.isRunning()) {
                LauncherManager.startServiceFromToggle(this@ScStartActivity)
            }
            finish()
        }
    }
}
